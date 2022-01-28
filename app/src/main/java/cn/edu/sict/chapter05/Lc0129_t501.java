package cn.edu.sict.chapter05;

//Lc0129_t5012为XML+Java方法实现ListView
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cn.edu.sict.project_2022.R;

public class Lc0129_t501 extends AppCompatActivity {

    private ListView Project_lc0129_t5012_listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0129_t501);
        initView();
        String[] district = {"芝罘区","莱山区","烟台开发区","福山区","牟平区","烟台高新区","蓬莱区"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Lc0129_t501.this, android.R.layout.simple_list_item_1,district);
        Project_lc0129_t5012_listView2.setAdapter(adapter);
    }

    private void initView(){
        Project_lc0129_t5012_listView2 = (ListView) findViewById(R.id.Project_lc0129_t5012_listView2);
    }
}