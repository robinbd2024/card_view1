package com.robinbd.cardview1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {
   EditText fristname,lastrname,remail,phone,rPassword;
   CheckBox signin;
   Button registration;
   TextView tvtex,tv;
   RadioGroup rediogroup,registration1;
   RadioButton radioButton,radiobutton1;
  //spinner class------//
   String [] county_name;
   Spinner spinnerid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration);

        fristname=findViewById(R.id.fristname);
        lastrname=findViewById(R.id.lastrname);
        remail=findViewById(R.id.remail);
        phone=findViewById(R.id.phone);
        rPassword=findViewById(R.id.rPassword);
        signin=findViewById(R.id.signin);
        registration=findViewById(R.id. registration);
        tvtex =findViewById(R.id.tvtex);
        tv = findViewById(R.id.mywidget);
        rediogroup = findViewById(R.id.rediogroup);
        registration1 = findViewById(R.id.registration1);
        tv.setSelected(true);

        //spinner start---//
        county_name =getResources().getStringArray(R.array.county_name);
        spinnerid = findViewById(R.id.spinnerid);
        ArrayAdapter <String> array = new ArrayAdapter<String>(this,R.layout.itam_spinner,R.id.tvtex1,county_name);
        spinnerid.setAdapter(array);










       registration.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int selectedid = rediogroup.getCheckedRadioButtonId();
               radioButton = findViewById(selectedid);

               if (rediogroup.getCheckedRadioButtonId() == -1) {
                   Toast.makeText(RegistrationActivity.this, "please select gender", Toast.LENGTH_SHORT).show();


               } else {
                   String selet1 = radioButton.getText().toString();}



               if (signin.isChecked()){
                   String name =fristname.getText().toString();
                   String usname =lastrname.getText().toString();
                   String email =remail.getText().toString();
                   String mphone = phone.getText().toString();
                   String passw =rPassword.getText().toString();
                   String spinner =spinnerid.getSelectedItem().toString();
                   String selet1 = radioButton.getText().toString();
                   tvtex.setText("this county : "+spinner +"\n");
                   tvtex.append("fast name : "+name+"\n");
                   tvtex.append("last name : "+usname+"\n");
                   tvtex.append("email : "+email+"\n");
                   tvtex.append("number : "+mphone+"\n");
                   tvtex.append("pasword : "+passw+"\n");
                   tvtex.append("Gender : "+selet1+"\n");
                   fristname.setText("");
                   lastrname.setText("");
                   remail.setText("");
                   phone.setText("");
                   rPassword.setText("");



               } else {

                   Toast.makeText(RegistrationActivity.this,"please Check checkmox",Toast.LENGTH_LONG).show();
               }


           }
       });







    }
}