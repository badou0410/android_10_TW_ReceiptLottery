package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1B = (Button)findViewById(R.id.Btn1to2);
        btn1B.setOnClickListener(btn1BClick);

        Button btn2B = (Button)findViewById(R.id.Btn3to4);
        btn2B.setOnClickListener(btn2BClick);

        Button btn3B = (Button)findViewById(R.id.BtnBtoC);
        btn3B.setOnClickListener(btn3BClick);

        Button btn4B = (Button)findViewById(R.id.Back);
        btn4B.setOnClickListener(btn4BClick);

        Button btn5B = (Button)findViewById(R.id.BtnCtoB);
        btn5B.setOnClickListener(btn5BClick);

        Button btn6B = (Button)findViewById(R.id.BtnCtoA);
        btn6B.setOnClickListener(btn6BClick);
    }
    private View.OnClickListener btn1BClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView text = (TextView)findViewById(R.id.Click);
            TextView set_num = (TextView)findViewById(R.id.Num);
            text.setText("2018 1,2月發票");
            set_num.setText("1");//月份記述數字

        }
    };
    private View.OnClickListener btn2BClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_2 = (TextView)findViewById(R.id.Click);
            TextView set_num = (TextView)findViewById(R.id.Num);
            text_2.setText("2018 3,4月發票");
            set_num.setText("2");//月份記述數字
        }
    };
    private View.OnClickListener btn3BClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_3 = (TextView)findViewById(R.id.Click);
            TextView set_num = (TextView)findViewById(R.id.Num);
            text_3.setText("2018 5,6月發票");
            set_num.setText("3");//月份記述數字
        }
    };
    private View.OnClickListener btn4BClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_4 = (TextView)findViewById(R.id.Click);
            TextView set_num = (TextView)findViewById(R.id.Num);
            text_4.setText("2018 7,8月發票");
            set_num.setText("4");//月份記述數字
        }
    };
    private View.OnClickListener btn5BClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_5 = (TextView)findViewById(R.id.Click);
            TextView set_num = (TextView)findViewById(R.id.Num);
            text_5.setText("2018 9,10月發票");
            set_num.setText("5");//月份記述數字
        }
    };
    private View.OnClickListener btn6BClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_6 = (TextView)findViewById(R.id.Click);
            TextView set_num = (TextView)findViewById(R.id.Num);
            text_6.setText("2018 11,12月發票");
            set_num.setText("6");//月份記述數字
        }
    };

    public void click_AtoB(View v){

        TextView click_btn = (TextView)findViewById(R.id.Click);
        TextView set_num = (TextView)findViewById(R.id.Num);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("mouth", click_btn.getText().toString());
        bundle.putString("numberMouth", set_num.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}