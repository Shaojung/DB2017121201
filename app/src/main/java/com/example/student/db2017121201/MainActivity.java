package com.example.student.db2017121201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        new Thread(){
            @Override
            public void run() {
                super.run();
                for (i=10;i>=0;i--)
                {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            tv.setText(String.valueOf(i));
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
