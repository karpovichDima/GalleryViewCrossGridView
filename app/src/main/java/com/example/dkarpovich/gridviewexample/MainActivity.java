package com.example.dkarpovich.gridviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    static final String[] MOBILE_OS = new String[] {
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry",
            "Android", "iOS","Windows", "Blackberry"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView1);

        gridView.setAdapter(new ImageAdapter(this, MOBILE_OS));

        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        ((TextView) v.findViewById(R.id.grid_item_label))
                                .getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}