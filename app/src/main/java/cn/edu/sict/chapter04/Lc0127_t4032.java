package cn.edu.sict.chapter04;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cn.edu.sict.project_2022.R;

public class Lc0127_t4032 extends AppCompatActivity implements View.OnClickListener {
    private EditText Project_lc0127_t4032_etnumber;
    private TextView Project_lc0127_t4032_textView;
    private Button Project_lc0127_t4032_alipay;
    private Button Project_lc0127_t4032_wechat;

    //定义常量作为resultCode:
    public static final int ALIPAY_CODE = 0;
    public static final int WECHAT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0127_t4032);
        initView();
    }

    private void initView() {
        setContentView(R.layout.activity_lc0127_t4032);
        Project_lc0127_t4032_etnumber = (EditText) findViewById(R.id.Project_lc0127_t4032_etnumber);
        Project_lc0127_t4032_alipay = (Button) findViewById(R.id.Project_lc0127_t4032_alipay);
        Project_lc0127_t4032_wechat = (Button) findViewById(R.id.Project_lc0127_t4032_wechat);
        Project_lc0127_t4032_textView = (TextView) findViewById(R.id.Project_lc0127_t4032_textView);

        Project_lc0127_t4032_alipay.setOnClickListener(this);
        Project_lc0127_t4032_wechat.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String etnumber = Project_lc0127_t4032_etnumber.getText().toString().trim();
        if(TextUtils.isEmpty(etnumber)){  //如果输入金额为空，会在界面底部输出“请输入充值金额”的提示。
            Toast.makeText(this,"请输入充值金额",Toast.LENGTH_SHORT).show();
            return;
        }
        //将用户输入的String字符串转化为int类型
        int amount = Integer.parseInt(etnumber);
        //将int值保存在Intent对象中，等待传递
        Intent data = getIntent();
        data.putExtra("amount",amount);
        switch (view.getId()) {
            case R.id.Project_lc0127_t4032_alipay:
                //设置resultCode，并传递数据给第一个界面
                setResult(ALIPAY_CODE,data);
                break;
            case R.id.Project_lc0127_t4032_wechat:
                //设置resultCode，并传递数据给第一个界面
                setResult(WECHAT_CODE,data);
                break;
        }
        //返回上一层
        finish();
    }
}
