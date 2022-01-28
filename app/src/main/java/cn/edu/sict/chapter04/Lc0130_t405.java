package cn.edu.sict.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.edu.sict.project_2022.R;

public class Lc0130_t405 extends AppCompatActivity implements View.OnClickListener {
    private Button Project_lc0130_button1;
    private Button Project_lc0130_button2;
    private Button Project_lc0130_button3;
    private Button Project_lc0130_button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0130_t405);
        initView();
    }

    private void initView(){
        Project_lc0130_button1 = (Button) findViewById(R.id.Project_lc0130_button1);
        Project_lc0130_button2 = (Button) findViewById(R.id.Project_lc0130_button2);
        Project_lc0130_button3 = (Button) findViewById(R.id.Project_lc0130_button3);
        Project_lc0130_button4 = (Button) findViewById(R.id.Project_lc0130_button4);

        Project_lc0130_button1.setOnClickListener(this);
        Project_lc0130_button2.setOnClickListener(this);
        Project_lc0130_button3.setOnClickListener(this);
        Project_lc0130_button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();  //新建Intent对象
        switch(view.getId()){
            case R.id.Project_lc0130_button1:  //第一个按钮：打开山东商业职业技术学院官网
                //设置Intent的属性：
                //Action、Data
                intent.setAction(Intent.ACTION_VIEW);
                //对于Data，需要给一个Uri对象
                Uri uriNet = Uri.parse("www.sict.edu.cn");
                intent.setData(uriNet);
                break;
            case R.id.Project_lc0130_button2:  //第二个按钮：选择图片
                intent.setAction(Intent.ACTION_PICK);
                intent.setType("image/*");
                break;
            case R.id.Project_lc0130_button3:  //第三个按钮：打电话
                intent.setAction(Intent.ACTION_CALL);
                Uri uriPhone = Uri.parse("tel:13355458896");
                intent.setData(uriPhone);
                break;
            case R.id.Project_lc0130_button4:  //第四个按钮发短信
                intent.setAction(Intent.ACTION_SENDTO);
                Uri uriMessage = Uri.parse("smsto:13355458896");
                intent.setData(uriMessage);
                intent.putExtra("sms_body","程序测试");
                break;
        }
        startActivity(intent);
    }
}