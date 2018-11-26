package com.example.mavalerieberta.myapplicationwithbutton;


import android.media.Image;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class Controller {

    private TextView theTextView;
    private Button theButton;
    private EditText textEdit;
    private  ListView  theListView1;
    private ListView theListView2;
    private ArrayAdapter<String> arrayAdapter1;
    private ArrayAdapter<String> arrayAdapter2;
    private ImageView theImageView;


    Controller(final TextView textView, final EditText editText, Button button, final ListView lv1, final ListView lv2, final ImageView imageView) {

        theTextView = textView;
        textEdit = editText;
        theButton = button;
        theListView1 = lv1;
        theListView2 = lv2;
        arrayAdapter1 = (ArrayAdapter<String>)theListView1.getAdapter();
        arrayAdapter2 = (ArrayAdapter<String>)theListView2.getAdapter();
        theImageView = imageView;










        theTextView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                updateListView1();
                updateListView2();
                return true;

            }


        });

        textEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            updateWhenButtonPressed();
            return;
            }
        });
    }



    public void updateListView1(){
        arrayAdapter1.add(textEdit.getText().toString());
        arrayAdapter1.notifyDataSetChanged();
        textEdit.setText("");

    }



    public void updateListView2(){
        arrayAdapter2.add(theListView2.getAdapter().toString());
        arrayAdapter2.notifyDataSetChanged();
    }


    void updateWhenButtonPressed() {
        theTextView.setText("Do your checklist");
    }
}
