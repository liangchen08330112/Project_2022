package cn.edu.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cn.edu.sict.project_2022.R;

public class Lc0118_t3012 extends AppCompatActivity {

    //1.资源准备(包括了变量、图片和控件)
    int[] imgSrc = {R.drawable.t301_chicken, R.drawable.t301_cow, R.drawable.t301_dog,
            R.drawable.t301_horse, R.drawable.t301_mokey, R.drawable.t301_rat};
    int current = 0; //当前播放到第几张图片
    ImageView Project_lc01182_image01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0118_t3012);

        Button Project_lc01182_buttonup = findViewById(R.id.Project_lc01182_buttonup); //上一张按钮
        Button Project_lc01182_buttondown = findViewById(R.id.Project_lc01182_buttondown); //下一张按钮
        Project_lc01182_image01 = findViewById(R.id.Project_lc01182_image01);

        //2.创建外部类实现的事件监听器

        //3.将事件监听器对象绑定到事件源（两个按钮）
        T301_myListener listener = new T301_myListener(current,imgSrc,Project_lc01182_image01); //新建一个listener对象，再传入三个参数
        Project_lc01182_buttonup.setOnClickListener(listener);
        Project_lc01182_buttondown.setOnClickListener(listener);
    }
}