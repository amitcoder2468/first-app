package com.example.checkbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String res = "";

    EditText et_password, et_name, et_phone;
    RadioButton rb_male, rb_female;
    RadioGroup radio;
    CheckBox cb_android, cb_java, cb_react;
    Spinner sp_cities;
    Button button;
    boolean isAllFieldsChecked = false;
    String gender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_password = findViewById(R.id.et_password);
        et_name = findViewById(R.id.et_name);
        et_phone = findViewById(R.id.et_phonenumber);

        rb_male = findViewById(R.id.rb_male);
        rb_female = findViewById(R.id.rb_female);

        cb_android = findViewById(R.id.cb_android);
        cb_java = findViewById(R.id.cb_java);
        cb_react = findViewById(R.id.cb_react);

        sp_cities = findViewById(R.id.sp_cities);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                isAllFieldsChecked = CheckAllFields();

                // the boolean variable turns to be true then
                // only the user must be proceed to the activity2
                if (isAllFieldsChecked) {

                    if (Validation()) {
                        getAllValues(v);
                    }
                    else {

                    }

                }
            }
        });


    }

    private boolean Validation() {
        boolean isVali = false;

        if (et_password.getText().toString().isEmpty()) {
            isVali = false;
            et_password.setError("Please select password");
        }
        else if (et_name.getText().toString().isEmpty()) {
            isVali = false;
            et_name.setError("Please select name ");
        } else
        {
            isVali = true;
        }
        return isVali;
    }


//    private boolean CheckAllFields() {
//        if (et_name.length() == 0) {
//            et_name.setError("Name is required");
//            return false;
//        }
//
//        if (et_password.length() == 0) {
//            et_password.setError("Password is required");
//            return false;
//        }
//
//        if (et_phone.length() == 0) {
//            et_phone.setError("phonenumber  is required");
//            return false;
//
//        }
//        if (et_phone.length() < 10) {
//            et_phone.setError("phonenumber  is not 10 digit");
//            return false;
//        } else if (et_password.length() < 6) {
//            et_password.setError("password id less than  6");
//            return false;
//        }



//
//        // after all validation return true.
//        return true;
//    }

    public void getAllValues(View view) {
        //   ****************************-+++++     GET VALUES FROM ALL  EDITTEXT---+++++++++ **************************
        String name = et_name.getText().toString();
        String password = et_password.getText().toString();
        String phoneno = et_phone.getText().toString();


        //   ****************************-+++++     GET VALUES FROM ALL RADIOBUTON---+++++++++ **************************


        if (rb_male.isChecked()) {
            gender = rb_male.getText().toString();
        }
        if (rb_female.isChecked()) {
            gender = rb_female.getText().toString();
        }


        //   ****************************-+++++     GET VALUES FROM ALL CHECKBOX---+++++++++ **************************

        String interest = "";

        if (cb_android.isChecked()) {

            interest += cb_android.getText().toString() + "\n";
        }
        if (cb_java.isChecked()) {
            interest += cb_java.getText().toString() + "\n";
        }
        if (cb_react.isChecked()) {
            interest += cb_react.getText().toString() + "\n";
        }


        //   ****************************-+++++     GET VALUES FROM ALL Spinner--+++++++++ **************************
        String city = sp_cities.getSelectedItem().toString();
        //   ****************************-+++++   PRINT ALL VALUES --+++++++++ **************************


//        res = name + "\n" + phoneno + "\n" + password + "\n" + gender + "\n" + interest + "\n" + city;
//        Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();

        Intent i = new Intent(MainActivity.this, Togglebtn.class);
//        i.putExtra("amit", name);
//        i.putExtra("phon", phoneno);
//        i.putExtra("pass", password);
//        i.putExtra("gen", gender);
//        i.putExtra("amit1", 5000);
         startActivity(i);

    }


}