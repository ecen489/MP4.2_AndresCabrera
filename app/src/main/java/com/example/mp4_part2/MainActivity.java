package com.example.mp4_part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    float num1, num2;
    boolean ifAdd, ifSub, ifMul, ifDiv;

    /** Called when the user taps the 0 button */
    public void pressZero(View view) {
        String num0 = "0";
        TextView textView = findViewById(R.id.textView);
        String current0 = textView.getText().toString();
        String new_text0 = current0 + num0;
        textView.setText(new_text0);
    }

    /** Called when the user taps the 1 button */
    public void pressOne(View view) {
        String num1 = "1";
        TextView textView = findViewById(R.id.textView);
        String current1 = textView.getText().toString();
        String new_text1 = current1 + num1;
        textView.setText(new_text1);
    }

    /** Called when the user taps the 2 button */
    public void pressTwo(View view) {
        String num2 = "2";
        TextView textView = findViewById(R.id.textView);
        String current2 = textView.getText().toString();
        String new_text2 = current2 + num2;
        textView.setText(new_text2);
    }

    /** Called when the user taps the 3 button */
    public void pressThree(View view) {
        String num3 = "3";
        TextView textView = findViewById(R.id.textView);
        String current3 = textView.getText().toString();
        String new_text3 = current3 + num3;
        textView.setText(new_text3);
    }

    /** Called when the user taps the 4 button */
    public void pressFour(View view) {
        String num4 = "4";
        TextView textView = findViewById(R.id.textView);
        String current4 = textView.getText().toString();
        String new_text4 = current4 + num4;
        textView.setText(new_text4);
    }

    /** Called when the user taps the 1 button */
    public void pressFive(View view) {
        String num5 = "5";
        TextView textView = findViewById(R.id.textView);
        String current5 = textView.getText().toString();
        String new_text5 = current5 + num5;
        textView.setText(new_text5);
    }

    /** Called when the user taps the 1 button */
    public void pressSix(View view) {
        String num6 = "6";
        TextView textView = findViewById(R.id.textView);
        String current6 = textView.getText().toString();
        String new_text6 = current6 + num6;
        textView.setText(new_text6);
    }

    /** Called when the user taps the 1 button */
    public void pressSeven(View view) {
        String num7 = "7";
        TextView textView = findViewById(R.id.textView);
        String current7 = textView.getText().toString();
        String new_text7 = current7 + num7;
        textView.setText(new_text7);
    }

    /** Called when the user taps the 1 button */
    public void pressEight(View view) {
        String num8 = "8";
        TextView textView = findViewById(R.id.textView);
        String current8 = textView.getText().toString();
        String new_text8 = current8 + num8;
        textView.setText(new_text8);
    }

    /** Called when the user taps the 1 button */
    public void pressNine(View view) {
        String num9 = "9";
        TextView textView = findViewById(R.id.textView);
        String current9 = textView.getText().toString();
        String new_text9 = current9 + num9;
        textView.setText(new_text9);
    }

    /** Called when the user taps the decimal button */
    public void pressDecimal(View view) {
        String dec = ".";
        TextView textView = findViewById(R.id.textView);
        String currentdec = textView.getText().toString();
        int dec_bool = currentdec.indexOf('.');
        if (dec_bool < 0) {
            String new_text_dec = currentdec + dec;
            textView.setText(new_text_dec);
        }
    }

    /** Called when the user taps the negative button */
    public void pressNegative(View view) {
        String neg = "-";
        TextView textView = findViewById(R.id.textView);
        String current_num = textView.getText().toString();
        int neg_bool = current_num.indexOf('-');
        if (neg_bool < 0) {
            String new_text_neg = neg + current_num;
            textView.setText(new_text_neg);
        } else {
            String new_text_neg = current_num.replace("-","");
            textView.setText(new_text_neg);
        }
    }

    /** Called when the user taps the M button */
    public void pressMultiply(View view) {
        TextView textView = findViewById(R.id.textView);
        String current_num = textView.getText().toString();
        num1 = Float.parseFloat(current_num);
        ifMul = true;
        ifAdd = false;
        ifSub = false;
        textView.setText("0");
    }

    /** Called when the user taps the S button */
    public void pressSubtract(View view) {
        TextView textView = findViewById(R.id.textView);
        String current_num = textView.getText().toString();
        num1 = Float.parseFloat(current_num);
        ifSub = true;
        ifAdd = false;
        ifMul = false;
        textView.setText("0");
    }

    /** Called when the user taps the A button */
    public void pressAdd(View view) {
        TextView textView = findViewById(R.id.textView);
        String current_num = textView.getText().toString();
        num1 = Float.parseFloat(current_num);
        ifAdd = true;
        ifSub = false;
        ifMul = false;
        textView.setText("0");
    }

    /** Called when the user taps the equals button */
    public void pressEquals(View view) {
        TextView textView = findViewById(R.id.textView);
        String current_num = textView.getText().toString();
        num2 = Float.parseFloat(current_num);

        if (ifAdd == true) {
            Float result_float = num1 + num2;
            String result_str = Float.toString(result_float);
            textView.setText(result_str);
            ifAdd = false;
            ifSub = false;
            ifMul = false;
        }

        if (ifSub == true) {
            Float result_float = num1 - num2;
            String result_str = Float.toString(result_float);
            textView.setText(result_str);
            ifAdd = false;
            ifSub = false;
            ifMul = false;
        }

        if (ifMul == true) {
            Float result_float = num1 * num2;
            String result_str = Float.toString(result_float);
            textView.setText(result_str);
            ifAdd = false;
            ifSub = false;
            ifMul = false;
        }
    }

    /** Called when the user taps the clear button */
    public void pressClear(View view) {
        String clear = "0";
        TextView textView = findViewById(R.id.textView);
        textView.setText(clear);
    }
}
