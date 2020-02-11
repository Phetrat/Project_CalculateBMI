package com.example.a5735512043.obesity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodsActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mainfoodsIv, linefoodsIv,fruitIv,snackIv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ประเภทอาหาร");

        mainfoodsIv =(ImageView)findViewById(R.id.mainfoodIv);
        linefoodsIv = (ImageView)findViewById(R.id.linefoodIv);
        fruitIv = (ImageView)findViewById(R.id.fruitIv);
        snackIv = (ImageView)findViewById(R.id.snackIv);


        mainfoodsIv.setOnClickListener(this);
        linefoodsIv.setOnClickListener(this);
        fruitIv.setOnClickListener(this);
        snackIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mainfoodsIv ){
            Intent intent = new Intent(this,FoodListActivity.class);
            startActivity(intent);
        }

        if (view == linefoodsIv ){
            Intent intent = new Intent(this,LineListActivity.class);
            startActivity(intent);
        }

        if (view == fruitIv ){
            Intent intent = new Intent(this,FruitListActivity.class);
            startActivity(intent);
        }

        if (view == snackIv ){
            Intent intent = new Intent(this,SnackListActivity.class);
            startActivity(intent);
        }

    }
}
