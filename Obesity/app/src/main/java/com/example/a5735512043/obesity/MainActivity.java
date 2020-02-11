package com.example.a5735512043.obesity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView bmiIv, foodIv,tableIv,exerciseIv,graphIv,chatIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmiIv = (ImageView) findViewById(R.id.bmiIv);
        foodIv = (ImageView)findViewById(R.id.foodIv);
        tableIv = (ImageView)findViewById(R.id.tableIv);
        exerciseIv = (ImageView)findViewById(R.id.exerciseIv);
       // graphIv = (ImageView)findViewById(R.id.graphIv);
        chatIv = (ImageView)findViewById(R.id.chatIv);

        bmiIv.setOnClickListener(this);
        foodIv.setOnClickListener(this);
        tableIv.setOnClickListener(this);
        exerciseIv.setOnClickListener(this);
       // graphIv.setOnClickListener(this);
        chatIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == bmiIv){
            Intent intent = new Intent(this,BmiActivity.class);
            startActivity(intent);
        }
        if (view == foodIv) {
            Intent intent = new Intent(this, FoodsActivity.class);
            startActivity(intent);
        }
        if (view==exerciseIv){
            Intent intent=new Intent(this,ExerciseListActivity.class);
            startActivity(intent);
        }
       /* if (view==graphIv){
            Intent intent=new Intent(this,BmiFoodActivity.class);
            startActivity(intent);
        }*/
        if (view==chatIv){
            Intent intent=new Intent(this,ChatActivity.class);
            startActivity(intent);
        }
        if (view==tableIv){

            Intent intent=new Intent(this,CaloriesActivity.class);
            startActivity(intent);
        }

    }
}
