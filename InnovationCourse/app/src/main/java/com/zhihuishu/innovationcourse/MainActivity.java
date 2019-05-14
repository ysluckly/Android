package com.zhihuishu.innovationcourse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/*将数据传递给ListView的适配器是ArrayAdapter。这里我们传入的是一个字符串的数组，因此我们创建一个ArrayAdapter<String>类*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* test 1   只有姓名

        //初始化一个Adapter
        /*  第一个参数是this，表示传入的是当前的Activity
            第二个参数是android.R.layout.simple_list_item_1，这是Android系统自带的一个列表元素（即列表中的每一行）布局，只显一串简单的文字
            第三个参数是需要显示的所有数据构成的List，即数据源
         */
        //ArrayAdapter<String> teacherAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Teacher.getAllTeachers());

        //通过ID获取listView
        //ListView listView = (ListView) findViewById(R.id.teacher_listView);

        //设置listView的Adapter
        //listView.setAdapter(teacherAdapter);


        //  2
        TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.teacher_item, Teacher.getAllTeachers());

        ListView listView = (ListView) findViewById(R.id.teacher_listView);

        listView.setAdapter(teacherAdapter);

        //3正确调整

       /* // 从Intent获取数据
        int imageId = getIntent().getIntExtra("teacher_image", 0);
        String desc = getIntent().getStringExtra("teacher_desc");

        // 获取特定的视图
        ImageView imageView = (ImageView) findViewById(R.id.teacher_large_imageView);
        TextView textView = (TextView) findViewById(R.id.teacher_desc_textView);

        // 根据数据设置视图展现
        imageView.setImageResource(imageId);
        textView.setText(desc);

        */
    }
}
