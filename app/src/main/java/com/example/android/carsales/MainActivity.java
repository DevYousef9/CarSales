package com.example.android.carsales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This Is The Way To Declare The Elements In Java
        //We Must Use find by id to know the elemnt
        //Also we must give the elem
        TextView text_view = (TextView) (findViewById(R.id.text));
        ImageView image_view = (ImageView) (findViewById(R.id.image));
    }
}
