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

public class Table_Egg_IV_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__egg__iv_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwe13);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwe14);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwe15);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwe16);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> twentysecondProduct = new ArrayList<>();
        twentysecondProduct.add(new Product("มื้อเช้า: ไข่กระทะ+ขนมปังปิ้ง1แผ่น"));
        twentysecondProduct.add(new Product("มื้อเที่ยง: ก๋วยเตี๋ยวน้ำตกหมูพิเศษผักไม่ใส่กระเทียมเจียว"));
        twentysecondProduct.add(new Product("มื้อเย็น: สลัดแซลมอน"));

        Company twentysecond = new Company("วันที่22",twentysecondProduct);
        companies.add(twentysecond);

        ArrayList<Product> twentythirdProduct = new ArrayList<>();
        twentythirdProduct.add(new Product("มื้อเช้า: นมไขมันต่ำ+แซนวิชแฮม"));
        twentythirdProduct.add(new Product("มื้อเที่ยง: ข้าวหน้าปลาแซลมอนย่างเกลือ"));
        twentythirdProduct.add(new Product("มื้อเย็น: ยำวุ้นเส้น+น้ำเต้าหู้ไม่ใส่น้ำเชื่อม"));

        Company twentythird = new Company("วันที่23",twentythirdProduct);
        companies.add(twentythird);

        ArrayList<Product>twentyfourthProduct = new ArrayList<>();
        twentyfourthProduct.add(new Product("มื้อเช้า: น้ำเต้าหู้ใส่เครื่องไม่ใส่น้ำเชื่อม+ขนมปังปิ้ง1แผ่น"));
        twentyfourthProduct.add(new Product("มื้อเที่ยง: สเต๊กไก่พริกไทยดำ+ผักนึ่ง"));
        twentyfourthProduct.add(new Product("มื้อเย็น: ยำอกไก่ย่าง+ผลไม้"));

        Company twentyfourth = new Company("วันที่24",twentyfourthProduct);
        companies.add(twentyfourth);

        ArrayList<Product>twentyfifthProduct = new ArrayList<>();
        twentyfifthProduct.add(new Product("มื้อเข้า: ขนมปังปิ้งทาอโวคาโด2แผ่น+น้ำส้ม1แก้ว"));
        twentyfifthProduct.add(new Product("มื้อเที่ยง: ข้าวหน้าหมูอบน้ำผึ้ง"));
        twentyfifthProduct.add(new Product("มื้อเย็น: ซุปมันฝรั่งมะเขือ+อกไก่"));

        Company twentyfifth = new Company("วันที่25",twentyfifthProduct);
        companies.add(twentyfifth);

        ArrayList<Product>twentysixthProduct = new ArrayList<>();
        twentysixthProduct.add(new Product("มื้อเช้า: แซนวิชสลัดไข่"));
        twentysixthProduct.add(new Product("มื้อเที่ยง: ราดหน้าหมูหหมักเพิ่มผัก"));
        twentysixthProduct.add(new Product("มื้อเย็น: แกงเลียงกุ้งสด+ข้าวกล้อง"));

        Company twentysixth = new Company("วันที่26",twentysixthProduct);
        companies.add(twentysixth);

        ArrayList<Product>twentyseventhProduct = new ArrayList<>();
        twentyseventhProduct.add(new Product("มื้อเช้า: โจ๊กหมูสับไข่ลวก"));
        twentyseventhProduct.add(new Product("มื้อเที่ยง: กะเพรากุ้งไม่ใช้น้ำมัน+ข้าวกล้อง+ไข่ต้ม1ฟอง"));
        twentyseventhProduct.add(new Product("มื้อเย็น: สุกี้น้ำเส้นบุกทะเล"));

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
