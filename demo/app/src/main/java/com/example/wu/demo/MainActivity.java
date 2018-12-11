package com.example.wu.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private ArrayList list = new ArrayList();
    public void tian(View view){
        EditText text = (EditText)findViewById(R.id.e);
        String s = text.getText().toString();
        list.add(s);
        ListView listView = (ListView)findViewById(R.id.li);
        ArrayAdapter<String> ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);

    }

    //删除
    public void shan(View view){
        ListView lv = (ListView)findViewById(R.id.li);
        lv.removeFooterView(view);
    }
}
   