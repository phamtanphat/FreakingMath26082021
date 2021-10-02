package com.example.freakingmath26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mRelativeContainer;
    TextView mTvScore, mTvCalculate, mTvResult;
    ImageButton mImgTrue, mImgFalse;
    Random mRandom;
    int mSt1, mSt2, mResult;
    boolean mIsTrue;
    String mCalculate;
    int mScore = 0;
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

        randomCalculate();

        mImgTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mIsTrue){
                    mScore += 1;
                    mTvScore.setText(mScore +"");
                    Toast.makeText(MainActivity.this, "Chính xác!!!", Toast.LENGTH_SHORT).show();
                    randomCalculate();
                }else{
                    mScore = 0;
                    mTvScore.setText(mScore +"");
                    Toast.makeText(MainActivity.this, "Sai rồi!!!", Toast.LENGTH_SHORT).show();
                    randomCalculate();
                }
            }
        });

        mImgFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mIsTrue){
                    mScore += 1;
                    mTvScore.setText(mScore +"");
                    Toast.makeText(MainActivity.this, "Chính xác!!!", Toast.LENGTH_SHORT).show();
                    randomCalculate();
                }else{
                    mScore = 0;
                    mTvScore.setText(mScore +"");
                    Toast.makeText(MainActivity.this, "Sai rồi!!!", Toast.LENGTH_SHORT).show();
                    randomCalculate();
                }
            }
        });

    }
    private void randomCalculate(){
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

        // random ma mau
        int red = mRandom.nextInt(255) + 1;
        int green = mRandom.nextInt(255) + 1;
        int blue = mRandom.nextInt(255) + 1;
        mRelativeContainer.setBackgroundColor(Color.rgb(red,green,blue));
    }
}