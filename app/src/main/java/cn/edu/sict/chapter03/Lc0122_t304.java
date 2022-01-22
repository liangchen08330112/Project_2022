package cn.edu.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import cn.edu.sict.project_2022.R;

public class Lc0122_t304 extends AppCompatActivity {
    EditText activity_lc01222_et_password01,activity_lc01222_et_password02;
    TextView activity_lc01222_tv_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_lc01222_et_password01 = findViewById(R.id.activity_lv01222_et_password01);
        activity_lc01222_et_password02 = findViewById(R.id.activity_lv01222_et_password02);
        activity_lc01222_tv_check = findViewById(R.id.activity_lc01222_tv_check);

        activity_lc01222_et_password02.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                String password1 = "";
                String password2 = "";
                if(keyEvent.getAction()==keyEvent.ACTION_UP) {
                    password1 = activity_lc01222_et_password01.getText().toString();
                    password2 = activity_lc01222_et_password02.getText().toString();
                    if (password1.equals(password2)) {
                        activity_lc01222_tv_check.setText("通过！");
                    } else {
                        activity_lc01222_tv_check.setText("两次密码输入不一致");
                    }
                }
                return false;
            }
        });
    }
}