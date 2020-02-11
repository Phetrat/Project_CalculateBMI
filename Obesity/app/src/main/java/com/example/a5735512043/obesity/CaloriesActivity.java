package com.example.a5735512043.obesity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CaloriesActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nbreackfast,nlunch,ndinner,cbreakfast,clunch,cdinner;
    private Button add;


    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("เพิ่มเมนูอาหาร");

        nbreackfast = (EditText) findViewById(R.id.breakfastname);
        nlunch = (EditText)findViewById(R.id.lunchname);
        ndinner = (EditText)findViewById(R.id.dinnername);




        add = (Button)findViewById(R.id.add);
        add.setOnClickListener(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.kcalRecyclerview);
        mRecyclerView.setHasFixedSize(true);

        //set layout as LinerLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //send Query to FirebaseDatabase
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Kcal");

        showItemview();
    }

    private void showItemview() {
        FirebaseRecyclerAdapter<CaloriesHolder, ViewHolderTable> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<CaloriesHolder, ViewHolderTable>(
                        CaloriesHolder.class,
                        R.layout.row_table,
                        ViewHolderTable.class,
                        mRef
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolderTable viewHolder, CaloriesHolder model, int position) {
                        viewHolder.setDetails(getApplicationContext(),model.getDinner(),model.getLunch(),model.getBreakfast());
                    }
                };

        //set adapter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }


    @Override
    public void onClick(View view) {

        if (view == add){
            AddKilocal();
        }
    }

    private void AddKilocal() {
        String breakfast = nbreackfast.getText().toString().trim();
        String lunch = nlunch.getText().toString().trim();
        String dinner = ndinner.getText().toString().trim();


        if(!TextUtils.isEmpty(breakfast)||!TextUtils.isEmpty(lunch)) {
                String id = mRef.push().getKey();
                CaloriesHolder modelholder = new CaloriesHolder(breakfast,lunch,dinner);
                mRef.child(id).setValue(modelholder);

        }

        if(TextUtils.isEmpty(dinner)){
            Toast.makeText(this,"กรุณาใส่ข้อมูลให้ครบถ้วน",Toast.LENGTH_SHORT).show();
        }
    }
}
