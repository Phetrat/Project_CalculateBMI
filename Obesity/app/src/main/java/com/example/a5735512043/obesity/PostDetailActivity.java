package com.example.a5735512043.obesity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostDetailActivity extends AppCompatActivity {
    TextView mNameTv, mDetailTv;
    ImageView mImageIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        //Action bar
        ActionBar actionBar = getSupportActionBar();
        //Actionbar title
        actionBar.setTitle("Menu Detail");
        //set back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        //initialize views
        mNameTv = (TextView)findViewById(R.id.NameTv);
        mDetailTv = (TextView)findViewById(R.id.DescriptionTv);
        mImageIv = (ImageView)findViewById(R.id.ImageView);

        //get data from intent
        byte[] bytes = getIntent().getByteArrayExtra("image");
        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("description");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes,0,bytes.length);

        //set data to views
        mNameTv.setText(name);
        mDetailTv.setText(desc);
        mImageIv.setImageBitmap(bmp);
    }

    //handle onBackPressend (go to previous activity)


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
