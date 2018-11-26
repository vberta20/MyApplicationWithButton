package com.example.mavalerieberta.myapplicationwithbutton;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class buttonUpdate extends AppCompatActivity {

    Controller myController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_update);

        TextView tv = findViewById(R.id.textView);
        EditText et = findViewById(R.id.typeText);
        Button b = findViewById(R.id.buttonUpdate);

        ListView lv1 =  findViewById(R.id.listView1);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        lv1.setAdapter(arrayAdapter1);

        ListView lv2 =  findViewById(R.id.listView2);

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        lv2.setAdapter(arrayAdapter2);


        ImageView iv = findViewById(R.id.imageView);
        iv.setImageResource(R.mipmap.cat);

        myController = new Controller(tv, et, b, lv1, lv2, iv);



    }


}
