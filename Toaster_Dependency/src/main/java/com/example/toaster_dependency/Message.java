package com.example.toaster_dependency;

import android.content.Context;
import android.widget.Toast;

public class Message {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
