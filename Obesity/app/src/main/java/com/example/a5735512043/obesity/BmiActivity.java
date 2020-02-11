package com.example.a5735512043.obesity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BmiActivity extends AppCompatActivity implements View.OnClickListener {

    EditText weightEt,heighEt;
    TextView showTv ;
    Button calBt,checkBt;

    DatabaseReference databaseCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        //Actionbar
        ActionBar actionBar = getSupportActionBar();
        //set title
        actionBar.setTitle("Calculate BMI");

        databaseCalculator = FirebaseDatabase.getInstance().getReference("Calculator");


        weightEt = (EditText)findViewById(R.id.weightEt);
        heighEt = (EditText)findViewById(R.id.heightEt);
        showTv = (TextView)findViewById(R.id.showTv);
        calBt = (Button)findViewById(R.id.calBt);
        checkBt = (Button)findViewById(R.id.checkBt);

        calBt.setOnClickListener(this);
        checkBt.setOnClickListener(this);


    }

    private void calculateBMI (){
        String heightStr = heighEt.getText().toString();
        String weightStr = weightEt.getText().toString();

        if (heightStr != null && !"".equals(heightStr) &&weightStr != null&& !"".equals(weightStr)){
            float heightValue = Float.parseFloat(heightStr)/100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue/(heightValue*heightValue);
            displayBMI(bmi);


        }
    }


    private void displayBMI(float bmi){
        String bmiLable = "";
        String eating = "";

        if (Float.compare(bmi,18.5f)<=0){
            bmiLable = "น้ำหนักน้อยเกิน";
            eating = "ควรเรับประทานอาหารที่เพิ่มพลังงาน และกินให้ได้สัดส่วนทั้ง คาร์โบไฮเดรท โปรตีน ไขมัน และควรเพิ่มวิตามินและเกลือแร่เพื่อช่วยเพิ่มความอยากอาหาร";
        }
        if (Float.compare(bmi,18.5f)>0 && Float.compare(bmi,22.9f)<= 0){
            bmiLable = "น้ำหนักปกติ";
            eating = "ควรรับประทานโปรตีนให้เพียงพอต่อความต้องการ และรับประทานไขมันที่ดีต่อสุขภาพ ควบคุมปริมาณเกลือแร่ที่ร่างกายได้รับ";
        }
        if (Float.compare(bmi,22.9f)>0 && Float.compare(bmi,30f)<=0){
            bmiLable = "น้ำหนักเกินมาตรฐาน";
            eating = "ควรรับประทานอาหารเส้นใยอาหารให้มาก เน้นอาาหรที่ให้ที่ให้พลังงานสูง แต่จานไม่ใหญ่นัก เช่น สเต็กปลากับสลัดผักน้ำใส่ ";
        }
        if (Float.compare(bmi,30.0f)>0){
            bmiLable = "โรคอ้วน";
            eating = "ควรรับประทานอาหารคาร์โบไฮเดรตเป็นหลัก สลับกับอาหารประเภทแป้งเป็นบางมื้อ กินพืชผัให้มาก และกินผลไม้เป็นประจำ กินปลาหรือเนื้อสัตว์ไม่ติดมันและไข่ ลดการบริโภคของทอดและผัด หลีกเลี่ยงอาหารรสหวานจัดและเค็มจัด";
        }

       // bmiLable = bmi + String.format("1.2f\n",bmiLable);
        bmiLable= String.format("%1.2f",bmi)+ " || " + bmiLable +"\n" +eating;
        showTv.setText(bmiLable);
    }

    private void addBmi(){
        String height = heighEt.getText().toString().trim();
        String weight = weightEt.getText().toString().trim();
      /*  String bmi = bmiTv.getText().toString().trim();*/

        if(!TextUtils.isEmpty(height)){
            String id = databaseCalculator.push().getKey();
            BmiHolder bmiholder = new BmiHolder(height, weight);
            databaseCalculator.child(id).setValue(bmiholder);

        }

        if(TextUtils.isEmpty(weight)){
            Toast.makeText(this,"Enter your wieght..",Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onClick(View view) {
        if (view == calBt){
            calculateBMI();
            addBmi();
            Toast.makeText(this,"Successfully",Toast.LENGTH_LONG).show();
        }

        if (view == checkBt)
        {
            String heightStr = heighEt.getText().toString();
            String weightStr = weightEt.getText().toString();

               if (heightStr != null && !"".equals(heightStr) &&weightStr != null&& !"".equals(weightStr))
               {
                   float heightValue = Float.parseFloat(heightStr) / 100;
                   float weightValue = Float.parseFloat(weightStr);

                   float am = weightValue / (heightValue * heightValue);

                   if(Float.compare(am,18.5f)<=0 ){
                       Intent intent = new Intent(this,Table_Rice_Activity.class);
                       startActivity(intent);
                   }
                   if (Float.compare(am,18.5f)>0 && Float.compare(am,22.9f)<= 0){
                       Intent intent = new Intent(this,Table_Egg_Activity.class);
                       startActivity(intent);
                   }
                   if (Float.compare(am,22.9f)>0 && Float.compare(am,30f)<=0){
                      Intent intent = new Intent(this,Table_Fruit_Activity.class);
                       startActivity(intent);
                   }
                   if (Float.compare(am,30.0f)>0){
                       Intent intent = new Intent(this,Table_Water_Activity.class);
                       startActivity(intent);
                      }

               }
        }

    }
}
