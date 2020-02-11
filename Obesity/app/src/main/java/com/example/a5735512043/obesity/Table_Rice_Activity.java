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

public class Table_Rice_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__rice_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwr1);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwr2);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwr3);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwr4);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<Company> companies = new ArrayList<>();


        ArrayList<Product> googleProduct = new ArrayList<>();
        googleProduct.add(new Product("มื้อเช้า: แซนด์ทูน่าขนมปัง3แผ่น"));
        googleProduct.add(new Product("มื้อเที่ยง: ข้าวราดแกงไก่"));
        googleProduct.add(new Product("snack: แอปเปิ้ล1ลูก+นมเปรี้ยวไข่มันต่ำ"));
        googleProduct.add(new Product("มื้อเย็น: ราดหน้าบะหมี่กรอบไก่"));

        Company google = new Company("วันที่1", googleProduct);
        companies.add(google);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("มื้อเช้า: ข้าวต้มข้าวกล้อง 5ทัพพี + ยำไข่ต้ม"));
        microsoftProduct.add(new Product("มื้อเที่ยง: ทอดกระเทียม"));
        microsoftProduct.add(new Product("snack: คุ้กกี้ช็คอโกแลตชิพ"));
        microsoftProduct.add(new Product("มื้อเย็น: เส้นใหญ่ผัดซีอิ๊วใส่ไข่"));

        Company microfoft = new Company("วันที่2", microsoftProduct);
        companies.add(microfoft);


        ArrayList<Product> dinerProdect = new ArrayList<>();
        dinerProdect.add(new Product("มื้อเช้า: ข้าวต้มกุ้ง1ชาม"));
        dinerProdect.add(new Product("มื้อเที่ยง: ข้าวมันไก่ทอด"));
        dinerProdect.add(new Product("snack: น้ำมะเขือเทศ1กล่อง+ขนมปัง1แผ่น"));
        dinerProdect.add(new Product("มื้อเย็น: หมี่กรอบราดหน้าหมู"));

        Company dinner = new Company("วันที่3", dinerProdect);
        companies.add(dinner);


        ArrayList<Product> fourthProduct = new ArrayList<>();
        fourthProduct.add(new Product("มื้อเข้า: อาหารเช้าซีเรียลโฮลวีท + นม1แก้ว"));
        fourthProduct.add(new Product("มื้อเที่ยง: ข้าวหมกไก่"));
        fourthProduct.add(new Product("snack: ลูกชิ้นทอด 10ลูก"));
        fourthProduct.add(new Product("มื้อเย็น: แกงส้มปลาแปะซะ 1ถ้วย"));

        Company fourth = new Company("วันที่4", fourthProduct);
        companies.add(fourth);

        ArrayList<Product> fifthProduct = new ArrayList<>();
        fifthProduct.add(new Product("มื้อเช้า: ขนมปังหมูหยองราดมายองเนส +น้ำเต้าหู้(หวานปกติ)"));
        fifthProduct.add(new Product("มื้อเที่ยง: เส้นหมี่ลูกชิ้นหมูแกง"));
        fifthProduct.add(new Product("snack: กล้วยทอด"));
        fifthProduct.add(new Product("มื้อเย็น: แกงส้มกุ้งชะอมชุบไข่ทอด"));

        Company fifth = new Company("วันที่5", fifthProduct);
        companies.add(fifth);

        ArrayList<Product> sixthProduct = new ArrayList<>();
        sixthProduct.add(new Product("มื้อเช้า: ข้าวเหนียวหมูทอด"));
        sixthProduct.add(new Product("มื้อเที่ยง: ข้าวยำไก่กรอบ"));
        sixthProduct.add(new Product("snack: โยเกิร์ต(รสผลไม้รวม)"));
        sixthProduct.add(new Product("มื้อเย็น: ไสเต็กไก่ทอด มันบด 1จาน"));

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
