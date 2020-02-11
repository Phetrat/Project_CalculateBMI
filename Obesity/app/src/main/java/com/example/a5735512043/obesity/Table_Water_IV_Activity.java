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

public class Table_Water_IV_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__water__iv_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvww13);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvww14);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvww15);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvww16);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> twentysecondProduct = new ArrayList<>();
        twentysecondProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ลูกพีช1ลูก"));
        twentysecondProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ลาบอกไก่"));
        twentysecondProduct.add(new Product("มื้อเย็น: ผักต้มน้ำพริก"));

        Company twentysecond = new Company("วันที่22",twentysecondProduct);
        companies.add(twentysecond);

        ArrayList<Product> twentythirdProduct = new ArrayList<>();
        twentythirdProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+มะละกอ1ชิ้น"));
        twentythirdProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง + อกไก่ผัดพริกไทยดำ"));
        twentythirdProduct.add(new Product("มื้อเย็น: สลัดอะโวคาโดไข่ขาว"));

        Company twentythird = new Company("วันที่23",twentythirdProduct);
        companies.add(twentythird);

        ArrayList<Product>twentyfourthProduct = new ArrayList<>();
        twentyfourthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ส้ม1ลูก"));
        twentyfourthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+อกไก่พะโล้"));
        twentyfourthProduct.add(new Product("มื้อเย็น: สลัดผักน้ำใส+น้ำผลไม้ปั่นไม่หวาน1แก้ว"));

        Company twentyfourth = new Company("วันที่24",twentyfourthProduct);
        companies.add(twentyfourth);

        ArrayList<Product>twentyfifthProduct = new ArrayList<>();
        twentyfifthProduct.add(new Product("มื้อเข้า: ไข่ต้ม1ฟอง+น้ำฝรั่งปั่น1แก้ว"));
        twentyfifthProduct.add(new Product("มื้อเที่ยง: ไข่ต้ม2ฟอง+น้ำพริกผักต้ม"));
        twentyfifthProduct.add(new Product("มื้อเย็น: ปลานึ่งครึ่งซีก(ตัวเล็ก)"));

        Company twentyfifth = new Company("วันที่25",twentyfifthProduct);
        companies.add(twentyfifth);

        ArrayList<Product>twentysixthProduct = new ArrayList<>();
        twentysixthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ส้ม1ลูก"));
        twentysixthProduct.add(new Product("มื้อเที่ยง: อกไก่อบอัลมอนด์"));
        twentysixthProduct.add(new Product("มื้อเย็น: ไข่ต้ม1ฟอง+สลัดผัก"));

        Company twentysixth = new Company("วันที่26",twentysixthProduct);
        companies.add(twentysixth);

        ArrayList<Product>twentyseventhProduct = new ArrayList<>();
        twentyseventhProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+กีวี1ลูก"));
        twentyseventhProduct.add(new Product("มื้อเที่ยง: ข้าวกล้องคุกสับปะรดใส่อกไก่"));
        twentyseventhProduct.add(new Product("มื้อเย็น: สลัดผักน้ำใส"));

        Company twentyseven = new Company("วันที่27",twentyseventhProduct);
        companies.add(twentyseven);

        ArrayList<Product>twentyeighthProduct = new ArrayList<>();
        twentyeighthProduct.add(new Product("Cheat Day"));

        Company twentyeighth = new Company("วันที่28",twentyeighthProduct);
        companies.add(twentyeighth);

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
