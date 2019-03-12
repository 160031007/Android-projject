package com.example.gowtham.image;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            case R.id.item4 :
                Intent is=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(is);
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }

    }



    public void inter(View view) {
        Intent i =new Intent(getApplicationContext(),secondaryeducation.class);
        startActivity(i);

    }

    public void undergraduation(View view) {
        Intent i=new Intent(getApplicationContext(),UgActivity.class);
        startActivity(i);

    }

    public void postgraduation(View view) {
    Intent i=new Intent(getApplicationContext(),PgActivity.class);
    startActivity(i);
    }
}
