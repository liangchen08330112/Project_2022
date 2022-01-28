package cn.edu.sict.spring_festival_bilibili;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

import cn.edu.sict.project_2022.R;

public class Lc0202_b101 extends Activity {
    //定义年、月、日变量，准备DatePicker
    int year;
    int month;
    int day;
    DatePicker Project_lc0204_b101_Dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0202_b101);
        initView();
    }
    private void initView(){
        //利用findViewById找到日期选择器资源
        Project_lc0204_b101_Dp = (DatePicker) findViewById(R.id.Project_lc0204_b101_Dp);
        //利用getInstance()方法获取指定日期
        Calendar calendar = Calendar.getInstance();
        //获取年月日
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        Project_lc0204_b101_Dp.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                Lc0202_b101.this.year = year;
                Lc0202_b101.this.month = month;
                Lc0202_b101.this.day = day;
                show(year,monthOfYear,dayOfMonth);
            }
        });
    }
    private void show(int year,int month,int day){
        String str = year+"年"+month+"月"+day+"日";
        //运用Toast生成带有年月日的对话框，并展示在手机上
        Toast.makeText(Lc0202_b101.this,str,Toast.LENGTH_SHORT).show();
    }
}