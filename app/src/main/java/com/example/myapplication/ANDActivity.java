package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ANDActivity extends AppCompatActivity {
    ImageButton num_1, num_2, help;
    ImageView result;
    boolean input_1, input_2, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andactivity);
        num_1 = findViewById(R.id.and_switchbtn_1);
        num_2 = findViewById(R.id.and_switchbtn_2);
        help = findViewById(R.id.and_needex);
        result = findViewById(R.id.and_resultbtn);
        input_1 = false;
        input_2 = false;
        output = false;

        num_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                switch (view.getId()){
                    case R.id.and_needex:{
                        Intent intent = new Intent(ANDActivity.this, ANDexplainActivity.class);
                        startActivity(intent);

                    }
                    case R.id.and_switchbtn_1:{
                        if(input_1 == false){
                            num_1.setImageResource(R.drawable.btn1);
                            input_1 = true;
                        }
                        else{
                            num_1.setImageResource(R.drawable.btn0);
                        }
                        break;
                    }
                    case R.id.and_switchbtn_2:{
                        if(input_2 == false){
                            num_2.setImageResource(R.drawable.btn1);
                            input_2 = true;
                        }
                        else{
                            num_2.setImageResource(R.drawable.btn0);
                        }
                        break;
                    }
                }
                if (input_1 == true && input_2 == true){
                    result.setImageResource(R.drawable.btn1);
                }
                else {
                    result.setImageResource(R.drawable.btn0);
                }
            }
        });
    }
}