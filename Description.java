package com.example.skinelixirfire;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.MediaController;
import android.net.Uri;



import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;


public class Description extends AppCompatActivity {
 VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Intent int1 = getIntent();
        String receivedText = int1.getStringExtra("d1");
        TextView t30 = findViewById(R.id.textView30);
        t30.setText(receivedText);


        // Set the path of the video file or the URI
        VideoView v = findViewById(R.id.videoView);

        // Set the path of the video file or the URI
        String videoUrl = "https://www.pexels.com/video/a-woman-using-a-brush-for-makeup-application-3181792/";

        Uri videoUri = Uri.parse(videoUrl);
        v.setVideoURI(videoUri);

        // Optional: Set media controller for play, pause, etc.
        // MediaController mediaController = new MediaController(this);
        // videoView.setMediaController(mediaController);

        v.start();



    }
}