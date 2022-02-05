package cn.edu.sict.chapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import cn.edu.sict.project_2022.R;

public class Lc0202_t504_movieList extends AppCompatActivity {
    private GridView Project_lc0202_gv;
    //Step 1:准备数据
    //1.1 原始数据
    int[] imgSrc = {R.drawable.t603_img01,R.drawable.t603_img02,R.drawable.t603_img03,R.drawable.t603_img04,
            R.drawable.t603_img05,R.drawable.t603_img06,R.drawable.t603_img07,R.drawable.t603_img08,
            R.drawable.t603_img09,R.drawable.t603_img10,R.drawable.t603_img11,R.drawable.t603_img12,
            R.drawable.t603_img13,R.drawable.t603_img14};
    String[] names = {"小欢喜","长安十二时辰","宸汐缘","大宋少年志","庆余年","大江大河","天盛长歌","白夜追凶",
            "你好，旧时光","琅琊榜之风起长林","人民的名义","河神","无证之罪","大军师司马懿"};
    String[] scores = {"8.4","8.3","8.3","8.2","8.0","8.8","8.1","9.0","8.7","8.5","8.3","9.3","9.2","8.6"};
    //定义数据列表
    ArrayList<Lc0202_t504_movieBean> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0202_t504_movie_list);
        initView();
    }
    private void initView(){
        Project_lc0202_gv = (GridView) findViewById(R.id.Project_lc0202_gv);

        //1.2 初始化数据列表ArrayList<MovieBean> dataList
        initData();
        //Step 2:创建一个GridAdapter实例
        Lc0202_t504_gridAdapter adapter = new Lc0202_t504_gridAdapter(Lc0202_t504_movieList.this,dataList);
        //Step 3:将GridAdapter实例绑定在GridView控件上
        Project_lc0202_gv.setAdapter(adapter);
        //Step 4:对GridView绑定事件监听器
        Project_lc0202_gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //获取本小格的数据
                Lc0202_t504_movieBean movie = dataList.get(position);
                //获取片名和评分，展示在提示框上
                Toast.makeText(Lc0202_t504_movieList.this,movie.getName()+"评分："+movie.getScore(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    //初始化dataList数据列表
    private void initData() {
        dataList = new ArrayList<>();
        for(int i=0;i<imgSrc.length;i++){
            Lc0202_t504_movieBean movieBean = new Lc0202_t504_movieBean(imgSrc[i],scores[i],names[i]);
            dataList.add(movieBean);
        }
    }
}