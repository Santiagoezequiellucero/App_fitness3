package com.example.app_fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class InfoAt extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_at);

        videoView = (VideoView)findViewById(R.id.vV);

        String ruta = "android.resource://"+ getPackageName()+ "/"+ R.raw.video;
        Uri uri = Uri.parse(ruta);
        videoView.setVideoURI(uri);

        //controles de navegacion
        MediaController media = new MediaController(this);
        videoView.setMediaController(media);
    }
}