package com.example.toastermessage2;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage2 {
    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
