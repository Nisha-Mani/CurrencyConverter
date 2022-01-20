package com.nisha.imgchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void changeColor(View view){
        ImageView imageViewContainer = (ImageView) findViewById(R.id.imageViewContainer);
        imageViewContainer.setImageResource(R.drawable.pink_marble);
        Log.i("Info","Button clicked");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}