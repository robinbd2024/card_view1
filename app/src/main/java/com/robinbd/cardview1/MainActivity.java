package com.robinbd.cardview1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    ImageView imege;
    TextView tex;
    FrameLayout frame;
    CardView school,namta, media;


    Animation zoomin,myanim;
    MeowBottomNavigation bottomnavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imege = findViewById(R.id.imege);
        tex = findViewById(R.id.tex);
        frame =findViewById(R.id.frame);
        school= findViewById(R.id.school);
        namta= findViewById(R.id.namta);
        media= findViewById(R.id.media);


        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myint =new Intent(MainActivity.this,SchoolActivity.class);
                startActivity(myint);
            }
        });

        //bottom navigation...staet/
        bottomnavigation =findViewById(R.id.bottomnavigation);
        bottomnavigation.add(new MeowBottomNavigation.Model(1,R.drawable.settings));
        bottomnavigation.add(new MeowBottomNavigation.Model(2,R.drawable.home));
        bottomnavigation.add(new MeowBottomNavigation.Model(3,R.drawable.round_person_24));


        bottomnavigation.show(2,true);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,new HomeFragment());
        fragmentTransaction.commit();

        bottomnavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                if (model.getId()==2){
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame,new HomeFragment());
                    fragmentTransaction.commit();

                }if (model.getId()==1){
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame,new Settin());
                    fragmentTransaction.commit();

                }if (model.getId()==3){
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.frame,new PofileFragment());
                    fragmentTransaction.commit();
                }


                return null;

            }  //end//





        });





        ///bottomnavigtion  .. end//


      ///anim jaba../
      zoomin = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);
      myanim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.my_anim);
       imege.startAnimation(myanim);
        MediaPlayer myplayer = MediaPlayer.create(MainActivity.this,R.raw.welcome);
        myplayer.start();


       tex.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imege.startAnimation(zoomin);
               myplayer.start();

           }
       });

       //namta activ
        namta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myint =new Intent(MainActivity.this,NamtaActivity.class);
                startActivity(myint);
            }
        });

        //------media ply active-----//
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myint =new Intent(MainActivity.this,MediaActivity.class);
                startActivity(myint);
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
