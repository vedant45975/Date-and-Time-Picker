package com.example.myapplication12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
DatePicker da;
TimePicker ti;
TextView t1,t2;
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        da=findViewById(R.id.dapic);
        ti=findViewById(R.id.timepic);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView3);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("date ="+da.getMonth()+"-"+da.getYear());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("date"+ti.getCurrentHour()+"-"+ti.getCurrentMinute());
            }
        });
    }
}