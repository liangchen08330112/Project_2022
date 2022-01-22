package cn.edu.sict.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cn.edu.sict.project_2022.R;

public class Lc0118_t3013 extends AppCompatActivity {

    int[] imgSrc = {R.drawable.t301_mokey, R.drawable.t301_horse, R.drawable.t301_rat, R.drawable.t301_dog, R.drawable.t301_cow, R.drawable.t301_chicken};
    int current = 0;
    ImageView Project_lc01183_image01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0118_t3013);

        Button Project_lc01183_buttonup = findViewById(R.id.Project_lc01182_buttonup); //上一张按钮
        Button Project_lc01183_buttondown = findViewById(R.id.Project_lc01182_buttondown); //下一张按钮
        Project_lc01183_image01 = findViewById(R.id.Project_lc01182_image01);

        Project_lc01183_buttonup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显示上一页
                if (current == 0)
                    current = imgSrc.length - 1;
                else
                    current--;
                //显示数组中的第current张图片
                Project_lc01183_image01.setImageResource(imgSrc[current]);
            }
        });
        Project_lc01183_buttondown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current == imgSrc.length - 1)
                    current = 0;
                else
                    current++;
                Project_lc01183_image01.setImageResource(imgSrc[current]);
            }
        });
    }
}