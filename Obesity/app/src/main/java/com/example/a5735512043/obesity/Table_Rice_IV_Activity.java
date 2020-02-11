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

public class Table_Rice_IV_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__rice__iv_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwr13);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwr14);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwr15);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwr16);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> twentysecondProduct = new ArrayList<>();
        twentysecondProduct.add(new Product("มื้อเช้า: เกี๊ยวซ่า5ชิ้น"));
        twentysecondProduct.add(new Product("มื้อเที่ยง: เบอร์เกอร์หมู"));
        twentysecondProduct.add(new Product("snack: ผลไม้ที่ชอบ"));
        twentysecondProduct.add(new Product("มื้อเย็น: ปีกไก่ทอด3ชิ้น"));

        Company twentysecond = new Company("วันที่22",twentysecondProduct);
        companies.add(twentysecond);

        ArrayList<Product> twentythirdProduct = new ArrayList<>();
        twentythirdProduct.add(new Product("มื้อเช้า: โจ๊กหมูใส่ไข่ลวก"));
        twentythirdProduct.add(new Product("มื้อเที่ยง: ผัดซีอิ๊วทะเล"));
        twentythirdProduct.add(new Product("snack: โยเกิร์ต+กราโนล่า+น้ำผึ้ง"));
        twentythirdProduct.add(new Product("มื้อเย็น: ข้าวกล้อง2ทัพพี+แกงส้มผักรวม"));

        Company twentythird = new Company("วันที่23",twentythirdProduct);
        companies.add(twentythird);

        ArrayList<Product>twentyfourthProduct = new ArrayList<>();
        twentyfourthProduct.add(new Product("มื้อเช้า: ข้าวเหนียวไก่ทอด"));
        twentyfourthProduct.add(new Product("มื้อเที่ยง: ก๋วยเตี๋ยวเส้นใหญ่ลูกชิ้นน้ำ1ชาม"));
        twentyfourthProduct.add(new Product("snack: มะขามหวาน5ฝัก"));
        twentyfourthProduct.add(new Product("มื้อเย็น: ข้าวสวย2ทัพพี+ต้มจับฉ่าย"));

        Company twentyfourth = new Company("วันที่24",twentyfourthProduct);
        companies.add(twentyfourth);

        ArrayList<Product>twentyfifthProduct = new ArrayList<>();
        twentyfifthProduct.add(new Product("มื้อเข้า: ข้าวกล้องต้ม+ผัดผักบุ้ง"));
        twentyfifthProduct.add(new Product("มื้อเที่ยง: ข้าวกะเพราหมู1จาน"));
        twentyfifthProduct.add(new Product("snack: แอปเปิ้ล1ลูก+นมไขมันต่ำ1กล่อง"));
        twentyfifthProduct.add(new Product("มื้อเย็น: บะหมี่ต้มยำ1ชาม"));

        Company twentyfifth = new Company("วันที่25",twentyfifthProduct);
        companies.add(twentyfifth);

        ArrayList<Product>twentysixthProduct = new ArrayList<>();
        twentysixthProduct.add(new Product("มื้อเช้า: ข้าวเหนียวหมูฝอยทอด"));
        twentysixthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ผัดเปรี้ยวหวานไก่+แอปเปิล 1ลูก"));
        twentysixthProduct.add(new Product("snack: ข้าวโพดคุกมะพร้าวขูด"));
        twentysixthProduct.add(new Product("มื้อเย็น: ข้าวหน้าไก่เทอริยากิ"));

        Company twentysixth = new Company("วันที่26",twentysixthProduct);
        companies.add(twentysixth);

        ArrayList<Product>twentyseventhProduct = new ArrayList<>();
        twentyseventhProduct.add(new Product("มื้อเช้า: โจ๊กหมูสับไข่ลวก"));
        twentyseventhProduct.add(new Product("มื้อเที่ยง: กะเพรากุ้ง+ข้าวกล้อง+ไข่ต้ม1ฟอง"));
        twentyseventhProduct.add(new Product("snack: เฉาก๊วย1แก้ว"));
        twentyseventhProduct.add(new Product("มื้อเย็น: สุกี้น้ำทะเล"));

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
