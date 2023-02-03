package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void doller(View view){
        EditText editText = (EditText) findViewById(R.id.amountText);
        String rupee = editText.getText().toString();
        if(!rupee.equals("")) {
            double rs = Double.parseDouble(rupee);
            double amt = 0.012 * rs;
            Toast.makeText(this, "$ " + amt, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Enter Amount", Toast.LENGTH_SHORT).show();
        }

    }

    public void pound(View view){
        EditText editText = (EditText) findViewById(R.id.amountText);
        String rupee = editText.getText().toString();
        if(!rupee.equals("")) {
            double rs = Double.parseDouble(rupee);
            double amt = 0.0100 * rs;
            Toast.makeText(this, "£ " + amt, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Enter Amount", Toast.LENGTH_SHORT).show();
        }
    }

    public void euro(View view){
        EditText editText = (EditText) findViewById(R.id.amountText);
        String rupee = editText.getText().toString();
        if(!rupee.equals("")) {
            double rs = Double.parseDouble(rupee);
            double amt = 0.012 * rs;
            Toast.makeText(this, "€ " + amt, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Enter Amount", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}