package com.example.cal;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Result, solution;
    MaterialButton button_C, button_openBracket, button_closedBracket;
    MaterialButton button_Division, button_Multiplication, button_Addition, button_Subtraction, button_equal;
    MaterialButton button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9;
    MaterialButton button_AC, button_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Result =findViewById(R.id.result);
        solution = findViewById(R.id.solution);

        assignId(button_C,R.id.button_C);
        assignId(button_0,R.id.button_0);
        assignId(button_1,R.id.button_1);
        assignId(button_2,R.id.button_2);
        assignId(button_3,R.id.button_3);
        assignId(button_4,R.id.button_4);
        assignId(button_5,R.id.button_5);
        assignId(button_6,R.id.button_6);
        assignId(button_7,R.id.button_7);
        assignId(button_8,R.id.button_8);
        assignId(button_9,R.id.button_9);
        assignId(button_AC,R.id.button_AC);
        assignId(button_Addition,R.id.button_addition);
        assignId(button_Subtraction,R.id.button_Sub);
        assignId(button_Division,R.id.button_Division);
        assignId(button_Multiplication,R.id.button_multipliaction);
        assignId(button_point,R.id.button_point);
        assignId(button_closedBracket,R.id.button_closedBracket);
        assignId(button_openBracket,R.id.button_openBracket);
        assignId(button_equal,R.id.button_equal);



        };
    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText= button.getText().toString();
        solution.setText(buttonText);


    }


    }



