package cn.edu.sict.review_and_bilibili;

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

public class Lc0207_r101 extends AppCompatActivity implements View.OnClickListener {

    private Button Project_lc0207_btn_newPerson;
    private Button Project_lc0207_btn_editPerson;
    private Button Project_lc0207_btn_seePerson;
    private Button Project_lc0207_btn_seeAllPerson;
    private TextView Project_lc0207_tv_num1;
    private TextView Project_lc0207_tv_num2;
    private EditText Project_lc0207_et_num1;
    private EditText Project_lc0207_et_num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0207_r101);
        initView();
    }
    private void initView(){
        Project_lc0207_btn_newPerson = findViewById(R.id.Project_lc0207_btn_newPerson);
        Project_lc0207_btn_editPerson = findViewById(R.id.Project_lc0207_btn_editPerson);
        Project_lc0207_btn_seePerson = findViewById(R.id.Project_lc0207_btn_seePerson);
        Project_lc0207_btn_seeAllPerson = findViewById(R.id.Project_lc0207_btn_seeAllPerson);
        Project_lc0207_tv_num1 = findViewById(R.id.Project_lc0207_tv_num1);
        Project_lc0207_tv_num2 = findViewById(R.id.Project_lc0207_tv_num2);
        Project_lc0207_et_num1 = findViewById(R.id.Project_lc0207_et_num1);
        Project_lc0207_et_num2 = findViewById(R.id.Project_lc0207_et_num2);

        Project_lc0207_btn_newPerson.setOnClickListener(this);
        Project_lc0207_btn_editPerson.setOnClickListener(this);
        Project_lc0207_btn_seePerson.setOnClickListener(this);
        Project_lc0207_btn_seeAllPerson.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        Uri uri = null;
        switch (view.getId()){
            case R.id.Project_lc0207_btn_newPerson:
                intent.setAction(Intent.ACTION_INSERT_OR_EDIT);
                uri = Uri.parse("content://com.android.contacts/contacts/1");
                break;
            case R.id.Project_lc0207_btn_editPerson:
                String edit = Project_lc0207_btn_editPerson.getText().toString().trim();
                if(TextUtils.isEmpty(edit)){
                    Toast.makeText(this,"编号不能为空！",Toast.LENGTH_SHORT).show();
                    return;
                }
                intent.setAction (Intent.ACTION_EDIT);
                uri = Uri.parse("content://com.android.contacts/contacts/"+edit);
                break;
            case R.id.Project_lc0207_btn_seeAllPerson:
                intent.setAction(Intent.ACTION_VIEW);
                uri = Uri.parse("content://contacts/people");
        }
        intent.setData(uri);
        startActivity(intent);
    }
}