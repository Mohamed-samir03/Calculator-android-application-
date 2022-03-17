package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_calc,tv_result;
    Button bt_AC,bt_os,bt_backspace,bt_division,bt_multiplication,bt_subtraction,bt_addition,bt_equal,bt_dot;
    Button bt_num0,bt_num1,bt_num2,bt_num3,bt_num4,bt_num5,bt_num6,bt_num7,bt_num8,bt_num9;
    String res,calc;
    boolean dot_insert, operation_insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_calc = findViewById(R.id.calc_tv_calc);
        tv_result = findViewById(R.id.calc_tv_result);
        bt_AC = findViewById(R.id.calc_bt_AC);
        bt_os = findViewById(R.id.calc_bt_os);
        bt_backspace = findViewById(R.id.calc_bt_backspace);
        bt_division = findViewById(R.id.calc_bt_division);
        bt_multiplication = findViewById(R.id.calc_bt_multiplication);
        bt_subtraction = findViewById(R.id.calc_bt_subtraction);
        bt_addition = findViewById(R.id.calc_bt_addition);
        bt_equal = findViewById(R.id.calc_bt_equal);
        bt_dot = findViewById(R.id.calc_bt_dot);
        bt_num0 = findViewById(R.id.calc_bt_num0);
        bt_num1 = findViewById(R.id.calc_bt_num1);
        bt_num2 = findViewById(R.id.calc_bt_num2);
        bt_num3 = findViewById(R.id.calc_bt_num3);
        bt_num4 = findViewById(R.id.calc_bt_num4);
        bt_num5 = findViewById(R.id.calc_bt_num5);
        bt_num6 = findViewById(R.id.calc_bt_num6);
        bt_num7 = findViewById(R.id.calc_bt_num7);
        bt_num8 = findViewById(R.id.calc_bt_num8);
        bt_num9 = findViewById(R.id.calc_bt_num9);
        res = ""; calc = "";
        dot_insert = false; operation_insert = false;

        bt_num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "0";
                display_calc();
            }
        });

        bt_num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "1";
                display_calc();
            }
        });

        bt_num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "2";
                display_calc();
            }
        });

        bt_num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "3";
                display_calc();
            }
        });

        bt_num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "4";
                display_calc();
            }
        });

        bt_num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "5";
                display_calc();
            }
        });

        bt_num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "6";
                display_calc();
            }
        });

        bt_num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "7";
                display_calc();
            }
        });

        bt_num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "8";
                display_calc();
            }
        });

        bt_num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc = calc + "9";
                display_calc();
            }
        });

        bt_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(calc.isEmpty() || calc.substring(calc.length()-1,calc.length()).equals(" ")){
                    calc = calc + "0.";
                    dot_insert = true;
                }
                if(dot_insert == false){
                    calc = calc + ".";
                    dot_insert = true;
                }
                display_calc();
            }
        });

        bt_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                display_calc();
                display_res();
            }
        });

        bt_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_insert = false;
                if(!calc.isEmpty()){
                    if(calc.substring(calc.length()-1,calc.length()).equals(".")){
                        backspace();
                    }
                    if(operation_insert == false){
                        calc = calc + " ^ ";
                        operation_insert = true;
                    }
                    if(!res.isEmpty()){
                        calc = res + " ^ ";
                        res = "";
                        display_res();
                    }
                }
                display_calc();
            }
        });

        bt_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
                display_calc();
            }
        });

        bt_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_insert = false;
                if(!calc.isEmpty()){
                    if(calc.substring(calc.length()-1,calc.length()).equals(".")){
                        backspace();
                    }
                    if(operation_insert == false){
                        calc = calc + " ÷ ";
                        operation_insert = true;
                    }
                    if(!res.isEmpty()){
                        calc = res + " ÷ ";
                        res = "";
                        display_res();
                    }
                }
                display_calc();
            }
        });

        bt_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_insert = false;
                if(!calc.isEmpty()){
                    if(calc.substring(calc.length()-1,calc.length()).equals(".")){
                        backspace();
                    }
                    if(operation_insert == false){
                        calc = calc + " × ";
                        operation_insert = true;
                    }
                    if(!res.isEmpty()){
                        calc = res + " × ";
                        res = "";
                        display_res();
                    }
                }
                display_calc();
            }
        });

        bt_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_insert = false;
                if(!calc.isEmpty()){
                    if(calc.substring(calc.length()-1,calc.length()).equals(".")){
                        backspace();
                    }
                    if(operation_insert == false){
                        calc = calc + " - ";
                        operation_insert = true;
                    }
                    if(!res.isEmpty()){
                        calc = res + " - ";
                        res = "";
                        display_res();
                    }
                }
                display_calc();
            }
        });

        bt_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot_insert = false;
                if(!calc.isEmpty()){
                    if(calc.substring(calc.length()-1,calc.length()).equals(".")){
                        backspace();
                    }
                    if(operation_insert == false){
                        calc = calc + " + ";
                        operation_insert = true;
                    }
                    if(!res.isEmpty()){
                        calc = res + " + ";
                        res = "";
                        display_res();
                    }
                }
                display_calc();
            }
        });

        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] tokens = calc.split(" ");
                if(operation_insert==true && !calc.substring(calc.length()-1,calc.length()).equals(" ")){
                    switch (tokens[1].charAt(0)){
                        case '÷' :
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                        case '×' :
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '-' :
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case '+' :
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '^' :
                            res = Double.toString(Math.pow(Double.parseDouble(tokens[0]), Double.parseDouble(tokens[2])));
                            break;
                    }
                    display_res();
                }
                if(tokens.length <= 2){
                    res = tokens[0];
                    Toast.makeText(getBaseContext(),"no operation",Toast.LENGTH_SHORT).show();
                    display_res();
                }
            }
        });

    }

    public void display_calc(){
        tv_calc.setText(calc);
    }

    public void display_res(){
        tv_result.setText(res);
    }

    public void clear(){
        res = "";
        calc = "";
        dot_insert = false;
        operation_insert = false;
    }

    public void backspace(){
        if(!calc.isEmpty()){
            if(calc.substring(calc.length()-1,calc.length()).equals(".")){
                dot_insert = false;
            }
            if(calc.substring(calc.length()-1,calc.length()).equals(" ")){
                calc = calc.substring(0,calc.length()-3);
                operation_insert = false;
            }else {
                calc = calc.substring(0,calc.length()-1);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nots_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    /*
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(),"Welcome",Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(),"Thanks",Toast.LENGTH_SHORT).show();
    }*/
}