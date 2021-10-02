package com.example.freakingmath26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Làm tròn 0.5
        int number1 = Math.round(1.2f);
        Log.d("BBB","Hàm round " + number1);

        Làm tròn lên
        double number2 = Math.ceil(1.000001);
        Log.d("BBB","Hàm ceil " + number2);

        Làm tròn xuống
        double number3 = Math.floor(1.999999);
        Log.d("BBB","Hàm floor " + number3);

        Làm tròn các số phần thập phân
        String result = String.format("%.2f", 1.23436);
        Log.d("BBB",result);

        Random
        double number4 = Math.round(Math.random() * 10);
        Log.d("BBB",number4 + "");
        */

        Random random = new Random();
        // 5 -> 10
        // random.nextInt(max - min + 1) + smin
        int number5 = random.nextInt(10 - 5 + 1) + 5;
        Log.d("BBB",number5 + "");

    }
}