package com.example.classtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv = (ListView) findViewById(R.id.lv1);

        ArrayList<String> counting = new ArrayList<String>();

        counting.add("Musa Akber Ali");
        counting.add("Anas Akber Ali");
        counting.add("Saad Sarwar Ali");
        counting.add("Abdul Hadi Ali");
        counting.add("Akber Ali");
        counting.add("Shahroze Sarwar Ali");
        counting.add("Anas Akber Ali");
        counting.add("Saad Sarwar Ali");
        counting.add("Abdul Hadi Ali");
        counting.add("Akber Ali");
        counting.add("Shahroze Sarwar Ali");
        counting.add("Anas Akber Ali");
        counting.add("Saad Sarwar Ali");
        counting.add("Abdul Hadi Ali");
        counting.add("Akber Ali");
        counting.add("Shahroze Sarwar Ali");
        counting.add("Anas Akber Ali");
        counting.add("Saad Sarwar Ali");
        counting.add("Abdul Hadi Ali");
        counting.add("Akber Ali");
        counting.add("Shahroze Sarwar Ali");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, counting);
        lv.setAdapter(adapter);

    }
}