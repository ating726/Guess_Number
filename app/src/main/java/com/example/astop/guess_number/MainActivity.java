package com.example.astop.guess_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView userInput;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnEnter, btnBack;
    int[] randomNum = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component();

        for (int i = 0; i < randomNum.length; i++) {
            randomNum[i] = (int) Math.floor(Math.random() * 10);
        }

    }

    String num = "";

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_1) {
            num += "1";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_2) {
            num += "2";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_3) {
            num += "3";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_4) {
            num += "4";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_5) {
            num += "5";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_6) {
            num += "6";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_7) {
            num += "7";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_8) {
            num += "8";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_9) {
            num += "9";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_0) {
            num += "0";
            userInput.setText(num);
        }
        if (v.getId() == R.id.btn_back) {
            char[] bufferChar = userInput.getText().toString().toCharArray();
            String bufferStr = "";
            for (int i = 0; i < bufferChar.length - 1; i++) {
                bufferStr = bufferStr + bufferChar[i];
            }
            num = bufferStr;
            userInput.setText(num);

        }
    }

    public void component() {
        userInput = (TextView) findViewById(R.id.user_input);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btn0 = (Button) findViewById(R.id.btn_0);
        btnEnter = (Button) findViewById(R.id.btn_enter);
        btnBack = (Button) findViewById(R.id.btn_back);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnEnter.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }
}
