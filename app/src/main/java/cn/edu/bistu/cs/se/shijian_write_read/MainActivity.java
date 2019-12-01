package cn.edu.bistu.cs.se.shijian_write_read;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText xuehao=findViewById(R.id.xuehao);
        final EditText xingming=findViewById(R.id.xingming);
        final Button cunchu=findViewById(R.id.cunchu);
        final TextView xianshi=findViewById(R.id.xianshi);
        final Button duqu=findViewById(R.id.duqu);

        cunchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor=getSharedPreferences("data",0).edit();
                editor.putString("xuehao",xuehao.getText().toString());
                editor.putString("xingming",xingming.getText().toString());
                editor.apply();
            }
        });


        duqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp=getSharedPreferences("data",0);
                xianshi.setText("学号为 "+sp.getString("xuehao","") +"  姓名为 "+sp.getString("xingming",""));
            }
        });


    }
}
