package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv2;
    private Double firstVal = null;
    private Double secondVal = null;
    private String op = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv2 = findViewById(R.id.textView2);
    }
    public void PrintObj(View view){
        Button b = (Button)view;
        String btnVal = b.getText().toString();
        tv2.setText(btnVal);
        if(btnVal.equals("C")) {
            tv2.setText("");
            firstVal = 0.0;
            secondVal = 0.0;
        }
        else if(btnVal.equals("=")){
            secondVal = Double.parseDouble(tv2.getText().toString());
            double result = 0.0;
            if(op == "/" && secondVal == 0) tv2.setText("INF");
            else if(op == "+") result = firstVal + secondVal;
            else if(op == "-") result = firstVal - secondVal;
            else if(op == "*") result = firstVal * secondVal;
            else if(op == "/") result = firstVal / secondVal;
            firstVal = result;
            tv2.setText(Double.toString(result));
        }
        else{
            try{
                String temp = tv2.getText().toString() + btnVal;
                tv2.setText(temp);
            }catch(Exception e){
                firstVal = Double.parseDouble((tv2.getText().toString()));
                op = btnVal;
                tv2.setText("");
            }
        }
    }


    public int Answer(int num1, int num2, String op){
        return 0;       //결과값 계산
    }
}