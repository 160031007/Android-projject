package com.example.gowtham.image;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PgActivity extends AppCompatActivity {
 ListView list;
    String titles[] = {"Official GRE Qunatitative Reasoning Questions ", "GATE Computer Science and IT 2019", "GMAT Official Guide 2019", "The Official Cambridge Guide To IELTS 2018", "TOFEL Strategies and Tips"};
    String description[] = {"Rs. 498", "Rs. 698", "Rs. 1484", "Rs. 435", "Rs. 399"};
    int imgs[] = {R.drawable.gre, R.drawable.gate, R.drawable.gmat, R.drawable.ielts, R.drawable.tofel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg);
        list=findViewById(R.id.cus_list_view);
         myAdapter adapter=new myAdapter(this,titles,imgs,description);
         list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i=new Intent(getApplicationContext(),GreActivity.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i=new Intent(getApplicationContext(),GateActivity.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i =new Intent(getApplicationContext(),GmatActivity.class);
                    startActivity(i);
                } else if (position == 3) {
                    Intent i=new Intent(getApplicationContext(),IeltsActivity.class);
                    startActivity(i);
                } else if (position == 4) {
                    Intent i =new Intent(getApplicationContext(),TofelActivity.class);
                    startActivity(i);
                }

            }
        });
    }
    class  myAdapter extends ArrayAdapter<String> {
        Context context;
        String myTitles[];
        String[] myDescription;
        int [] imgs;

        public myAdapter(@NonNull Context c, String[] titles, int []imgs, String[] description) {
            super(c, R.layout.interrow,R.id.text1,titles);
            this.context = c;
            this.imgs = imgs;
            this.myTitles = titles;
            this.myDescription = description;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.interrow, parent, false);
            ImageView images = (ImageView) row.findViewById(R.id.logo);
            TextView myTitle = (TextView) row.findViewById(R.id.text1);
            TextView myDescription = (TextView) row.findViewById(R.id.text2);
            images.setImageResource(imgs[position]);
            myTitle.setText(titles[position]);
            myDescription.setText(description[position]);
            return row;
        }
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

}

