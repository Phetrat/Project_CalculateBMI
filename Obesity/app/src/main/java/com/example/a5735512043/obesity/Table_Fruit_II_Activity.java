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

public class Table_Fruit_II_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__fruit__ii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwf5);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwf6);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwf7);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwf8);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> eighthProduct = new ArrayList<>();
        eighthProduct.add(new Product("มื้อเช้า:  ซุปไข่+ส้ม1ลูก"));
        eighthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+แกงจืดอกไก่เต้าหู้+ลูกแพร์1ลูก"));
        eighthProduct.add(new Product("มื้อเย็น: สลัดผลไม้น้ำใส"));

        Company eighth = new Company("วันที่8",eighthProduct);
        companies.add(eighth);

        ArrayList<Product> ninthProduct = new ArrayList<>();
        ninthProduct.add(new Product("มื้อเช้า: ข้าวต้มปลา"));
        ninthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ยำอกไก่+กล้วยปิ้ง1ลูก"));
        ninthProduct.add(new Product("มื้อเย็น: ไข่ตุ๋น+กล้วยหอม1ลูก"));

        Company ninth = new Company("วันที่9",ninthProduct);
        companies.add(ninth);

        ArrayList<Product>tenthProduct = new ArrayList<>();
        tenthProduct.add(new Product("มื้อเช้า: แซนวิชไข่ดาวอโวคาโด"));
        tenthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ลาบอกไก่+แตงโม"));
        tenthProduct.add(new Product("มื้อเย็น: ต้มจืดสาหร่ายใส่เต้าหู้+สับปรด"));

        Company tenth = new Company("วันที่10",tenthProduct);
        companies.add(tenth);

        ArrayList<Product>eleventhProduct = new ArrayList<>();
        eleventhProduct.add(new Product("มื้อเข้า: ข้าวสวย+ซุปเห็ดใส+มะละกอ"));
        eleventhProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ต้มยำทะเลน้ำใส+แตงโม"));
        eleventhProduct.add(new Product("มื้อเย็น: เห็ดย่าง+ฟักทองต้ม"));

        Company eleventh = new Company("วันที่11",eleventhProduct);
        companies.add(eleventh);

        ArrayList<Product>twenlfthProduct = new ArrayList<>();
        twenlfthProduct.add(new Product("มื้อเช้า: ข้าวสวย+ต้มจืดฝัก+กีวี1ลูก"));
        twenlfthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ยำไขต้ม+น้ำมะพร้าว"));
        twenlfthProduct.add(new Product("มื้อเย็น: นมจืด1แก้ว+กล้วยหอม1ลูก"));

        Company twenlfth = new Company("วันที่12",twenlfthProduct);
        companies.add(twenlfth);

        ArrayList<Product>thirteenthProduct = new ArrayList<>();
        thirteenthProduct.add(new Product("มื้อเช้า: มันบด+แอปเปิล1ลูก"));
        thirteenthProduct.add(new Product("มื้อเที่ยง: สลัดอกไก่ย่างลอกหนักออก+ส้มโอ"));
        thirteenthProduct.add(new Product("มื้อเย็น: องุ่นฝรั่งทรงเครื่อง"));

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
            Intent intent = new Intent(this, Table_Fruit_Activity.class);
            startActivity(intent);
        }

        if (view == w2) {
            Intent intent = new Intent(this,Table_Fruit_II_Activity.class);
            startActivity(intent);

        }
        if (view == w3){
            Intent intent = new Intent(this,Table_Fruit_IIIActivity.class);
            startActivity(intent);
        }
        if (view == w4){
            Intent intent = new Intent(this,Table_Fruit_IV_Activity.class);
            startActivity(intent);
        }
    }
}
