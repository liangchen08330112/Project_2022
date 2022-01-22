package cn.edu.sict.chapter03;

import android.view.View;
import android.widget.ImageView;

import cn.edu.sict.project_2022.R;

public class T301_myListener implements View.OnClickListener {
    int current;
    int[] imgSrc;
    ImageView Project_lc01182_iamge01;

    //构造函数：当创建本对象时，必须传过来三个参数，来为成员变量赋值。
    public T301_myListener(int current,int[]imgSrc,ImageView Project_lc01182_image01){
        this.current = current;
        this.imgSrc = imgSrc;
        this.Project_lc01182_iamge01 = Project_lc01182_image01;
    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.Project_lc01182_buttonup) { //如果被点击的是上一张
            //显示上一张
            if (current == 0) { //当前在第一页，第一页的上一页是最后一张
                current = imgSrc.length - 1;
            } else {
                current--; //显示出数组中的第current张图片。
                Project_lc01182_iamge01.setImageResource(imgSrc[current]);
            }
        }else if(view.getId()==R.id.Project_lc01182_buttondown){//如果被点击的是下一张
            //显示下一张
            if(current== imgSrc.length-1){ //最后一页的下一页是第一页
                current = 0;
            }else{
                current++;
                Project_lc01182_iamge01.setImageResource(imgSrc[current]);
            }
        }
    }
}
