package com.robinbd.cardview1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class MediaActivity extends AppCompatActivity {

    CardView song,song1,song2,song3,song4,song5,song6,song7,song8,song9,song10,song11,song12,song13,song14;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_media);
        song =findViewById(R.id.song);
        song1 =findViewById(R.id.song1);
        song2 =findViewById(R.id.song2);
        song3 =findViewById(R.id.song3);
        song4 =findViewById(R.id.song4);
        song5 =findViewById(R.id.song5);
        song6 =findViewById(R.id.song6);
        song7 =findViewById(R.id.song7);
        song8 =findViewById(R.id.song8);
        song9 =findViewById(R.id.song9);
        song10 =findViewById(R.id.song10);
        song11 =findViewById(R.id.song11);
        song12 =findViewById(R.id.song12);
        song13 =findViewById(R.id.song13);
        song14 =findViewById(R.id.song14);


        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://dl1.jattpendu.com/download/128k-axuef/Baba.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://dl1.jattpendu.com/download/128k-drfpg/Guru.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://dl1.jattpendu.com/download/128k-axetj/Ma.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://dl1.jattpendu.com/download/128k-dicjh/Kobita.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });



        song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        song7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        song8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        song9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        song10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource("https://pagallworld.co.in/wp-content/uploads/2023/12/Sei-tumi-keno-eto-ochena-hole.mp3");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
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