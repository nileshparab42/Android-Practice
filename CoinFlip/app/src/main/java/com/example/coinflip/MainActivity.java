package com.example.coinflip;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void flip(View view){
        final int random = new Random().nextInt(2);
        ImageView coin = (ImageView) findViewById(R.id.coinView);
        if(random==0){
            coin.setImageResource(R.drawable.heads);
            Toast.makeText(this, "Heads", Toast.LENGTH_SHORT).show();
        }
        else {
            coin.setImageResource(R.drawable.tails);
            Toast.makeText(this, "Tails", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}