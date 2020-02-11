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

public class Table_Egg_III_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__egg__iii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwe9);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwe10);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwe11);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwe12);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> fifteenthProduct = new ArrayList<>();
        fifteenthProduct.add(new Product("มื้อเช้า: กล้วยปิ้ง2ลูก+ไข่ต้ม1ฟอง+นมถั่วเหลือง1กล่อง"));
        fifteenthProduct.add(new Product("มื้อเที่ยง: ก๋วยเตี๋ยวลูกชิ้นน้ำใสพิเศษผักไม่ใส่กระเทียมเจียว"));
        fifteenthProduct.add(new Product("มื้อเย็น: ส้มตำ+ไก่ย่าง"));

        Company fifteenth = new Company("วันที่15",fifteenthProduct);
        companies.add(fifteenth);

        ArrayList<Product> sixteenthProduct = new ArrayList<>();
        sixteenthProduct.add(new Product("มื้อเช้า: แกงจืดวุ้นเส้นไข่น้ำ+ข้าวกล้อง"));
        sixteenthProduct.add(new Product("มื้อเที่ยง: สปาเกตตี้ขี้เมาอกไก่เส้นโฮลวีต"));
        sixteenthProduct.add(new Product("มื้อเย็น: แกงจืดเต้าหู้หมูสับใส่วุ้นเส้น"));

        Company sixteenth = new Company("วันที่16",sixteenthProduct);
        companies.add(sixteenth);

        ArrayList<Product>seventeenthProduct = new ArrayList<>();
        seventeenthProduct.add(new Product("มื้อเช้า: ผัดผัก+ข้าวกล้อง+ไข่ดาว"));
        seventeenthProduct.add(new Product("มื้อเที่ยง: อกไก่ผัดพริก+ข้าวกล้อง"));
        seventeenthProduct.add(new Product("มื้อเย็น: เมี่ยงปลาเผา"));

        Company seventeenth = new Company("วันที่17",seventeenthProduct);
        companies.add(seventeenth);

        ArrayList<Product>eighteenthProduct = new ArrayList<>();
        eighteenthProduct.add(new Product("มื้อเข้า: ข้าวต้มกุ้ง+น้ำส้ม"));
        eighteenthProduct.add(new Product("มื้อเที่ยง: แกงส้มกุ้ง+ข้าวกล้อง+ไข่ต้ม1ฟอง"));
        eighteenthProduct.add(new Product("มื้อเย็น: สลัดผักโรล+นมไขมันต่ำ"));

        Company eighteenth = new Company("วันที่18",eighteenthProduct);
        companies.add(eighteenth);

        ArrayList<Product>nineteenthProduct = new ArrayList<>();
        nineteenthProduct.add(new Product("มื้อเช้า: สมูทตี้ผักรวม"));
        nineteenthProduct.add(new Product("มื้อเที่ยง: เส้นหมี่ข้าวกล้องผัดซีอิ๊ว"));
        nineteenthProduct.add(new Product("มื้อเย็น: สลัดผลไม้รวม+น้ำสลัดโยเกิร์ต"));

        Company nineteenth = new Company("วันที่19",nineteenthProduct);
        companies.add(nineteenth);

        ArrayList<Product>twentiethProduct = new ArrayList<>();
        twentiethProduct.add(new Product("มื้อเช้า: แซนวิชอกไก่ย่างพร้อมผัก"));
        twentiethProduct.add(new Product("มื้อเที่ยง: บล็อคคอลี่ผัดน้ำมันหอย+ข้าวกล้อง+ไข่ต้ม1ฟอง"));
        twentiethProduct.add(new Product("มื้อเย็น: ตำข้าวโพด+ไข่ต้ม1ฟอง+นมไข่มันต่ำ"));

        Company twentieth = new Company("วันที่20",twentiethProduct);
        companies.add(twentieth);

        ArrayList<Product>twentyfirstProduct = new ArrayList<>();
        twentyfirstProduct.add(new Product("Cheat Day"));

        Company twentyfirst = new Company("วันที่21",twentyfirstProduct);
        companies.add(twentyfirst);

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
