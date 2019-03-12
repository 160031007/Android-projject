package com.example.gowtham.image;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class GateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.sample,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1 :
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String shareBody="Your Body here";
                String shareSub="your subject here";
                i.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                i.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(i,"share using"));
                return true;
            case R.id.item2 :
                Intent in =new Intent(getApplicationContext(),RateActivity.class);
                startActivity(in);
                return true;
            case R.id.item3 :
                Intent im=new Intent(getApplicationContext(),ContactusActivity.class);
                startActivity(im);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void buynow(View view) {
        Intent i=new Intent(getApplicationContext(),BuynowActivity.class);
        startActivity(i);
    }
}
