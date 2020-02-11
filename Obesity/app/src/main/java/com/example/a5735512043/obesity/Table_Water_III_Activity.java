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

public class Table_Water_III_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1,w2,w3,w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__water__iii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvww9);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvww10);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvww11);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvww12);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> fifteenthProduct = new ArrayList<>();
        fifteenthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ลูกแพร์1ลูก"));
        fifteenthProduct.add(new Product("มื้อเที่ยง: สลัดผักและอกไก่"));
        fifteenthProduct.add(new Product("มื้อเย็น: โยเกิร์ตLow-Fat+ผลไม้ตามใจชอบ"));

        Company fifteenth = new Company("วันที่15",fifteenthProduct);
        companies.add(fifteenth);

        ArrayList<Product> sixteenthProduct = new ArrayList<>();
        sixteenthProduct.add(new Product("มื้อเช้า: ไข่ต้ม2ฟอง+ส้ม1ลูก"));
        sixteenthProduct.add(new Product("มื้อเที่ยง: ผักต้มและอกไก่"));
        sixteenthProduct.add(new Product("มื้อเย็น: ผักต้มน้ำพริก"));

        Company sixteenth = new Company("วันที่16",sixteenthProduct);
        companies.add(sixteenth);

        ArrayList<Product>seventeenthProduct = new ArrayList<>();
        seventeenthProduct.add(new Product("มื้อเช้า: โจ๊กอกไก่+ไข่ต้ม1ฟอง"));
        seventeenthProduct.add(new Product("มื้อเที่ยง: เบอร์เกอร์อกไก่ไข่ขาว+นมจืดไขมันต่ำ1แก้ว"));
        seventeenthProduct.add(new Product("มื้อเย็น: สลัดผักอกไก่"));

        Company seventeenth = new Company("วันที่17",seventeenthProduct);
        companies.add(seventeenth);

        ArrayList<Product>eighteenthProduct = new ArrayList<>();
        eighteenthProduct.add(new Product("มื้อเข้า: โจ๊กไข่ขาว+แอปเปิ้ล1ลูก"));
        eighteenthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+อกไก่นุ่ม"));
        eighteenthProduct.add(new Product("มื้อเย็น: สลัดผัก+น้ำส้มคั้น1แก้ว"));

        Company eighteenth = new Company("วันที่18",eighteenthProduct);
        companies.add(eighteenth);

        ArrayList<Product>nineteenthProduct = new ArrayList<>();
        nineteenthProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+กล้วยหอม1ลูก"));
        nineteenthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ไข่ขาวห่อแซลมอน"));
        nineteenthProduct.add(new Product("มื้อเย็น: สลัดผักและอกไก่"));

        Company nineteenth = new Company("วันที่19",nineteenthProduct);
        companies.add(nineteenth);

        ArrayList<Product>twentiethProduct = new ArrayList<>();
        twentiethProduct.add(new Product("มื้อเช้า: ไข่ต้ม1ฟอง+ลูกแพร์1ลูก"));
        twentiethProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ไข่พะโล้"));
        twentiethProduct.add(new Product("มื้อเย็น: โยเกิร์ตLow-Fat+ผลไม้ตามใจชอบ"));

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
