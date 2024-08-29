package com.example.skinelixirfire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    Button b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent intent1 = getIntent();
        Button b1=findViewById(R.id.button4);
        TextView t26 = findViewById(R.id.textView26);
        String des1= intent1.getStringExtra("desc1");
        t26.setText(des1);
        // Get the image URI from the Intent extra
        String imageUriString = intent1.getStringExtra("imageUriKey");

        // Convert the string back to Uri
        Uri imageUri = Uri.parse(imageUriString);
        String imageUriString1 = intent1.getStringExtra("imageUriKey1");

        // Convert the string back to Uri
        Uri imageUri1 = Uri.parse(imageUriString1);
        // Display the image using an ImageView (or wherever you want to use it)
        ImageView imageView = findViewById(R.id.imageView7);
        imageView.setImageURI(imageUri1);
        ImageView imageView1 = findViewById(R.id.imageView8);
        imageView1.setImageURI(imageUri);
        String receivedText = intent1.getStringExtra("textKey");


        TextView textView = findViewById(R.id.textView16);
        textView.setText(receivedText);
        String receivedText1 = intent1.getStringExtra("textKey1");


        TextView textView1 = findViewById(R.id.textView17);
        textView1.setText(receivedText1);
        String receivedText4= intent1.getStringExtra("textKey2");


        String receivedText5= intent1.getStringExtra("textKey4");



        String imageUriString3 = intent1.getStringExtra("imageUriKey3");
        Uri imageUri3 = Uri.parse(imageUriString3);
        ImageView imageView3 = findViewById(R.id.imageView10);
        imageView3.setImageURI(imageUri3);
        String receivedText3= intent1.getStringExtra("textKey3");
        TextView textView3 = findViewById(R.id.textView18);
        textView3.setText(receivedText3);
        String receivedText6= intent1.getStringExtra("textKey5");

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse(receivedText4));
                startActivity(link);
            }
        } );
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse(receivedText5));
                startActivity(link);
            }
        } );
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse(receivedText6));
                startActivity(link);
            }
        } );
b8=findViewById(R.id.button5);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(Final.this,Description.class);
                String text = t26.getText().toString();
                int1.putExtra("d1",text);
                startActivity(int1); String location = "geo:11.9139,79.8145?q=Pondicherry";

                // Create an Intent with the specified location
                Uri gmmIntentUri = Uri.parse(location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Check if there is a map app installed
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }



            }
        });
          b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent int1=new Intent(Final.this,Description.class);
                 String text = t26.getText().toString();
                 int1.putExtra("d1",text);
                 startActivity(int1);



    }
});


    }
}