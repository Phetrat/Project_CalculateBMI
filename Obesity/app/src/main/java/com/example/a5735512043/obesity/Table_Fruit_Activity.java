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

public class Table_Fruit_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__fruit_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwf1);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwf2);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwf3);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwf4);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<Company> companies = new ArrayList<>();


        ArrayList<Product> googleProduct = new ArrayList<>();
        googleProduct.add(new Product("มื้อเช้า: โยเกร์ต Low-Fat +แอปเปิลแดง1ลูก"));
        googleProduct.add(new Product("มื้อเที่ยง: สลัดผักน้ำใส่+อกไก่+แอปเปิลแดง1ลูก"));
        googleProduct.add(new Product("มื้อเย็น: ยำตะไคร้ทูน่า+นมจืด+กล้วยหอม1ลูก"));

        Company google = new Company("วันที่1", googleProduct);
        companies.add(google);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("มื้อเช้า: ขนมปังปิ้ง1แผ่น+ไข่ดาว(ไร้มัน)1ฟอง+แตงโม"));
        microsoftProduct.add(new Product("มื้อเที่ยง: ข้าวกล่อง+น้ำพริกอ๋อง+ส้ม1ลูก"));
        microsoftProduct.add(new Product("มื้อเย็น: ตำผลไม้(ใส่น้ำตาลน้อยๆ)"));

        Company microfoft = new Company("วันที่2", microsoftProduct);
        companies.add(microfoft);


        ArrayList<Product> dinerProdect = new ArrayList<>();
        dinerProdect.add(new Product("มื้อเช้า: โจ๊กไข่ขาว+มะละกอ"));
        dinerProdect.add(new Product("มื้อเที่ยง: ข้าวกล้อง+แซลมอนอบ+สลัดมะม่วงอะโวคาโด"));
        dinerProdect.add(new Product("มื้อเย็น: โยเกิร์ตlow-Fat+แก้วมังกรครึ่งซีก"));

        Company dinner = new Company("วันที่3", dinerProdect);
        companies.add(dinner);


        ArrayList<Product> fourthProduct = new ArrayList<>();
        fourthProduct.add(new Product("มื้อเข้า: โยเกิร์ตมูสลี่องุ่น+กีวี+ซีเรียล"));
        fourthProduct.add(new Product("มื้อเที่ยง: เส้นบุกผัดน้ำสลัดงาซีอิ๊วญี่ปุ่น+ผลไม้ตามชอบ"));
        fourthProduct.add(new Product("มื้อเย็น: ผัดวุ่นเส้นอกไก่(ไม่ใช้น้ำมัน)+สับปรด"));

        Company fourth = new Company("วันที่4", fourthProduct);
        companies.add(fourth);

        ArrayList<Product> fifthProduct = new ArrayList<>();
        fifthProduct.add(new Product("มื้อเช้า: ขนมปังไข่คนทูน่า2แผ่น"));
        fifthProduct.add(new Product("มื้อเที่ยง: สลัดโรล+มันเทศต้ม"));
        fifthProduct.add(new Product("มื้อเย็น: ยำสาหร่าย+บลูเบอรี่"));

        Company fifth = new Company("วันที่5", fifthProduct);
        companies.add(fifth);

        ArrayList<Product> sixthProduct = new ArrayList<>();
        sixthProduct.add(new Product("มื้อเช้า: แอปเปิล1ลูก+ส้ม1ลูก"));
        sixthProduct.add(new Product("มื้อเที่ยง: สุกี้น้ำไก่+ฝรั่ง1ลูก"));
        sixthProduct.add(new Product("มื้อเย็น: ตำแตง(ใส่น้ำตาลน้อยๆ)+ส้ม1ลูก"));

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
