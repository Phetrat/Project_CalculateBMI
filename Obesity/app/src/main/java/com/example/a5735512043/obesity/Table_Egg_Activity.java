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

public class Table_Egg_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__egg_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwe1);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwe2);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwe3);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwe4);
        w4.setOnClickListener(this);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<Company> companies = new ArrayList<>();


        ArrayList<Product> googleProduct = new ArrayList<>();
        googleProduct.add(new Product("มื้อเช้า: โจ๊กข้าวโอ๊ตใส่อกไก่สับ+น้ำส้ม1แก้ว"));
        googleProduct.add(new Product("มื้อเที่ยง: ลาบอกไก่ข้าวไรซ์เบอร์รี่ผักสด"));
        googleProduct.add(new Product("มื้อเย็น: สุกี้น้ำอกไก่ใส่ผักเยอะๆ"));

        Company google = new Company("วันที่1", googleProduct);
        companies.add(google);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("มื้อเช้า: ขนมปังทาอโวคาโดบดกับไข่ดาว+นมจืด1แก้ว"));
        microsoftProduct.add(new Product("มื้อเที่ยง: ก๋วยเตี๋ยวน้ำตกหมูไม่ใส่กระเทียมเจียวเพิ่มผัก"));
        microsoftProduct.add(new Product("มื้อเย็น: สลัดอกไก่น้ำสลัดโยเกิร์ต"));

        Company microfoft = new Company("วันที่2", microsoftProduct);
        companies.add(microfoft);


        ArrayList<Product> dinerProdect = new ArrayList<>();
        dinerProdect.add(new Product("มื้อเช้า: กราโนล่า1ถ้วย+กล้วยหอม+นมอัลมอนด์"));
        dinerProdect.add(new Product("มื้อเที่ยง: กะเพราอกไก่ข้าวไรซ์เบอร์รี่ผักสด"));
        dinerProdect.add(new Product("มื้อเย็น: เกาเหลาหมูชิ้นไม่ใส่กระเทียมเจียว"));

        Company dinner = new Company("วันที่3", dinerProdect);
        companies.add(dinner);


        ArrayList<Product> fourthProduct = new ArrayList<>();
        fourthProduct.add(new Product("มื้อเข้า: ข้าวกล้อง+ไข่เจียวไม่ใช้น้ำมัน+น้ำผลไม้รวม1กล่อง"));
        fourthProduct.add(new Product("มื้อเที่ยง: ส้มตำ+ไก่ย่าง+ข้าวเหนียวดำ"));
        fourthProduct.add(new Product("มื้อเย็น: สลัดปลาย่าง"));

        Company fourth = new Company("วันที่4", fourthProduct);
        companies.add(fourth);

        ArrayList<Product> fifthProduct = new ArrayList<>();
        fifthProduct.add(new Product("มื้อเช้า: ขนมปังทาเนยถั่ว2แผ่น+ผลไม้ไม่หวาน+น้ำจืด1แก้ว"));
        fifthProduct.add(new Product("มื้อเที่ยง: ฟักทองผัดไข่ข้าวกล้อง+ไข่ต้ม"));
        fifthProduct.add(new Product("มื้อเย็น: ยำวุ้นเส้น"));

        Company fifth = new Company("วันที่5", fifthProduct);
        companies.add(fifth);

        ArrayList<Product> sixthProduct = new ArrayList<>();
        sixthProduct.add(new Product("มื้อเช้า: ข้าวกล้องต้มใส่ผักและปลา"));
        sixthProduct.add(new Product("มื้อเที่ยง: ปลาทูย่าง+น้ำพริกกะปิ+ไข่ต้ม+ข้าวสวย"));
        sixthProduct.add(new Product("มื้อเย็น: ไข่ตุ๋นอกไก่ข้าวถ้วยเล็ก"));

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
