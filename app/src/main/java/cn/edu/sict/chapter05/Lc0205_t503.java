package cn.edu.sict.chapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;

import cn.edu.sict.project_2022.R;

public class Lc0205_t503 extends AppCompatActivity {
    private ViewPager Project_lc0205_viewPager;

    //数据源：每个显示在ViewPager中的Activity转化成的View，都储存在ArrayList对象中
    ArrayList<View> viewList;
    //manager的作用：方便我们将Activity转化为View
    LocalActivityManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0205_t503);
        initView();

        //数据准备
        //Step 1:初始化Manager
        manager = new LocalActivityManager(Lc0205_t503.this,true);
        //保存当前状态
        manager.dispatchCreate(savedInstanceState);
        //Step 2:初始化数据
        initData();

        //布置Adapter
        MyPageAdapter adapter = new MyPageAdapter(viewList);
        Project_lc0205_viewPager.setAdapter(adapter);
    }
    //数据初始化（viewList）
    private void initData() {
        viewList = new ArrayList<>();
        //添加三个Activity转化的View视图
        //Step 1.创建一个Intent对象，指明要打开的Activity
        Intent intent_p1 = new Intent(Lc0205_t503.this,Page1.class);
        //Step 2.根据Intent对象，打开相应的Activity并转化为View对象
        View view_page1 = getView("Project_lc0205_page1",intent_p1);
        viewList.add(view_page1);

        //添加第二个界面
        Intent intent_p2 = new Intent(Lc0205_t503.this,Page2.class);
        viewList.add(getView("Project_lc0205_page2",intent_p2));

        //添加第三个界面
        Intent intent_p3 = new Intent(Lc0205_t503.this,Page3.class);
        viewList.add(getView("Project_lc0205_page3",intent_p3));
    }
    //打开Intent所指明的Activity，并转化为View
    private View getView(String id, Intent intent_p1) {
        //窗口管理器类，我希望窗口管理器加载Activity管理器manager所打开的Activity
        Window window = manager.startActivity(id, intent_p1);
        //将window对象中的顶层视图取出
        View view = window.getDecorView();
        return view;
    }

    void initView(){
        Project_lc0205_viewPager = (ViewPager) findViewById(R.id.Project_lc0205_viewPager);
    }
}