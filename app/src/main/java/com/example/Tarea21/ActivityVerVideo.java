package com.example.Tarea21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ActivityVerVideo extends AppCompatActivity {

    Button btnregresar;
    private VideoView videoView2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_video);

        videoView2 =(VideoView)findViewById(R.id.videoView2);
        btnregresar =(Button)findViewById(R.id.btnRegresar);
        Uri videoUri = Uri.parse(getIntent().getExtras().getString("videoUri"));
        videoView2.setVideoURI(videoUri);
        videoView2.start();


        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Regresar();
            }
        });

    }
    public void Regresar()
    {
        Intent playIntent =new Intent(this,MainActivity.class);
        playIntent.putExtra("videoUri","videoview".toString());
        startActivity(playIntent);

    }
}