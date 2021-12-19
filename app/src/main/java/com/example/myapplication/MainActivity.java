package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton.OnClickListener onClickListener = new ImageButton.OnClickListener() {
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.and_btn:
                        Intent intent = new Intent(MainActivity.this, ANDActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.buffer_btn:
                        Intent intent_1 = new Intent(MainActivity.this, BUFFERActivity.class);
                        startActivity(intent_1);
                        break;

                    case R.id.or_btn:
                        Intent intent_2 = new Intent(MainActivity.this, ORActivity.class);
                        startActivity(intent_2);
                        break;

                    case R.id.nor_btn:
                        Intent intent_3 = new Intent(MainActivity.this, NORActivity.class);
                        startActivity(intent_3);
                        break;

                    case R.id.nand_btn:
                        Intent intent_4 = new Intent(MainActivity.this, NANDActivity.class);
                        startActivity(intent_4);
                        break;

                    case R.id.not_btn:
                        Intent intent_5 = new Intent(MainActivity.this, NOTActivity.class);
                        startActivity(intent_5);
                        break;

                    case R.id.xnor_btn:
                        Intent intent_6 = new Intent(MainActivity.this, XNORActivity.class);
                        startActivity(intent_6);
                        break;

                    case R.id.xor_btn:
                        Intent intent_7 = new Intent(MainActivity.this, XORActivity.class);
                        startActivity(intent_7);
                        break;

                    case R.id.logic_explain_btn:
                        Intent intent_8 = new Intent(MainActivity.this, ExplainActivity.class);
                        startActivity(intent_8);
                }
            }
        };
        ImageButton and = (ImageButton) findViewById(R.id.and_btn) ;
        and.setOnClickListener(onClickListener) ;
        ImageButton buffer = (ImageButton) findViewById(R.id.buffer_btn) ;
        buffer.setOnClickListener(onClickListener) ;
        ImageButton or = (ImageButton) findViewById(R.id.or_btn) ;
        or.setOnClickListener(onClickListener) ;
        ImageButton nor = (ImageButton) findViewById(R.id.nor_btn) ;
        nor.setOnClickListener(onClickListener) ;
        ImageButton nand = (ImageButton) findViewById(R.id.nand_btn) ;
        nand.setOnClickListener(onClickListener) ;
        ImageButton not = (ImageButton) findViewById(R.id.not_btn) ;
        not.setOnClickListener(onClickListener) ;
        ImageButton xnor = (ImageButton) findViewById(R.id.xnor_btn) ;
        xnor.setOnClickListener(onClickListener) ;
        ImageButton xor = (ImageButton) findViewById(R.id.xor_btn) ;
        xor.setOnClickListener(onClickListener) ;
        ImageButton exlpain = (ImageButton) findViewById(R.id.logic_explain_btn) ;
        exlpain.setOnClickListener(onClickListener) ;
    }
}
