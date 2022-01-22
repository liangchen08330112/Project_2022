package cn.edu.sict.chapter03;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cn.edu.sict.project_2022.R;

public class Lc0120_t302 extends AppCompatActivity implements View.OnClickListener {
    int[] imgSrc = {R.drawable.t302_paper,R.drawable.t302_rock,R.drawable.t302_scissors};
    ImageView activity_t302_iv_phone;
    TextView activity_t302_result;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_lc0120);

        activity_t302_iv_phone = findViewById(R.id.activity_t302_iv_phone);
        activity_t302_result = findViewById(R.id.activity_t302_result);
        ImageButton activity_t302_ib_paper = findViewById(R.id.activity_t302_ib_paper);
        ImageButton activity_t302_ib_rock = findViewById(R.id.activity_t302_ib_rock);
        ImageButton activity_t302_ib_scissors = findViewById(R.id.activity_t302_ib_scissors);

        activity_t302_ib_paper.setOnClickListener(this);
        activity_t302_ib_rock.setOnClickListener(this);
        activity_t302_ib_scissors.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {
            //1.电脑出拳
            //1.1 需要一个0、1、2随机整数
            int computerNum = (int)(Math.random()*3);
            //1.2 需要将对应的图片展示到ImageView图片框上
            activity_t302_iv_phone.setImageResource(imgSrc[computerNum]);
            //2.判定输赢
            String result = "判定输赢：";
            switch (view.getId()){
                case R.id.activity_t302_ib_paper:{ //用户出“布”了
                    //判断电脑此时出了什么：
                    switch(computerNum){
                        case 0: //电脑出了“布”
                            result = "平局！";
                            break;
                        case 1: //电脑出了“石头"
                            result = "恭喜！你赢了";
                            break;
                        case 2: //电脑出了“剪刀”
                            result = "不好意思，你输了！";
                            break;
                    }
                    break;
                }
                case R.id.activity_t302_ib_rock: {//用户出“石头”了
                    switch(computerNum){
                        case 0: //电脑出了“布”
                            result = "不好意思，你输了！";
                            break;
                        case 1: //电脑出了“石头"
                            result = "平局！";
                            break;
                        case 2: //电脑出了“剪刀”
                            result = "恭喜！你赢了！";
                            break;
                    }
                    break;
                }
                case R.id.activity_t302_ib_scissors: {//用户出“剪刀“了
                    switch(computerNum){
                        case 0: //电脑出了“布”
                            result = "恭喜，你赢了！";
                            break;
                        case 1: //电脑出了“石头"
                            result = "不好意思，你输了！";
                            break;
                        case 2: //电脑出了“剪刀”
                            result = "平局！";
                            break;
                    }
                    break;
                }
            }
            activity_t302_result.setText(result);
        }
}
