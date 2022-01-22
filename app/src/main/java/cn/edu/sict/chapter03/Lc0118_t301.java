package cn.edu.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cn.edu.sict.project_2022.R;

public class Lc0118_t301 extends AppCompatActivity {
    int[] imgSrc = {R.drawable.t301_chicken,R.drawable.t301_cow,R.drawable.t301_dog,R.drawable.t301_horse,R.drawable.t301_rat,R.drawable.t301_mokey};
    int current = 0;
    ImageView Project_lc0118_image01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0118_t2);

        Button Project_lc0118_buttonup = findViewById(R.id.Project_lc0118_buttonup);
        Button Project_lc0118_buttondown = findViewById(R.id.Project_lc0118_buttondown);
        Project_lc0118_image01 = findViewById(R.id.Project_lc0118_image01);

        Project_lc0118_buttonup.setOnClickListener(new MyListener());
        Project_lc0118_buttondown.setOnClickListener(new MyListener());
    }

    //内部类实现的事件监听器
    class MyListener implements View.OnClickListener {

        //事件处理器
        @Override
        public void onClick(View view) {

            //区分事件源
            if (view.getId() == R.id.Project_lc0118_buttonup) { //如果被点击的是上一张
                //显示上一张
                if (current == 0) { //当前在第一页，第一页的上一页是最后一张
                    current = imgSrc.length - 1;
                } else {
                    current--; //显示出数组中的第current张图片。
                    Project_lc0118_image01.setImageResource(imgSrc[current]);
                }
            }else if(view.getId()==R.id.Project_lc0118_buttondown){//如果被点击的是下一张
                //显示下一张
                if(current== imgSrc.length-1){ //最后一页的下一页是第一页
                    current = 0;
                }else{
                    current++;
                    Project_lc0118_image01.setImageResource(imgSrc[current]);
                }
            }
        }
    }
}