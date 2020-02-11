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

public class Table_Water_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__water_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvww1);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvww2);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvww3);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvww4);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<Company> companies = new ArrayList<>();


        ArrayList<Product> googleProduct = new ArrayList<>();
        googleProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ส้ม1ลูก"));
        googleProduct.add(new Product("มื้อเที่ยง: ขนมปังโฮลวีต2แผ่น+ผลไม้เล็กน้อย"));
        googleProduct.add(new Product("มื้อเย็น: สลัดผักอกไก่"));

        Company google = new Company("วันที่1", googleProduct);
        companies.add(google);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+แอปเปิ้ล1ลูก"));
        microsoftProduct.add(new Product("มื้อเที่ยง: สลัดผักใบเขียวและอกไก่"));
        microsoftProduct.add(new Product("มื้อเย็น: สลัดผัก+ส้ม1ลูก+ไข่ต้ม2ฟอง"));

        Company microfoft = new Company("วันที่2", microsoftProduct);
        companies.add(microfoft);


        ArrayList<Product> dinerProdect = new ArrayList<>();
        dinerProdect.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+กล้วยหอม1ลูก"));
        dinerProdect.add(new Product("มื้อเที่ยง: สลัดผักและอกไก่"));
        dinerProdect.add(new Product("มื้อเย็น: โยเกิร์ตLow-Fat+มะเขือเทศ1ลูก+ขนมปังโฮลวีต1แผ่น"));

        Company dinner = new Company("วันที่3", dinerProdect);
        companies.add(dinner);


        ArrayList<Product> fourthProduct = new ArrayList<>();
        fourthProduct.add(new Product("มื้อเข้า: ไข่ต้ม1ฟอง+ลูกแพร์1ลูก"));
        fourthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้องไข่ทูน่า+น้ำแตงโมปั่นไม่หวาน"));
        fourthProduct.add(new Product("มื้อเย็น: ผักต้ม+ไข่ต้ม1ฟอง"));

        Company fourth = new Company("วันที่4", fourthProduct);
        companies.add(fourth);

        ArrayList<Product> fifthProduct = new ArrayList<>();
        fifthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+กีวี1ลูก"));
        fifthProduct.add(new Product("มื้อเที่ยง: ข้าวคลุกไข่เจียวปูอัด อกไก่ย่าง ราดด้วยเสาวรส"));
        fifthProduct.add(new Product("มื้อเย็น: ปลานึ่ง"));

        Company fifth = new Company("วันที่5", fifthProduct);
        companies.add(fifth);

        ArrayList<Product> sixthProduct = new ArrayList<>();
        sixthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ลูกพีช2ลูก"));
        sixthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ผักต้มน้ำพริก"));
        sixthProduct.add(new Product("มื้อเย็น: โยเกิร์ตLow-Fat+ผลไม้ตามใจชอบ"));

        Company sixth = new Company("วันที่6", sixthProduct);
        companies.add(sixth);

        ArrayList<Product> seventhProduct = new ArrayList<>();
        seventhProduct.add(new Product("Cheat Day"));

        Company seventh = new Company("วันที่7", seventhProduct);
        companies.add(seventh);

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
