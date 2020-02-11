package com.example.a5735512043.obesity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TableFatActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_fat);

        //ActionBar
        ActionBar actionBar = getSupportActionBar();
        //set title
        actionBar.setTitle("FatFoods");

        //RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewTableFat);
        mRecyclerView.setHasFixedSize(true);

        //set layout as LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Egg");

    }

    //load data into recycler view onstart

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<ModelTable,ViewHolderTable> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<ModelTable, ViewHolderTable>(
                        ModelTable.class,
                        R.layout.row_table,
                        ViewHolderTable.class,
                        mRef
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolderTable viewHolder, ModelTable model, int position) {
                        viewHolder.setDetails(getApplicationContext(),model.getBreakfast(),model.getLunch(),model.getDinner());
                    }
                };
        //set adapter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
