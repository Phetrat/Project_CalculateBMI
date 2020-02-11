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

public class Table_Rice_II_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__rice__ii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwr5);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwr6);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwr7);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwr8);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> eighthProduct = new ArrayList<>();
        eighthProduct.add(new Product("มื้อเช้า: ซาลาเปาไส้หมู 1ลูก"));
        eighthProduct.add(new Product("มื้อเที่ยง: ข้าวหมูกรอบ 1จาน"));
        eighthProduct.add(new Product("snack: ถั่วอบเกลือ1ห่อ"));
        eighthProduct.add(new Product("มื้อเย็น: เย็นตาโฟ 1ชาม"));

        Company eighth = new Company("วันที่8",eighthProduct);
        companies.add(eighth);

        ArrayList<Product> ninthProduct = new ArrayList<>();
        ninthProduct.add(new Product("มื้อเช้า: ขนมจีบหมู 4ชิ้น"));
        ninthProduct.add(new Product("มื้อเที่ยง: ข้าวผัดกะเพราไก่"));
        ninthProduct.add(new Product("snack: เค้กช็อคโกแลต 1 ชิ้น"));
        ninthProduct.add(new Product("มื้อเย็น: ข้าวไข่เจียว 1จาน"));

        Company ninth = new Company("วันที่9",ninthProduct);
        companies.add(ninth);

        ArrayList<Product>tenthProduct = new ArrayList<>();
        tenthProduct.add(new Product("มื้อเช้า: หมูปิ้ง4ไม้"));
        tenthProduct.add(new Product("มื้อเที่ยง: ข้าวผัดหมูใส่ไข่1จาน"));
        tenthProduct.add(new Product("snack: เอแคลร์3ลูก"));
        tenthProduct.add(new Product("มื้อเย็น: กระเพาะปลา1ชาม"));

        Company tenth = new Company("วันที่10",tenthProduct);
        companies.add(tenth);

        ArrayList<Product>eleventhProduct = new ArrayList<>();
        eleventhProduct.add(new Product("มื้อเข้า:  โจ๊กใส่ไข่1ชาม"));
        eleventhProduct.add(new Product("มื้อเที่ยง: ข้าวผัดกุนเชียง1จาน"));
        eleventhProduct.add(new Product("snack: มันทิพย์ปิ้ง"));
        eleventhProduct.add(new Product("มื้อเย็น: กุ้งผัดพริกอ่น1จาน"));

        Company eleventh = new Company("วันที่11",eleventhProduct);
        companies.add(eleventh);

        ArrayList<Product>twenlfthProduct = new ArrayList<>();
        twenlfthProduct.add(new Product("มื้อเช้า:  ขนมปังมะพร้าว1ชิ้น"));
        twenlfthProduct.add(new Product("มื้อเที่ยง: ข้าวมันไก่1จาน"));
        twenlfthProduct.add(new Product("snack: อวันติน ร้อน/เย็น 1แก้ว"));
        twenlfthProduct.add(new Product("มื้อเย็น: ยำปลาดุกฟู"));

        Company twenlfth = new Company("วันที่12",twenlfthProduct);
        companies.add(twenlfth);

        ArrayList<Product>thirteenthProduct = new ArrayList<>();
        thirteenthProduct.add(new Product("มื้อเช้า: แกงจืดเต้าหู้ยัดไส้"));
        thirteenthProduct.add(new Product("มื้อเที่ยง: ข้าวซอยไก่"));
        thirteenthProduct.add(new Product("snack: ลูกชุบ 4ชิ้น"));
        thirteenthProduct.add(new Product("มื้อเย็น:  ยำมาม่า1จาน"));

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
            Intent intent = new Intent(this, Table_Rice_Activity.class);
            startActivity(intent);
        }

        if (view == w2) {
            Intent intent = new Intent(this,Table_Rice_II_Activity.class);
            startActivity(intent);

        }
        if (view == w3){
            Intent intent = new Intent(this,Table_Rice_III_Activity.class);
            startActivity(intent);
        }
        if (view == w4){
            Intent intent = new Intent(this,Table_Rice_IV_Activity.class);
            startActivity(intent);
        }
    }
}
