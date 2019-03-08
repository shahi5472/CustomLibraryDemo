package com.s.m.shahi.customlibrarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.s.m.shahi.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = MyMath.Plus(10, 30);
        Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();

    }
}
