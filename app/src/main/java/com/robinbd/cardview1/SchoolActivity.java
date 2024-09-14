package com.robinbd.cardview1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SchoolActivity extends AppCompatActivity implements View.OnClickListener {

    CardView dhaka, ctg,khulna,comilla,borisal,sylhet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_school);
        dhaka =findViewById(R.id.dhaka);
        ctg =findViewById(R.id. ctg);
        khulna =findViewById(R.id.khulna);
        comilla =findViewById(R.id.comilla);
        borisal =findViewById(R.id.borisal);
        sylhet =findViewById(R.id.sylhet);

        //oneclick
        dhaka.setOnClickListener(this);
        ctg.setOnClickListener(this);
        khulna.setOnClickListener(this);
        comilla.setOnClickListener(this);
        borisal.setOnClickListener(this);
        sylhet.setOnClickListener(this);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    ///onclick lisener
    @Override
    public void onClick(View v) {
      if (v==dhaka){
          WiveActivity.tvdesply="https://www.du.ac.bd/";
          Intent myint =new Intent(SchoolActivity.this, WiveActivity.class);
          startActivity(myint);

      }else if (v==ctg){
          WiveActivity.tvdesply="https://web.cu.ac.bd/v2/";
          Intent myint =new Intent(SchoolActivity.this, WiveActivity.class);
          startActivity(myint);
      }else if (v==comilla){
          WiveActivity.tvdesply="https://www.cou.ac.bd/";
          Intent myint =new Intent(SchoolActivity.this, WiveActivity.class);
          startActivity(myint);
      }else if (v==khulna){
          WiveActivity.tvdesply="https://ku.ac.bd/";
          Intent myint =new Intent(SchoolActivity.this, WiveActivity.class);
          startActivity(myint);
      }else if (v ==borisal){
          WiveActivity.tvdesply="https://bu.ac.bd/";
          Intent myint =new Intent(SchoolActivity.this, WiveActivity.class);
          startActivity(myint);
      }else if (v ==sylhet){
          WiveActivity.tvdesply="https://www.sau.ac.bd/";
          Intent myint =new Intent(SchoolActivity.this, WiveActivity.class);
          startActivity(myint);
      }

    }
}