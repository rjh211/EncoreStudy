package com.example.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.app1.model.Member;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> datas;
    private ArrayList<Member> members;
    private ArrayAdapter<Member> mAdapter;
    private ArrayAdapter<String> aa;
    private ListView lv;
    private EditText str;
    private EditText telStr;
    private EditText imageStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView1);
        str = findViewById(R.id.editTextTextPersonName);
        telStr = findViewById(R.id.editTextTextPersonTel);
        imageStr = findViewById(R.id.editTextTextPersonImage);

        datas = new ArrayList<String>();
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,datas);

        members = new ArrayList<Member>();
        members.add(new Member("name1", "11111", "Image1",1,1));
        members.add(new Member("name2", "2222", "Image2",1,1));
        members.add(new Member("name3", "3333", "Image3",0,0));
        members.add(new Member("name4", "4444", "Image4",1,0));
        mAdapter = new PhoneAdaptor(this,R.layout.itemlayout,members);
        lv.setAdapter(mAdapter);

        //이벤트 리스너
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Toast.makeText(MainActivity.this,members.get(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });
        registerForContextMenu(lv);     //listview에 context menu를 붙임
    }

    public void onSave(View view){
/*        String name = str.getText().toString();
        String tel = telStr.getText().toString();
        String image = imageStr.getText().toString();

        members.add(new Member(name, tel, image,0,0));
        str.setText("");
        telStr.setText("");
        imageStr.setText("");
        mAdapter.notifyDataSetChanged();//데이터 갱신 => UI 갱신*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {                                                         //우측 상단의 메뉴
        menu.add(0, Menu.FIRST, 0,"add");
        menu.add(0, Menu.FIRST+1, 0,"delete");
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {       //길게누르면 뜨는메뉴
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("UPDATE");
        menu.add(0,Menu.FIRST,0,"edit");
        menu.add(0,Menu.FIRST+1,0,"delete");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case 1:
                Toast.makeText(MainActivity.this,"option menu : add",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this,"option menu : delete",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int idx = info.position;
        System.out.println(item.getMenuInfo());
        switch(item.getItemId()){
            case 1:
                Toast.makeText(MainActivity.this, idx+1 + "번째 데이터 수정",Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this, idx+1 + "번째 데이터 삭제",Toast.LENGTH_SHORT).show();
                members.remove(idx);
                mAdapter.notifyDataSetChanged();
                break;
            default:
                break;
        }
        return true;
    }


}