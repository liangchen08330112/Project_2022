package cn.edu.sict.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cn.edu.sict.project_2022.R;

public class Lc0130_t406 extends AppCompatActivity implements View.OnClickListener {
    private TextView Project_lc01302_tv_personNum1;
    private TextView Project_lc01302_tv_personNum2;
    private Button Project_lc01302_button1;
    private Button Project_lc01302_button2;
    private Button Project_lc01302_button3;
    private Button Project_lc01302_button4;
    private EditText Project_lc01302_et_personNum1;
    private EditText Project_lc01302_et_personNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0130_t406);
        initView();
    }
    private void initView(){
        Project_lc01302_tv_personNum1 = (TextView) findViewById(R.id.Project_lc01302_tv_personNum1);
        Project_lc01302_tv_personNum2 = (TextView) findViewById(R.id.Project_lc01302_tv_personNum2);
        Project_lc01302_button1 = (Button) findViewById(R.id.Project_lc01302_button1);
        Project_lc01302_button2 = (Button) findViewById(R.id.Project_lc01302_button2);
        Project_lc01302_button3 = (Button) findViewById(R.id.Project_lc01302_button3);
        Project_lc01302_button4 = (Button) findViewById(R.id.Project_lc01302_button4);
        Project_lc01302_et_personNum1 = (EditText) findViewById(R.id.Project_lc01302_et_personNum1);
        Project_lc01302_et_personNum2 = (EditText) findViewById(R.id.Project_lc01302_et_personNum2);

        Project_lc01302_button1.setOnClickListener(this);
        Project_lc01302_button2.setOnClickListener(this);
        Project_lc01302_button3.setOnClickListener(this);
        Project_lc01302_button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        Uri uri = null;
        switch (view.getId()){
            case R.id.Project_lc01302_button1:  //???????????????
                //????????????????????????????????????????????????????????????
                intent.setAction(Intent.ACTION_INSERT_OR_EDIT);
                //???????????????????????????1??????????????????
                uri = Uri.parse("content://com.android.contacts/contacts/1");
                break;
            case R.id.Project_lc01302_button2:  //???????????????
                //??????????????????????????????????????????????????????
                String edit = Project_lc01302_button2.getText().toString().trim();
                if(TextUtils.isEmpty(edit)){
                    Toast.makeText(this,"?????????????????????",Toast.LENGTH_SHORT).show();
                    return;
                }
                //????????????????????????????????????????????????????????????
                intent.setAction(Intent.ACTION_EDIT);
                uri = Uri.parse("content://com.android.contacts/contacts/"+edit);
                break;
            case R.id.Project_lc01302_button3:  //?????????????????????
                String check = Project_lc01302_button3.getText().toString().trim();
                if(TextUtils.isEmpty(check)){
                    Toast.makeText(this,"??????????????????",Toast.LENGTH_SHORT).show();
                    return;
                }
                //????????????????????????????????????????????????????????????
                intent.setAction(Intent.ACTION_VIEW);
                uri = Uri.parse("content://com.android.contacts/contacts/"+check);
                break;
            case R.id.Project_lc01302_button4:  //?????????????????????
                intent.setAction(Intent.ACTION_VIEW);
                uri =Uri.parse("content://contacts/people");
                break;
        }
        intent.setData(uri);

        //Step 3:??????Intent????????????
        startActivity(intent);
    }
}