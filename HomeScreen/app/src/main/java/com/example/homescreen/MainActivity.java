package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class MainActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.an1);
        TextView textView1 = (TextView) findViewById(R.id.an2);

        CollectionReference collectionRef = db.collection("Announcement");
        collectionRef.get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                // Iterate through the documents in the collection
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    // Extract the data from each document
                    String data = document.getString("Title1");
                    String data1 = document.getString("title2");
                    textView.setText(data);
                    textView1.setText(data1);
                    // Do something with the data
                }
            }
        });


    }
}