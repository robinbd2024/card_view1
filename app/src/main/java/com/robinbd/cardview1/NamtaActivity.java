package com.robinbd.cardview1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NamtaActivity extends AppCompatActivity {
   TextView tvdesply2;
    Button reslut;
    EditText count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_namta);

        count =findViewById(R.id.count);
        tvdesply2 =findViewById(R.id.tvdesply2);
        reslut =findViewById(R.id.result);

        reslut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String com =count.getText().toString();
                SharedPreferences sharedPreferences =getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("keycount",com);
                editor.commit();

                tvdesply2.setVisibility(View.VISIBLE);


                if (count.getText().toString().length()>0){
                    String mcount =count.getText().toString();
                    int mycoumt =Integer.parseInt(mcount);
                    tvdesply2.append(mycoumt+" এর গুণের নামতা\n");
                    for (int x=1; x<=10; x++){
                        int mul =mycoumt*x;
                        tvdesply2.append(mycoumt+" * " +x+" = " +mul +"\n");
                        count.setText("");




                    }

                }
                else {
                    count.setError("Please input a number");

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