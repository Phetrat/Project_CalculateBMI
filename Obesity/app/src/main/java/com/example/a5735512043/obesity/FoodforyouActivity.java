package com.example.a5735512043.obesity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FoodforyouActivity extends AppCompatActivity {
     RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase,dFirebaseDatabase,nFirebaseDatabase;
    DatabaseReference eRef,dRef,nRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodforyou);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        //set title
        actionBar.setTitle("FoodforYou");

        /* Bundle bundle = getIntent().getExtras();
        float bmi = bundle.getFloat("BMI"); */

        mRecyclerView = (RecyclerView)findViewById(R.id.foodyou);
        mRecyclerView.setHasFixedSize(true);

        //set layout as LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        //send Query to FirebaseDatabase
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        eRef = mFirebaseDatabase.getReference("Egg");
       /*  dFirebaseDatabase = FirebaseDatabase.getInstance();
        dRef = dFirebaseDatabase.getReference("Dietfood");
        nFirebaseDatabase = FirebaseDatabase.getInstance();
        nRef =nFirebaseDatabase.getReference("Fruitfood");
        */

        //Foodforyou(bmi);
        Foodforyou();



    }

    private void Foodforyou() {
        FirebaseRecyclerAdapter<ModelTable,ViewHolderTable>firebaseRecyclerAdapter=
                new FirebaseRecyclerAdapter<ModelTable, ViewHolderTable>(
                        ModelTable.class,
                        R.layout.row_food,
                        ViewHolderTable.class,
                        eRef
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolderTable viewHolder, ModelTable model, int position) {

                    }
                };

        //set adapter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    /* private void Foodforyou(float bmi) {
        if (Float.compare(bmi,18.5f)<=0){
        }
        else if (Float.compare(bmi,18.5f)>0 && Float.compare(bmi,22.9f)<= 0){
            FirebaseRecyclerAdapter<ModelTable, ViewHolderTable> firebaseRecyclerAdapter =
                    new FirebaseRecyclerAdapter<ModelTable, ViewHolderTable>(
                            ModelTable.class,
                            R.layout.row_table,
                            ViewHolderTable.class,
                            dRef
                    ) {
                        @Override
                        protected void populateViewHolder(ViewHolderTable viewHolder, ModelTable model, int position) {
                            viewHolder.setDetails(getApplicationContext(), model.getDay(), model.getBreakfast(), model.getLunch(), model.getDinner());
                        }
                    };

            //set adapter to recyclerview
            mRecyclerView.setAdapter(firebaseRecyclerAdapter);

        }
        else if (Float.compare(bmi,22.9f)>0 && Float.compare(bmi,30f)<=0){
            FirebaseRecyclerAdapter<ModelTable, ViewHolderTable> firebaseRecyclerAdapter =
                    new FirebaseRecyclerAdapter<ModelTable, ViewHolderTable>(
                            ModelTable.class,
                            R.layout.row_table,
                            ViewHolderTable.class,
                            nRef
                    ) {
                        @Override
                        protected void populateViewHolder(ViewHolderTable viewHolder, ModelTable model, int position) {
                            viewHolder.setDetails(getApplicationContext(), model.getDay(), model.getBreakfast(), model.getLunch(), model.getDinner());
                        }
                    };

            //set adapter to recyclerview
            mRecyclerView.setAdapter(firebaseRecyclerAdapter);

        }
        else {
            FirebaseRecyclerAdapter<ModelTable, ViewHolderTable> firebaseRecyclerAdapter =
                    new FirebaseRecyclerAdapter<ModelTable, ViewHolderTable>(
                            ModelTable.class,
                            R.layout.row_table,
                            ViewHolderTable.class,
                            eRef
                    ) {
                        @Override
                        protected void populateViewHolder(ViewHolderTable viewHolder, ModelTable model, int position) {
                            viewHolder.setDetails(getApplicationContext(), model.getDay(), model.getBreakfast(), model.getLunch(), model.getDinner());
                        }
                    };

            //set adapter to recyclerview
            mRecyclerView.setAdapter(firebaseRecyclerAdapter);

        }

    }
    */


}
