package cn.edu.sict.chapter05;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class MyPageAdapter extends PagerAdapter {
    //这个ViewPager要显示哪些视图：
    ArrayList<View> viewList;
    //创建构造方法：创建本类对象时需要用的方法，为成员变量viewList赋初值。
    public MyPageAdapter(ArrayList<View> viewList) {
        this.viewList = viewList;
    }

    //重写getCount：返回一共有多少个要显示的视图
    @Override
    public int getCount() {
        return viewList.size();
    }

    //比较系统传过来的两个参数是否是同一对象？
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    //向容器container中添加view项
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //向容器添加一个View，它是我们数据源viewList中的第position项
        container.addView(viewList.get(position));
        return viewList.get(position);
    }

    //销毁item，即从container中删掉这个View
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(viewList.get(position));
    }
}
