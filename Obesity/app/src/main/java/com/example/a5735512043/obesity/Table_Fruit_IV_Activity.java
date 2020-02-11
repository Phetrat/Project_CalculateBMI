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

public class Table_Fruit_IV_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__fruit__iv_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwf13);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwf14);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwf15);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwf16);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> twentysecondProduct = new ArrayList<>();
        twentysecondProduct.add(new Product("มื้อเช้า: ขนมปังไข่คนทูน่า2แผ่น"));
        twentysecondProduct.add(new Product("มื้อเที่ยง: กล้วยต้ม+มันเทศต้ม+น้ำจืด1แก้ว"));
        twentysecondProduct.add(new Product("มื้อเย็น: สุกี้แห้ง(เน้นผัก)+บลูเบอรี่"));

        Company twentysecond = new Company("วันที่22",twentysecondProduct);
        companies.add(twentysecond);

        ArrayList<Product> twentythirdProduct = new ArrayList<>();
        twentythirdProduct.add(new Product("มื้อเช้า: น้ำผักผลไม้ปั่น+กล้วยหอม1ลูก"));
        twentythirdProduct.add(new Product("มื้อเที่ยง: สเต็กอกไก่พริกไทยดำ+แตงโม1ชิ้น"));
        twentythirdProduct.add(new Product("มื้อเย็น: สลัดโรล+นมไขมันต่ำ"));

        Company twentythird = new Company("วันที่23",twentythirdProduct);
        companies.add(twentythird);

        ArrayList<Product>twentyfourthProduct = new ArrayList<>();
        twentyfourthProduct.add(new Product("มื้อเช้า: ขนมปังโฮลวีตทาเนยถั่ว+ส้ม1ลูก"));
        twentyfourthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+แกงจืดเห็ดหอม+ฝรั่ง1ลูก(เล็ก)"));
        twentyfourthProduct.add(new Product("มื้อเย็น: โยเกิร์ตLowFat+ผลไม้ตามชอบ"));

        Company twentyfourth = new Company("วันที่24",twentyfourthProduct);
        companies.add(twentyfourth);

        ArrayList<Product>twentyfifthProduct = new ArrayList<>();
        twentyfifthProduct.add(new Product("มื้อเข้า: ไข่ต้ม3-4ฟอง ไม่กินไข่แดง"));
        twentyfifthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ต้ำเลือดหมู+กล้วยปิ้ง1ลูก"));
        twentyfifthProduct.add(new Product("มื้อเย็น: ไข่ตุ๋น+กล้วยหอม1ลูก"));

        Company twentyfifth = new Company("วันที่25",twentyfifthProduct);
        companies.add(twentyfifth);

        ArrayList<Product>twentysixthProduct = new ArrayList<>();
        twentysixthProduct.add(new Product("มื้อเช้า: แซนวิชไข่ดาวอโวคาโด"));
        twentysixthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ซุปเห็ดน้ำใส+แตงโม1ชิ้น"));
        twentysixthProduct.add(new Product("มื้อเย็น: สลัดโรล"));

        Company twentysixth = new Company("วันที่26",twentysixthProduct);
        companies.add(twentysixth);

        ArrayList<Product>twentyseventhProduct = new ArrayList<>();
        twentyseventhProduct.add(new Product("มื้อเช้า: โจ๊กหมูสับไข่ลวก"));
        twentyseventhProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+เกาเหลาน้ำใส(เน้นผัก)+มะละกอ1ชิ้น"));
        twentyseventhProduct.add(new Product("มื้อเย็น: ผลไม้กับโยเกิร์ตไขมันต่ำ"));

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
