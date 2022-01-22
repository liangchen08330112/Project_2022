package cn.edu.sict.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.edu.sict.project_2022.R;

public class Lc0125_t401 extends AppCompatActivity {

    private EditText Project_lc0126_t401_editName;
    private EditText Project_lc0126_t401_editPassword;
    private Button Project_lc0126_t401_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0125_t401);
        initView();
    }
    private void initView(){
        //运用findViewByID找到我们需要的资源
        Project_lc0126_t401_editName = (EditText) findViewById(R.id.Project_lc0126_t401_editName);
        Project_lc0126_t401_editPassword = (EditText) findViewById(R.id.Project_lc0126_t401_editPassword);
        Project_lc0126_t401_button = (Button) findViewById(R.id.Project_lc0126_t401_button);

        Project_lc0126_t401_button.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View view){
        switch(view.getId()){
            case R.id.Project_lc0126_t401_button:

                //创建一个Intent对象作为信使：
                Intent intent = new Intent(Lc0125_t401.this, Lc0125_t4012.class);
                intent.setClass(Lc0125_t401.this, Lc0125_t4012.class);

                //获取用户输入的用户名和密码，并把它们传递到第二个界面中：
                String name = Project_lc0126_t401_editName.getText().toString().trim();
                String password = Project_lc0126_t401_editPassword.getText().toString().trim();
                //创建Bundle对象bundle，并向其中添加数据
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("password",password);
                //将bundle传递给intent
                intent.putExtras(bundle);
                //打开新界面
                startActivity(intent);
        }
    }
}