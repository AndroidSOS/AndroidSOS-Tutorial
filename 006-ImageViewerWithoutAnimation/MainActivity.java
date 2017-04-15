package com.example.androidsos.imageviewerwithoutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,imgZoomed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        imgZoomed=(ImageView)findViewById(R.id.imgZoomed);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        imgZoomed.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img1:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa1);
                break;
            case R.id.img2:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa2);
                break;
            case R.id.img3:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa3);
                break;
            case R.id.img4:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa4);
                break;
            case R.id.img5:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa5);
                break;
            case R.id.img6:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa6);
                break;
            case R.id.img7:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa7);
                break;
            case R.id.img8:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa8);
                break;
            case R.id.img9:
                imgZoomed.setVisibility(View.VISIBLE);
                imgZoomed.bringToFront();
                imgZoomed.setImageResource(R.drawable.lisboa9);
                break;
            case R.id.imgZoomed:
                imgZoomed.setVisibility(View.INVISIBLE);
                imgZoomed.setImageResource(0);
                break;

        }
    }
}
