package cn.edu.sict.chapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.edu.sict.project_2022.R;

//2022.01.31 模拟QQ好友界面
public class Lc0131_t502 extends AppCompatActivity {
    private ListView activity_main_lv;

    //资源准备：运用数组，将我们需要的图片、昵称等资源存储起来
    int[] imgSrc = {R.drawable.t405_libai,R.drawable.t405_nongyu,R.drawable.t405_qingzhao,R.drawable.t405_tiger};
    String[] names = {"Young Man","Middle-aged Woman","Young Woman","Tiger"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0131_t502);
        initView();

        //将原始数据转化为ArrayList<Map>
        ArrayList<Map<String,Object>> itemList = new ArrayList<>();
        for(int i=0;i<imgSrc.length;i++){
            HashMap item = new HashMap();
            item.put("header",imgSrc[i]);
            item.put("name",names[i]);
            itemList.add(item);
        }
        //新建一个SimpleAdapter适配器对象
        SimpleAdapter adapter = new SimpleAdapter(Lc0131_t502.this,
                itemList,
                R.layout.iv_item,
                new String[]{"header","name"},
                new int[]{R.id.lv_item_iv_header,R.id.lv_item_tv_title}
        );
        //将适配器赋给ListView
        activity_main_lv.setAdapter(adapter);
    }

    private void initView(){
        activity_main_lv = (ListView) findViewById(R.id.activity_main_lv);
    }
}