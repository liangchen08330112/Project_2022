package cn.edu.sict.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import cn.edu.sict.project_2022.R;

public class Lc0126_t4022 extends AppCompatActivity {

    private TextView Project_lc01262_tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0126_t4022);
        initView();

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String classroom = intent.getStringExtra("class");
        Project_lc01262_tv_title.setText("姓名:"+name+"    班级:"+classroom);

    }
    private void initView(){
        Project_lc01262_tv_title = (TextView) findViewById(R.id.Project_lc01262_tv_title);
    }
}