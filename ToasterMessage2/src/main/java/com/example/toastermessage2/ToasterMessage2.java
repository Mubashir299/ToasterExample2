package com.example.toastermessage2;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage2 {
    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public static void calculator(Context c) {
        c.startActivity(new Intent(c, CalculatorActivity.class));


    }

    public static void display(Context c, int result) {
        s(c, "result is:" + result);
        Toast.makeText(c, "result is :"+result, Toast.LENGTH_SHORT).show();
    }


}
