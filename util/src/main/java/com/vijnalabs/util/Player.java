package com.vijnalabs.util;

import android.content.Context;
import android.widget.Toast;

public class Player {

    String name;

    public static void shortToast(Context context, String name) {
        Toast.makeText(context, name, Toast.LENGTH_LONG).show();
    }
}
