package com.example.a5735512043.obesity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BmiFoodActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    FirebaseDatabase database;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_food);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("BMI Standard");

        recyclerView = (RecyclerView)findViewById(R.id.bmirecyclerview);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Dietfood");

        showRecyclerView();

    }

    private void showRecyclerView() {
        FirebaseRecyclerAdapter<ModelTable,ViewHolderTable>firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<ModelTable, ViewHolderTable>(
                        ModelTable.class,
                        R.layout.row_table,
                        ViewHolderTable.class,
                        databaseReference

                ) {
                    @Override
                    protected void populateViewHolder(ViewHolderTable viewHolder, ModelTable model, int position) {
                        viewHolder.setDetails(getApplicationContext(),model.getBreakfast(),model.getLunch(),model.getDinner());
                    }
                };
        //set adapter to recyclerview
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
