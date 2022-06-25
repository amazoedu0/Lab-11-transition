package com.example.lab11;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;

    int screen=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(screen==0) {
                    imageView.setImageResource(R.drawable.trans_circle);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(2000);
                    screen=1;
                }
                else if(screen==1) {
                    imageView.setImageResource(R.drawable.trans_square);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(2000);
                    screen=2;
                }
                else if(screen==2) {
                    imageView.setImageResource(R.drawable.trans_triangle);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(2000);
                    screen=0;
                }
            }
        });
    }
}