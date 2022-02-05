package cn.edu.sict.review_and_bilibili;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import cn.edu.sict.project_2022.R;

public class Lc0203_b102 extends AppCompatActivity {
    //准备TimePicker资源
    TimePicker Project_lc0203_timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0203_b102);
        initView();
    }
    private void initView(){
        //利用findViewById找到我们的资源
        Project_lc0203_timePicker = (TimePicker) findViewById(R.id.Project_lc0203_timePicker);
        //由于系统默认为12小时制，想要24小时制需要单独设置。
        Project_lc0203_timePicker.setIs24HourView(true);
        //绑定更改时间的监听器
        Project_lc0203_timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                //定义一个显示几时几分的字符串
                String str = hour+"时"+minute+"分";
                //运用Toast，为我们展示几时几分的对话框
                Toast.makeText(Lc0203_b102.this,str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}