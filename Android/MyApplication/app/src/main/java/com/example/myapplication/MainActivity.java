package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView1);
    }
    public void onClickBtn(View view){
        Button b = (Button)view;
        String txt = b.getText().toString();
        tv.setText(txt);
    }
    public void onClickbtn1(View view){
        tv.setText("btn1");
    }
    public void onClickbtn2(View view){
        tv.setText("btn2");
    }
    public void onClickbtn3(View view){
        //Toast.makeText(MainActivity.this,"button1 click", Toast.LENGTH_LONG).show();
        tv.setText("btn3");
    }

}