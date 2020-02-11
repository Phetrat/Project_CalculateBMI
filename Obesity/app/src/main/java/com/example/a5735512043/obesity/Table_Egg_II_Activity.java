package com.example.a5735512043.obesity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Table_Egg_II_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__egg__ii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwe5);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwe6);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwe7);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwe8);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> eighthProduct = new ArrayList<>();
        eighthProduct.add(new Product("มื้อเช้า: น้ำเต้าหู้ไม่ใส่น้ำตาล+ขนมปัง1แผ่น"));
        eighthProduct.add(new Product("มื้อเที่ยง: แกงจืดเต้าหู้ลูกชิ้น+ข้าวกล้อง"));
        eighthProduct.add(new Product("มื้อเย็น: อกไก่ย่าง+สลัดผัก"));

        Company eighth = new Company("วันที่8",eighthProduct);
        companies.add(eighth);

        ArrayList<Product> ninthProduct = new ArrayList<>();
        ninthProduct.add(new Product("มื้อเช้า: โยเกิร์ตLow Fat+ผลไม้ตามชอบ"));
        ninthProduct.add(new Product("มื้อเที่ยง: ข้าวไม่มันอกไก่+แกงจืด"));
        ninthProduct.add(new Product("มื้อเย็น: ยำเห็ดรวมมิตร+นมจืด1แก้ว"));

        Company ninth = new Company("วันที่9",ninthProduct);
        companies.add(ninth);

        ArrayList<Product>tenthProduct = new ArrayList<>();
        tenthProduct.add(new Product("มื้อเช้า: แกงจืดเต้าหู้หมูสับ+ข้าวกล้อง"));
        tenthProduct.add(new Product("มื้อเที่ยง: สปาเกตตี้อกไก่เส้นโฮลวีต"));
        tenthProduct.add(new Product("มื้อเย็น: ยำไข่ต้ม+นมถั่วเหลือง1กล่อง"));

        Company tenth = new Company("วันที่10",tenthProduct);
        companies.add(tenth);

        ArrayList<Product>eleventhProduct = new ArrayList<>();
        eleventhProduct.add(new Product("มื้อเข้า: แซนวิชทูน่าใช้มายองเนสไขมันต่ำ+น้ำส้ม1แก้ว"));
        eleventhProduct.add(new Product("มื้อเที่ยง: น้ำตกอกไก่+ข้าวกล้อง+ผักสด"));
        eleventhProduct.add(new Product("มื้อเย็น: สลัดผัก+ไข่ต้ม1ฟอง"));

        Company eleventh = new Company("วันที่11",eleventhProduct);
        companies.add(eleventh);

        ArrayList<Product>twenlfthProduct = new ArrayList<>();
        twenlfthProduct.add(new Product("มื้อเช้า: เฟรนซ์โทสต์คลีน2แผ่น+นมจืด1แก้ว"));
        twenlfthProduct.add(new Product("มื้อเที่ยง: ผัดผักใส่กุ้ง+ข้าวกล้อง"));
        twenlfthProduct.add(new Product("มื้อเย็น: ปลาลวกจิ้มผักต้ม+ข้าวถ้วยเล็ก"));

        Company twenlfth = new Company("วันที่12",twenlfthProduct);
        companies.add(twenlfth);

        ArrayList<Product>thirteenthProduct = new ArrayList<>();
        thirteenthProduct.add(new Product("มื้อเช้า: เกาเหลาเลือดหมู+ข้าวกล้อง"));
        thirteenthProduct.add(new Product("มื้อเที่ยง: สเต๊กไก่เทริยากิ+ผักนึ่ง"));
        thirteenthProduct.add(new Product("มื้อเย็น: ต้มผัก+นมสด1กล่อง"));

        Company thirteenth = new Company("วันที่13",thirteenthProduct);
        companies.add(thirteenth);

        ArrayList<Product>fourteenthProduct = new ArrayList<>();
        fourteenthProduct.add(new Product("Cheat Day"));

        Company fourteenth = new Company("วันที่14",fourteenthProduct);
        companies.add(fourteenth);

        ProductAdapter adapter = new ProductAdapter(companies);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view == w1) {
            Intent intent = new Intent(this, Table_Egg_Activity.class);
            startActivity(intent);
        }

        if (view == w2) {
            Intent intent = new Intent(this,Table_Egg_II_Activity.class);
            startActivity(intent);

        }
        if (view == w3){
            Intent intent = new Intent(this,Table_Egg_III_Activity.class);
            startActivity(intent);
        }
        if (view == w4){
            Intent intent = new Intent(this,Table_Egg_IV_Activity.class);
            startActivity(intent);
        }

    }
}
