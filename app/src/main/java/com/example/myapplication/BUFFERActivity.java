package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BUFFERActivity extends AppCompatActivity {
    ImageView result;
    boolean input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bufferactivity);
        result = findViewById(R.id.and_resultbtn);
        input = false;
        output = false;
        ImageButton num_1 = (ImageButton) findViewById(R.id.buffer_switchbtn_1) ;
        ImageButton needex = (ImageButton) findViewById(R.id.buffer_needex) ;

        ImageButton.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                switch (view.getId()){
                    case R.id.buffer_needex:{
                        Intent intent = new Intent(BUFFERActivity.this, BUFFERexplainActivity.class);
                        startActivity(intent);
                        break;

                    }
                    case R.id.buffer_switchbtn_1:{
                        if(input == false){
                            num_1.setImageResource(R.drawable.btn1);
                            input = true;
                        }
                        else{
                            num_1.setImageResource(R.drawable.btn0);
                            input = false;
                        }
                        break;
                    }
                }
                if (input == true){
                    result.setImageResource(R.drawable.btn1);
                }
                else {
                    result.setImageResource(R.drawable.btn0);
                }
            }
        };

        num_1.setOnClickListener(onClickListener) ;

        needex.setOnClickListener(onClickListener) ;
    }
}