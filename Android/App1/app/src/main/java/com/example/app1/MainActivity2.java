package com.example.app1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import com.example.app1.model.Member;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private Spinner spinner;
    private ArrayList<String> lst;
    private ArrayList<Integer> lst2;
    private ArrayAdapter<String> adapter;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner = findViewById(R.id.spinner2);
        imageView = findViewById(R.id.imageView2);

        lst2 = new ArrayList();
        lst2.add(R.drawable.img1);
        lst2.add(R.drawable.img1);
        lst2.add(R.drawable.img1);

        lst = new ArrayList<>();
        lst.add("aaa");
        lst.add("bbb");
        lst.add("ccc");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, lst);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity2.this, lst.get(i), Toast.LENGTH_SHORT).show();
                imageView.setImageResource(lst2.get(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity2.this, "선택 항목없음", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onGoActivity(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("msg","Hello World");
        intent.putExtra("number", 7);
        Member m = new Member("name1", "11111", "Image1",1,1);
        intent.putExtra("m",m);
        startActivityForResult(intent, 1);      //어느 액티비티로 다녀왔는지 표시
    }
    //startActivityForResult()로 다른 액티비티 다녀오면 자동 호출됨, 다녀온 액티비티 처리 결과를 현재 엑티비티에 적용
    //requestCode : 어느 액티비티 다녀왔는지 확인
    //resultCode : 다녀온 엑티비티의 처리 결과가 정상인지 아닌지 확인
    // data : 다녀온 엑티비티 쪽에서 처리 결과를 보낸 인텐트
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            switch(requestCode){
                case 1:
                    Member m = (Member) data.getSerializableExtra("m");
                    Toast.makeText(this, m.toString(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}