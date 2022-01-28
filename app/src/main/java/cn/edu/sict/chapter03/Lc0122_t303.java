package cn.edu.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import cn.edu.sict.project_2022.R;

public class Lc0122_t303 extends AppCompatActivity {

    RadioGroup activity_lc0122_rg_sex;
    CheckBox activity_lc0122_cb_programming,activity_lc0122_cb_reading,activity_lc0122_cb_travelling;
    EditText activity_lc0122_et_email;
    ImageView activity_lc0122_iv_check;
    Button activity_lc0122_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0122_t303);

        activity_lc0122_rg_sex = findViewById(R.id.activity_lc0122_rg_sex);
        activity_lc0122_cb_programming = findViewById(R.id.activity_lc0122_cb_programmming);
        activity_lc0122_cb_travelling = findViewById(R.id.activity_lc0122_cb_travelling);
        activity_lc0122_cb_reading = findViewById(R.id.activity_lc0122_cb_reading);
        activity_lc0122_et_email = findViewById(R.id.activity_lc0122_et_email);
        activity_lc0122_iv_check = findViewById(R.id.activity_lc0122_iv_check);
        activity_lc0122_button = findViewById(R.id.activity_lc0122_button);

        //对单选按钮组绑定事件监听器
        // （当用户选定的单选按钮发生改变时，该事件监听器会被触发。）
        activity_lc0122_rg_sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                //如果用户选择了“男”
                if(checkedId == R.id.activity_lc0122_rb_male){
                    Toast.makeText(Lc0122_t303.this,"你选中了男性",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Lc0122_t303.this,"你选中了女性",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //在EditText上绑定了键盘事件监听器
        // （当用户在文本输入框输入内容时，会触发键盘事件监听器）
        activity_lc0122_et_email.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                String email = "";
                //判断事件的动作是否是松开按键
                if(keyEvent.getAction()==keyEvent.ACTION_UP) {
                    email = activity_lc0122_et_email.getText().toString();
                    /*str.indexOf(String a):
                    如果在str字符串中存在a字符串，则indexOf方法返回a在字符串中出现位置的索引,反之返回-1
                     */
                    if(email.indexOf("@")!=-1 && email.indexOf("@")<email.indexOf(".")){
                        activity_lc0122_iv_check.setImageResource(R.drawable.t303_right);
                    }else{
                        activity_lc0122_iv_check.setImageResource(R.drawable.t303_wrong);
                    }//判定输入的邮箱是否符合规范
                }
                //建议返回false,意味着该键盘事件继续向外扩散，使得EditText可以得知用户输入
                //如果返回true，则EditText无法接收用户输入的内容
                return false;
            }
        });
        activity_lc0122_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //定义一个字符串，存放复选框选择的结果
                String str = "";
                if(activity_lc0122_cb_programming.isChecked()==true){
                    str += "编程 ";
                }
                if(activity_lc0122_cb_reading.isChecked()==true){
                    str += "阅读 ";
                }
                if(activity_lc0122_cb_travelling.isChecked()==true){
                    str += "旅游 ";
                }
                Toast.makeText(Lc0122_t303.this,str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}