package cn.edu.sict.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.edu.sict.project_2022.R;

public class Lc0126_t4021 extends AppCompatActivity implements View.OnClickListener {
    //资源准备
    private EditText Project_lc01262_et_name;
    private EditText Project_lc01262_et_class;
    private Button Project_lc01262_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        //利用findViewById找到我们需要的资源
        Project_lc01262_et_name = (EditText) findViewById(R.id.Project_lc01262_et_class);
        Project_lc01262_et_class = (EditText) findViewById(R.id.Project_lc01262_et_class);
        Project_lc01262_button = (Button) findViewById(R.id.Project_lc01262_button);
        //事件监听器
        Project_lc01262_button.setOnClickListener(this);
    }
    //设置onClick方法
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Project_lc01262_button:
                summit();
                break;
        }
    }
    //提交信息，并设置返回值
    private void summit() {
        String name = Project_lc01262_et_name.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "请输入你的姓名", Toast.LENGTH_SHORT).show();
            return;
        }
        String classroom = Project_lc01262_et_class.getText().toString().trim();
        if (TextUtils.isEmpty(classroom)) {
            Toast.makeText(this, "请输入你的班级", Toast.LENGTH_SHORT).show();
            return;
        }
        //新建intent信使对象
        Intent intent = new Intent(Lc0126_t4021.this, Lc0126_t4022.class);
        intent.putExtra("name", name);
        intent.putExtra("class", classroom);
        startActivity(intent);
    }
}
