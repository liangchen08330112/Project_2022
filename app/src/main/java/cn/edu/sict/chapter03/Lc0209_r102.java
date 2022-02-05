package cn.edu.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import cn.edu.sict.project_2022.R;

public class Lc0209_r102 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0123_t305);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Toast.makeText(Lc0209_r102.this, "你点击的是返回键", Toast.LENGTH_SHORT).show();
            return true;
        } else if (event.getKeyCode() == KeyEvent.KEYCODE_MENU) {
            Toast.makeText(Lc0209_r102.this, "你点击的是菜单键", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}