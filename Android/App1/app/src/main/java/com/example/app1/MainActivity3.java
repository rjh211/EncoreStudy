package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.app1.model.Member;

public class MainActivity3 extends AppCompatActivity {
    private TextView txtView1;
    private TextView txtView2;
    private TextView txtView3;
    private Intent intent;

    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtView1 = findViewById(R.id.textView);
        txtView2 = findViewById(R.id.textView2);
        txtView3 = findViewById(R.id.textView3);

        editText1 = findViewById(R.id.editTextTextPersonName2);
        editText2 = findViewById(R.id.editTextTextPersonName3);

        intent = getIntent();
        String m = intent.getStringExtra("msg");
        int n = intent.getIntExtra("number",0);
        Member member = (Member)intent.getSerializableExtra("m");

        editText1.setText(member.getName());
        editText2.setText(member.getTel());

        txtView1.setText(m);
        txtView2.setText(n+"");
        txtView3.setText(member.toString());
    }
    public void onGoBack(View view){
        Member m = new Member();
        m.setName(editText1.getText().toString());
        m.setTel(editText2.getText().toString());
        intent.putExtra("m",m);
        setResult(RESULT_OK, intent);
        finish();
    }
}