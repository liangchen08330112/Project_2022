package cn.edu.sict.chapter05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cn.edu.sict.project_2022.R;

public class Lc0202_t504_gridAdapter extends BaseAdapter {
    Context context;  //上下文对象
    ArrayList<Lc0202_t504_movieBean> dataList;  //数据列表

    //构造函数：创建本对象的同时，为成员变量赋初值
    public Lc0202_t504_gridAdapter(Context context, ArrayList<Lc0202_t504_movieBean> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    //重写getCount()方法：获取列表长度
    @Override
    public int getCount() {
        return dataList.size();
    }

    //重写getItem()：获取第position项
    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    //重写getItemId()：获取第positon项的id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //重写getView()：获取每一条数据以什么样的形式展现出来的View视图
    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        //Step 1.读取小格布局的xml文件，加载到内存中，形成一个View对象view
        //布局加载器
        LayoutInflater inflater = LayoutInflater.from(context);
        //利用布局加载器将xml布局加载到内存中，并转化为一个View对象
        View view = inflater.inflate(R.layout.t504_grid_item,null);
        //2.找到View对象中的控件，并将该小格的数据填充到View对象的各个控件中
        //找到View对象中的所有控件
        ImageView iv = view.findViewById(R.id.Project_lc0202_grid_item_iv);
        TextView tv_name = view.findViewById(R.id.Project_lc0202_grid_item_tv_name);
        TextView tv_score = view.findViewById(R.id.Project_lc0202_grid_item_tv_score);
        //向控件中填充数据
        Lc0202_t504_movieBean movie = dataList.get(position);
        iv.setImageResource(movie.getImgSrc());
        tv_name.setText(movie.getName());
        tv_score.setText(movie.getScore());
        //3.返回View对象
        return view;
    }
}
