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

public class Table_Rice_III_Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__rice__iii_);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwr9);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwr10);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwr11);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwr12);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> fifteenthProduct = new ArrayList<>();
        fifteenthProduct.add(new Product("มื้อเช้า: ข้าวต้มทรงเครื่อง"));
        fifteenthProduct.add(new Product("มื้อเที่ยง: ขนมจีนแกงเขียวหวานไก่"));
        fifteenthProduct.add(new Product("snack: ทอดมันกุ้ง1จาน"));
        fifteenthProduct.add(new Product("มื้อเย็น: สาคูไส้หมู4ลูก"));

        Company fifteenth = new Company("วันที่15",fifteenthProduct);
        companies.add(fifteenth);

        ArrayList<Product> sixteenthProduct = new ArrayList<>();
        sixteenthProduct.add(new Product("มื้อเช้า: ไข่ลวก2ฟอง+ขนมปังปิ้ง2แผ่น "));
        sixteenthProduct.add(new Product("มื้อเที่ยง: สุกี้แห้งทะเล1จาน"));
        sixteenthProduct.add(new Product("snack: ขนมเยลลี่หมี"));
        sixteenthProduct.add(new Product("มื้อเย็น: กุ้งอบวุ้นเส้น1จาน"));

        Company sixteenth = new Company("วันที่16",sixteenthProduct);
        companies.add(sixteenth);

        ArrayList<Product>seventeenthProduct = new ArrayList<>();
        seventeenthProduct.add(new Product("มื้อเช้า: โจ๊กหมู ใส่ไข่ลวก"));
        seventeenthProduct.add(new Product("มื้อเที่ยง: ยำขนมจีน"));
        seventeenthProduct.add(new Product("snack: ลูกตาลลอยแก้วใส่น้ำเชื่อมนิดหน่อย"));
        seventeenthProduct.add(new Product("มื้อเย็น: หมูสะเต๊ะ10ไม้"));

        Company seventeenth = new Company("วันที่17",seventeenthProduct);
        companies.add(seventeenth);

        ArrayList<Product>eighteenthProduct = new ArrayList<>();
        eighteenthProduct.add(new Product("มื้อเข้า: ซาลาเปาทอด2ลูก"));
        eighteenthProduct.add(new Product("มื้อเที่ยง: แกงส้มกุ้ง+ข้าวกล้อง+ไข่ต้ม1ฟอง"));
        eighteenthProduct.add(new Product("snack: ทองม้วน3อันเล็ก"));
        eighteenthProduct.add(new Product("มื้อเย็น: ปลาทอดสามรส"));

        Company eighteenth = new Company("วันที่18",eighteenthProduct);
        companies.add(eighteenth);

        ArrayList<Product>nineteenthProduct = new ArrayList<>();
        nineteenthProduct.add(new Product("มื้อเช้า: ข้าวเหนียว+ไก่ย่าง3ไม้"));
        nineteenthProduct.add(new Product("มื้อเที่ยง: ยำผักบุ้งทอดกรอบ"));
        nineteenthProduct.add(new Product("snack: สลัดทูน่าธัญพืชถ้วยเล็ก"));
        nineteenthProduct.add(new Product("มื้อเย็น: หมูกะทะ บุฟเฟ่ต์"));

        Company nineteenth = new Company("วันที่19",nineteenthProduct);
        companies.add(nineteenth);

        ArrayList<Product>twentiethProduct = new ArrayList<>();
        twentiethProduct.add(new Product("มื้อเช้า: แซนวิชอกไก่ย่างพร้อมผัก"));
        twentiethProduct.add(new Product("มื้อเที่ยง: บล็อคคอลี่ผัดน้ำมันหอย+ข้าวกล้อง+ไข่ต้ม1ฟอง"));
        twentiethProduct.add(new Product("snack: อัลมอนด์อบเกลือ"));
        twentiethProduct.add(new Product("มื้อเย็น: ปลาเผา1ตัว"));

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
