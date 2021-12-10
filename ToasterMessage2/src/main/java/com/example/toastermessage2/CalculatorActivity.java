package com.example.toastermessage2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
/*
        Button mButtonAdd = findViewById(R.id.button_add);
*/

/*
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }


                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());

                int sum = num1 + num2;

                mTextViewResult.setText(String.valueOf(sum));
                ToasterMessage2.display(MainActivity.this, sum);
                finish();
            }
        });
*/


    }

    public void Cal(View view) {
        if (mEditText1.getText().toString().length() == 0) {
            mEditText1.setText("0");
        }

        if (mEditText2.getText().toString().length() == 0) {
            mEditText2.setText("0");
        }


        int num1 = Integer.parseInt(mEditText1.getText().toString());
        int num2 = Integer.parseInt(mEditText2.getText().toString());

        int sum = num1 + num2;

        mTextViewResult.setText(String.valueOf(sum));
        ToasterMessage2.display(CalculatorActivity.this, sum);
        finish();
    }
}