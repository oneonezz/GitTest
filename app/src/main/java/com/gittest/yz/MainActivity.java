package com.gittest.yz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("版本11111111111111111111");
    }

    private void whowLog(){
        System.out.println("版本222222222");
    }

    private void version3333(){
        System.out.println("版本3333333333");
    }
}
