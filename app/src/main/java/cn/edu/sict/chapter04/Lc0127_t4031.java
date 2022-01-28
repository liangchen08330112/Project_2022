package cn.edu.sict.chapter04;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import cn.edu.sict.project_2022.R;

public class Lc0127_t4031 extends AppCompatActivity implements View.OnClickListener {

    private TextView Project_lc0127_t4031_tvtitle;
    private Button Project_lc0127_t4031_btn_phone;
    private Button Project_lc0127_t4031_btn_vip;
    private Button Project_lc0127_t4031_btn_qb;

    //定义常量用作requestCode:
    public static final int PHONE_CODE = 0;
    public static final int VIP_CODE = 1;
    public static final int QB_CODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0127_t4031);
        initView();
    }
    //定义一个initView方法
    private void initView(){
        //利用findViewById找到我们的资源
        Project_lc0127_t4031_tvtitle = (TextView) findViewById(R.id.Project_lc0127_t4031_tvtitle);
        Project_lc0127_t4031_btn_phone = (Button) findViewById(R.id.Project_lc0127_t4031_btn_phone);
        Project_lc0127_t4031_btn_vip = (Button) findViewById(R.id.Project_lc0127_t4031_btn_vip);
        Project_lc0127_t4031_btn_qb = (Button) findViewById(R.id.Project_lc0127_t4031_btn_qb);

        //给三个充值按钮绑定事件监听器
        Project_lc0127_t4031_btn_phone.setOnClickListener(this);
        Project_lc0127_t4031_btn_vip.setOnClickListener(this);
        Project_lc0127_t4031_btn_qb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //新建一个Intent对象
        Intent intent = new Intent(Lc0127_t4031.this,Lc0127_t4032.class);
        switch (view.getId()){
            case R.id.Project_lc0127_t4031_btn_phone:  //使用手机充值
                //设置requestCode并跳转界面
                startActivityForResult(intent,PHONE_CODE);
                break;
            case R.id.Project_lc0127_t4031_btn_vip:  //给会员续个费
                startActivityForResult(intent,VIP_CODE);
                break;
            case R.id.Project_lc0127_t4031_btn_qb:  //冲个Q币
                startActivityForResult(intent,QB_CODE);
                break;
        }
    }
    //回调：当从本页面启动的其他页面返回的时候，会自动调用回调方法。
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //一、Toast提示支付内容、支付工具和支付金额
        //Step 1:建立结果字符串
        String str = "";
        //Step 2:以通过支付宝给手机充值50元为例，判断resultCode
        if(resultCode==Lc0127_t4032.ALIPAY_CODE){
            str += "通过支付宝";
        }else if(resultCode == Lc0127_t4032.WECHAT_CODE){
            str += "通过微信支付";
        }
        //判断requestCode
        if(requestCode==PHONE_CODE){
            str+="充值话费";
        }else if(requestCode==VIP_CODE){
            str+="给会员续费";
        }else if(requestCode==QB_CODE){
            str+="充值Q币";
        }
        //获取第二个页面传回的数据
        if(data!=null){
            int amount = data.getIntExtra("amount",0);
            str += "金额为"+amount+"元";
        }
        //把结果展示在Toast提示框中
        Toast.makeText(Lc0127_t4031.this,str,Toast.LENGTH_SHORT).show();
        //如果是从第二个界面返回的，那么更改本页面的TextView内容（显示充值成功）
        if(str.length()!=0){
            Project_lc0127_t4031_tvtitle.setText("支付成功！是否继续支付？");
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}