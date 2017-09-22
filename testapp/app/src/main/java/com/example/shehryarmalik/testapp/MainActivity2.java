package com.example.shehryarmalik.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import java.util.TimeZone;
import java.util.Calendar;
import android.widget.TimePicker;
import android.content.Intent;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.android.volley.toolbox.ImageLoader;
import com.squareup.picasso.Picasso;

import android.widget.ImageView;



public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String answer;
        Bundle extras = getIntent().getExtras();

        if (extras == null)  {
            answer = "GMT";
        }
        else {
            String temp = "";
            temp = extras.getString("time");
            if (temp.equals("US Eastern")) {
                answer = "GMT-04:00";
            } else if (temp.equals("US Pacific")) {
                answer = "GMT-07:00";
            } else if (temp.equals("US Central")) {
                answer = "GMT-05:00";
            } else {
                answer = "GMT";
            }

        }

        TimeZone tz = TimeZone.getTimeZone(answer);

        Calendar c = Calendar.getInstance(tz);

        TimePicker picker = (TimePicker) findViewById(R.id.timePicker);
        picker.setHour(c.get(Calendar.HOUR_OF_DAY));
        picker.setMinute(c.get(Calendar.MINUTE));

//        RequestQueue queue = Volley.newRequestQueue(this);
//
//        String url ="http://www.google.com";


//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);

        // Loader image - will be shown before loading image
//        int loader = R.drawable.loader;
//        // Imageview to show
//       ImageView imageView = (ImageView) findViewById(R.id.imageView2);
//
//        // Image url
//        String image_url = "https://api.androidhive.info/images/sample.jpg";
//
//        // ImageLoader class instance
//        ImageLoader imgLoader = new ImageLoader(getApplicationContext());
//
//        // whenever you want to load an image from url
//        // call DisplayImage function
//        // url - image url to load
//        // loader - loader image, will be displayed before getting image
//        // image - ImageView
//        imgLoader.DisplayImage(image_url, loader, image);

//        Picasso.with(this)
//                .load("/Users/shehryarmalik/Documents/meme.png")
//                .resize(10,20)
//                .centerCrop()
//                .into(imageView);

//        imageView.setImageResource(R.drawable.meme);

    }

}
