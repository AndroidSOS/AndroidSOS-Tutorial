package com.example.stuart.tutorialanimation;
 
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
 
public class MainActivity extends AppCompatActivity {
 
    ImageView imgMan;
    AnimationDrawable manAnimation;
    Drawable correr;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        imgMan = (ImageView) findViewById(R.id.imageView);
        imgMan.setBackgroundResource(R.drawable.correr);
        manAnimation = (AnimationDrawable)imgMan.getBackground();
 
        imgMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manAnimation.start();
            }
        });
    }
 
 
}
