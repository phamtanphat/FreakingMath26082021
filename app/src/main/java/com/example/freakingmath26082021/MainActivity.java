package com.example.freakingmath26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mRelativeContainer;
    TextView mTvScore, mTvCalculate, mTvResult;
    ImageButton mImgTrue, mImgFalse;
    Random mRandom;
    int mSt1, mSt2, mResult;
    boolean mIsTrue;
    String mCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeContainer = findViewById(R.id.relativeContainer);
        mTvScore = findViewById(R.id.textViewScore);
        mTvCalculate = findViewById(R.id.textViewCalculate);
        mTvResult = findViewById(R.id.textViewResult);
        mImgTrue = findViewById(R.id.imageButtonTrue);
        mImgFalse = findViewById(R.id.imageButtonFalse);

        // random so thu1 va so thu2
        mRandom = new Random();
        mSt1 = mRandom.nextInt(10) + 1;
        mSt2 = mRandom.nextInt(10) + 1;

        // random cho bai toan
        // 0 : phep tru
        // 1 : phep cong
        // 2 : phep nhan
        // 3 : phep chia

        int index = mRandom.nextInt(4);

        // random cho ket qua nen dung hay sai
        mIsTrue = mRandom.nextBoolean();

        switch (index) {
            case 0:
                mResult = mSt1 - mSt2;
                mCalculate = " - ";
                break;
            case 1:
                mResult = mSt1 + mSt2;
                mCalculate = " + ";
                break;
            case 2:
                mResult = mSt1 * mSt2;
                mCalculate = " * ";
                break;
            case 3:
                mResult = mSt1 / mSt2;
                mCalculate = " / ";
                break;
        }

        if (!mIsTrue) {
            mResult += mRandom.nextInt(10) + 1;
        }

        mTvCalculate.setText(mSt1 + mCalculate + mSt2);
        mTvResult.setText("= " + mResult);


    }
}