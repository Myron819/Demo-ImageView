package com.example.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
// Declare the ImageView object called ivDay2
    ImageView ivDay2;

    // (Declare more)
    ImageView ivDay3;
    ImageView ivDay4;
    ImageView ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the imageview obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        //Set the image
        ivDay2.setImageResource(R.drawable.day2);

        // (set more)
        ivDay2 = (ImageView) findViewById(R.id.imageView3);
        ivDay2.setImageResource(R.drawable.day3);
        ivDay2 = (ImageView) findViewById(R.id.imageView4);
        ivDay2.setImageResource(R.drawable.day4);
        ivDay2 = (ImageView) findViewById(R.id.imageView5);
        ivDay2.setImageResource(R.drawable.day5);

    }
}
