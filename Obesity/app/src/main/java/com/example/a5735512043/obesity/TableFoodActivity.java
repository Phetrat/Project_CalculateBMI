package com.example.a5735512043.obesity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableFoodActivity extends AppCompatActivity implements View.OnClickListener {
Button btnAgg,btnDiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_food);

        //ActionBar
        ActionBar actionBar = getSupportActionBar();
        //set title
        actionBar.setTitle("TableFoods");

        btnAgg = (Button)findViewById(R.id.btnAgg);
        btnAgg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btnAgg){
            Intent intent = new Intent(this,CaloriesActivity.class);
            startActivity(intent);
        }
    }
}
