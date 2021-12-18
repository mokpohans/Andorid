package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
                    case R.id.and_switchbtn_1:{
                        if(input_1 == true){
                            num_1.setImageResource(R.drawable.btn1);
                            input_1 = false;

                        }
                        else{
                            num_1.setImageResource(R.drawable.btn0);
                            if (input_1 == true && input_2 == true){
                                result.setImageResource(R.drawable.btn1);
                            }
                            else {
                                result.setImageResource(R.drawable.btn0);
                            }
                            input_1 = true;
                        }
                    }
                    case R.id.and_switchbtn_2:{
                        if(input_2 == true){
                            num_2.setImageResource(R.drawable.btn1);
                            input_2 = false;
                        }
                        else{
                            num_2.setImageResource(R.drawable.btn0);
                            input_2 = true;
                        }
                    }
                }
            }
        });
    }
}