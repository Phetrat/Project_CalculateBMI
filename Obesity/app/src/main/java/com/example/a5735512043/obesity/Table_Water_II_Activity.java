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

public class Table_Water_II_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__water__ii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvww5);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvww6);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvww7);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvww8);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> eighthProduct = new ArrayList<>();
        eighthProduct.add(new Product("มื้อเช้า: ไข่ต้ม2ฟอง+มะละกอ1ชิ้น"));
        eighthProduct.add(new Product("มื้อเที่ยง: สลัดมะเขือเทศ+ไข่ต้ม2ฟอง"));
        eighthProduct.add(new Product("มื้อเย็น: ผักต้มและอกไก่"));

        Company eighth = new Company("วันที่8",eighthProduct);
        companies.add(eighth);

        ArrayList<Product> ninthProduct = new ArrayList<>();
        ninthProduct.add(new Product("มื้อเช้า: ไข่ต้ม2ฟอง+ส้ม1ลูก"));
        ninthProduct.add(new Product("มื้อเที่ยง: สลัดผักและอกไก่"));
        ninthProduct.add(new Product("มื้อเย็น: ไข่ต้ม2ฟอง+สลัดผัก+ส้ม1ลูก"));

        Company ninth = new Company("วันที่9",ninthProduct);
        companies.add(ninth);

        ArrayList<Product>tenthProduct = new ArrayList<>();
        tenthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+มะละกอ1ชิ้น"));
        tenthProduct.add(new Product("มื้อเที่ยง: สลัดผัก+ปลานึ่ง"));
        tenthProduct.add(new Product("มื้อเย็น: ไข่ต้ม1ฟอง+ผักต้ม"));

        Company tenth = new Company("วันที่10",tenthProduct);
        companies.add(tenth);

        ArrayList<Product>eleventhProduct = new ArrayList<>();
        eleventhProduct.add(new Product("มื้อเข้า: ไข่ต้ม1ฟอง+แอปเปิ้ล1ลูก"));
        eleventhProduct.add(new Product("มื้อเที่ยง: สลัดผักและอกไก่"));
        eleventhProduct.add(new Product("มื้อเย็น: ไข่ต้ม2ฟอง+สลัดผัก+แอปเปิ้ล1ลูก"));

        Company eleventh = new Company("วันที่11",eleventhProduct);
        companies.add(eleventh);

        ArrayList<Product>twenlfthProduct = new ArrayList<>();
        twenlfthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+กีวี1ลูก"));
        twenlfthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ปลาย่างน้ำจิ้มแจ๋ว"));
        twenlfthProduct.add(new Product("มื้อเย็น: นมจืดใส่แอลมอน อโวคาโด งาดำ"));

        Company twenlfth = new Company("วันที่12",twenlfthProduct);
        companies.add(twenlfth);

        ArrayList<Product>thirteenthProduct = new ArrayList<>();
        thirteenthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+กล้วยหอม1ลูก"));
        thirteenthProduct.add(new Product("มื้อเที่ยง: สลัดผัก+ไข่ต้ม2ฟอง"));
        thirteenthProduct.add(new Product("มื้อเย็น: สลัดทูน่า+ผลไม้ตามใจชอบ"));

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
            Intent intent = new Intent(this, Table_Water_Activity.class);
            startActivity(intent);
        }

        if (view == w2) {
            Intent intent = new Intent(this,Table_Water_II_Activity.class);
            startActivity(intent);

        }
        if (view == w3){
            Intent intent = new Intent(this,Table_Water_III_Activity.class);
            startActivity(intent);
        }
        if (view == w4){
            Intent intent = new Intent(this,Table_Water_IV_Activity.class);
            startActivity(intent);
        }
    }
}
