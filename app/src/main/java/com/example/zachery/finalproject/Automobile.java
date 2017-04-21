package com.example.zachery.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Automobile extends Activity {

    private ListView listView1;
    String[] automobile = {"Temperature", "Radio Controls", "GPS", "Lights"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automobile);
        ListView listView1 = (ListView)findViewById(R.id.listview1);
        listView1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , automobile));

        listView1.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch( position )
                    {
                        case 0:  Intent newActivity = new Intent(Automobile.this, Temperature.class);
                            startActivity(newActivity);
                            break;
                        case 1:  Intent newActivity2 = new Intent(Automobile.this, RadioControls.class);
                            startActivity(newActivity2);
                            break;
                        case 2:  Intent newActivity3 = new Intent(android.content.Intent.ACTION_VIEW,
                                Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));
                            startActivity(newActivity3);
                            break;
                        case 3:  Intent newActivity4 = new Intent(Automobile.this, Lights.class);
                            startActivity(newActivity4);
                            break;
                    }
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onPause() {
        super.onPause();


    }
    @Override
    protected void onStop() {
        super.onStop();


    }
    @Override
    protected void onDestroy() {
        super.onDestroy();


    }


}
