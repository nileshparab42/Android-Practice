package com.example.basicsofandroid;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view){
        EditText userName = (EditText) findViewById(R.id.userName);
        EditText userPassword = (EditText) findViewById(R.id.userPassword);
        Log.i(TAG, "Successful");
        Log.i(TAG, userName.getText().toString());
        Log.i(TAG, userPassword.getText().toString());
        Toast.makeText(this, "Hello "+userName.getText().toString()+" !", Toast.LENGTH_SHORT).show();
        ImageView starting = (ImageView) findViewById(R.id.imageView);
        starting.setImageResource(R.drawable.welcome);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}