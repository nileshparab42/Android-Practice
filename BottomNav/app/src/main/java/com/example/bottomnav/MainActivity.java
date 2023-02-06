package com.example.bottomnav;

import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.bottomnav.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
        homeTrans.replace(R.id.content,new Home());
        homeTrans.commit();

        binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.feed:
                        FragmentTransaction homeTrans = getSupportFragmentManager().beginTransaction();
                        homeTrans.replace(R.id.content,new Home());
                        homeTrans.commit();
//                        Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()){
                    case R.id.group:
                        FragmentTransaction groupTrans = getSupportFragmentManager().beginTransaction();
                        groupTrans.replace(R.id.content,new Groups());
                        groupTrans.commit();
//                        Toast.makeText(MainActivity.this, "Group Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()){
                    case R.id.table:
                        FragmentTransaction tableTrans = getSupportFragmentManager().beginTransaction();
                        tableTrans.replace(R.id.content,new Tables());
                        tableTrans.commit();
//                        Toast.makeText(MainActivity.this, "Table Selected", Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()){
                    case R.id.account:
                        FragmentTransaction AccTrans = getSupportFragmentManager().beginTransaction();
                        AccTrans.replace(R.id.content,new Account());
                        AccTrans.commit();
//                        Toast.makeText(MainActivity.this, "Account Selected", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}