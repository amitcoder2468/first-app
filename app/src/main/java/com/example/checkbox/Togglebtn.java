package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Togglebtn extends AppCompatActivity {
    ToggleButton wifi_togglebtn;
    Switch wifi_switch;
    String str;
    String str1 ,str2 ,str3;

    TextView tvdata ,tvdata1,tvdata2 ,tvdata3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togglebtn);


        tvdata = (TextView) findViewById(R.id.tvdata);
        tvdata1 = (TextView) findViewById(R.id.tvdata1);
        tvdata2 = (TextView) findViewById(R.id.tvdata2);
        tvdata3 = (TextView) findViewById(R.id.tvdata3);
        wifi_togglebtn = (ToggleButton) findViewById(R.id.wifi_togglebtn);
        wifi_switch=(Switch) findViewById(R.id.wifiswitch);

        str=getIntent().getStringExtra("amit");
        str1=getIntent().getStringExtra("phon");
        str2=getIntent().getStringExtra("pass");
        str3=getIntent().getStringExtra("gen");

//        str1=getIntent().getIntExtra("amit1",0);
        tvdata.setText(str);
        tvdata1.setText(str1);
        tvdata2.setText(str2);
        tvdata3.setText(str3);
    }

   public  void getValuesFromToggleBtn(View view) {
       if (wifi_togglebtn.isChecked()) {
           Toast.makeText(this, "Wifi off", Toast.LENGTH_SHORT).show();

       } else {
           Toast.makeText(this, "Wifi on", Toast.LENGTH_SHORT).show();
       }
   }

       public void getvaluefromswitch (View view){
           if (wifi_switch.isChecked()) {
               Toast.makeText(this, "Wifi offffffffff", Toast.LENGTH_SHORT).show();

           } else {
               Toast.makeText(this, "Wifi onnnnnnnn", Toast.LENGTH_SHORT).show();
           }

       }


}
