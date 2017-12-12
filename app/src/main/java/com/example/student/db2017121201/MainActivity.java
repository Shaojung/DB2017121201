package com.example.student.db2017121201;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }
    public void click1(View v)
    {
        MyTask task = new MyTask();
        task.execute(10);
    }
}

class MyTask extends AsyncTask<Integer, Integer, String>
{

    @Override
    protected String doInBackground(Integer... integers) {
        int n;
        n = integers[0];
        Log.d("TASK",String.valueOf(n));
        return null;
    }
}
