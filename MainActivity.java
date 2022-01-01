package com.example.autocomplete_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText fill1,fill2;
    AutoCompleteTextView fill3;
    String[] suggestions = {"Bangalore","Hyderabad","Delhi","Kolkata","Mumbai","Belgaum"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.Submit);
        fill1 = findViewById(R.id.Fill_FName);
        fill2 = findViewById(R.id.Fill_LName);
        fill3 = (AutoCompleteTextView) findViewById(R.id.Fill_Birth);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, suggestions);

        fill3.setThreshold(1);
        fill3.setAdapter(adapter);


        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String fname,lname,loc;

                fname = fill1.getText().toString();
                lname = fill2.getText().toString();
                loc = fill3.getText().toString();

                Toast.makeText(getApplicationContext(),"First Name: "+fname+"\nLast Name: "+lname+"\nBirth Place: "+loc, Toast.LENGTH_LONG).show();
            }
        });
    }
}