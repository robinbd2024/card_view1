package com.robinbd.cardview1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
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







       registration.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int selet =rediogroup.getCheckedRadioButtonId();
               int seletd =registration1.getCheckedRadioButtonId();
               radioButton =findViewById(selet);
               radiobutton1 =findViewById(seletd);
               String radio =radioButton.getText().toString();
               String type =radiobutton1.getText().toString();

               if (signin.isChecked()){
                   String name =fristname.getText().toString();
                   String usname =lastrname.getText().toString();
                   String email =remail.getText().toString();
                   String mphone = phone.getText().toString();
                   String passw =rPassword.getText().toString();
                   tvtex.append("fast name : "+name+"\n");
                   tvtex.append("last name : "+usname+"\n");
                   tvtex.append("email : "+email+"\n");
                   tvtex.append("number : "+mphone+"\n");
                   tvtex.append("pasword : "+passw+"\n");
                   tvtex.append("Gender : "+radio+"\n");
                   tvtex.append("your Type  : "+type+"\n");
                   fristname.setText("");
                   lastrname.setText("");
                   remail.setText("");
                   phone.setText("");
                   rPassword.setText("");
               }else {
                   Toast.makeText(RegistrationActivity.this,"please Check checkmox",Toast.LENGTH_LONG).show();
               }


           }
       });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}