package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        c_page();
    }

    public void re_month(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void re_number(View v){
        finish();
    }
    private void c_page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            num = Integer.parseInt(bundle.getString("winNum"));
            TextView textView = (TextView)findViewById(R.id.Money);

            if (num == 000){
                textView.setText("20000元");
            }
            else if (num == 001){
                textView.setText("10000元");
            }
            else if (num == 002){
                textView.setText("2000元");
            }
            else if (num == 003){
                textView.setText("2000元");
            }
            else if (num == 004){
                textView.setText("100元");
            }
            else if (num == 100){
                textView.setText("30000元");
            }
            else if (num == 101){
                textView.setText("15000元");
            }
            else if (num == 102){
                textView.setText("2500元");
            }
            else if (num == 103){
                textView.setText("2500元");
            }
            else if (num == 104){
                textView.setText("150元");
            }
            else if (num == 200){
                textView.setText("2500元");
            }
            else if (num == 201){
                textView.setText("1500元");
            }
            else if (num == 202){
                textView.setText("250元");
            }
            else if (num == 203){
                textView.setText("250元");
            }
            else if (num == 204){
                textView.setText("15元");
            }
            else if (num == 300){
                textView.setText("3000元");
            }
            else if (num == 301){
                textView.setText("2000元");
            }
            else if (num == 302){
                textView.setText("500元");
            }
            else if (num == 303){
                textView.setText("400元");
            }
            else if (num == 304){
                textView.setText("150元");
            }
            else if (num == 400){
                textView.setText("5000元");
            }
            else if (num == 401){
                textView.setText("3000元");
            }
            else if (num == 402){
                textView.setText("600元");
            }
            else if (num == 403){
                textView.setText("400元");
            }
            else if (num == 404){
                textView.setText("30元");
            }
            else if (num == 500){
                textView.setText("8000元");
            }
            else if (num == 501){
                textView.setText("6000元");
            }
            else if (num == 502){
                textView.setText("800元");
            }
            else if (num == 503){
                textView.setText("600元");
            }
            else if (num == 504){
                textView.setText("90元");
            }
            else
                textView.setText("再接再厲!");
        }
    }
}