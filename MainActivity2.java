package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText et;
Button res;
AutoCompleteTextView ac;
String[] places={"bangalore","bijapur","hubli","dharwad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.name);
        ac=findViewById(R.id.place);
        res=findViewById(R.id.but);

        ArrayAdapter array= new ArrayAdapter(this, android.R.layout.simple_list_item_1,places);

        ac.setThreshold(1);
        ac.setAdapter(array);
        res.setOnClickListener(v -> {
            String n,auto;
    n=et.getText().toString();
    auto=ac.getText().toString();

    Toast.makeText(getApplicationContext(),"Name:"+n+"\nPlace:"+auto,Toast.LENGTH_LONG).show();

        });
}
    }