package com.example.gowtham.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContactusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
    }

    public void save(View view) {
        Toast.makeText(this,  "We will be back with a solution", Toast.LENGTH_SHORT).show();
    }
}
