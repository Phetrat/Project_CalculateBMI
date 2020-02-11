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

public class Table_Fruit_IIIActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__fruit__iii);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("อาหารที่เหมาะสำหรับคุณ");

        w1 = (TextView) findViewById(R.id.tvwf9);
        w1.setOnClickListener(this);
        w2 = (TextView) findViewById(R.id.tvwf10);
        w2.setOnClickListener(this);
        w3 = (TextView) findViewById(R.id.tvwf11);
        w3.setOnClickListener(this);
        w4 = (TextView) findViewById(R.id.tvwf12);
        w4.setOnClickListener(this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> fifteenthProduct = new ArrayList<>();
        fifteenthProduct.add(new Product("มื้อเช้า: โฮลวีทไข่กล้วยหอม"));
        fifteenthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ยำวุ่นเส้นไก่สับ+แก้วมังกร"));
        fifteenthProduct.add(new Product("มื้อเย็น: ไข่ตุ๋นทรงเครื่อง+ลูกแพร์1ลูก"));

        Company fifteenth = new Company("วันที่15",fifteenthProduct);
        companies.add(fifteenth);

        ArrayList<Product> sixteenthProduct = new ArrayList<>();
        sixteenthProduct.add(new Product("มื้อเช้า: โยเกิร์ตLow-Fat+สตรอเบอร์รี่+ราสเบอรี่+บลูเบอร์รี่"));
        sixteenthProduct.add(new Product("มื้อเที่ยง: ข้าวสวย+แกงเห็ด+แอปเปิล1ลูก"));
        sixteenthProduct.add(new Product("มื้อเย็น: สลัดฟักทองนึ่งเต้าหู้นึ่ง"));

        Company sixteenth = new Company("วันที่16",sixteenthProduct);
        companies.add(sixteenth);

        ArrayList<Product>seventeenthProduct = new ArrayList<>();
        seventeenthProduct.add(new Product("มื้อเช้า: โยเกร์ตLow-Fat+ส้ม1ลูก"));
        seventeenthProduct.add(new Product("มื้อเที่ยง: สเต็กอกไก่น้ำจิ้มแจ๋ว+น้ำมะพร้าว1แก้ว"));
        seventeenthProduct.add(new Product("มื้อเย็น: สลัดน้ำใส+นมจืดไขมันต่ำ1แก้ว"));

        Company seventeenth = new Company("วันที่17",seventeenthProduct);
        companies.add(seventeenth);

        ArrayList<Product>eighteenthProduct = new ArrayList<>();
        eighteenthProduct.add(new Product("มื้อเข้า: ขนมปังโฮลวีต+ไข่ดาว(ไร้มัน)1ฟอง+สับปะรด 1 ชิ้น"));
        eighteenthProduct.add(new Product("มื้อเที่ยง: ข้าวกล่อง+น้ำพริก ปลาทู ผักลวก+ส้ม1ลูก"));
        eighteenthProduct.add(new Product("มื้อเย็น: สลัดผักโรล+นมไขมันต่ำ"));

        Company eighteenth = new Company("วันที่18",eighteenthProduct);
        companies.add(eighteenth);

        ArrayList<Product>nineteenthProduct = new ArrayList<>();
        nineteenthProduct.add(new Product("มื้อเช้า: โจ๊กหมู+แตงโม 1 ชิ้น"));
        nineteenthProduct.add(new Product("มื้อเที่ยง: ข้าวกล้องผัดสับปะรด+แอปเปิล1ลูก"));
        nineteenthProduct.add(new Product("มื้อเย็น: โยเกิร์ตlow-Fat+แก้วมังกรครึ่งซีก"));

        Company nineteenth = new Company("วันที่19",nineteenthProduct);
        companies.add(nineteenth);

        ArrayList<Product>twentiethProduct = new ArrayList<>();
        twentiethProduct.add(new Product("มื้อเช้า: น้ำเต้าหู้ไม่ใส่น้ำตาล+ขนมปังปิ้ง1แผ่น "));
        twentiethProduct.add(new Product("มื้อเที่ยง: ข้าวกล้อง+ไข่คน+ผลไม้ตามชอบ"));
        twentiethProduct.add(new Product("มื้อเย็น: สลัดอกไก่ย่าง+กีวี1ลูก"));

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
