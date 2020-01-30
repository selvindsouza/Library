package com.vijnalabs.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;

import androidx.appcompat.app.AppCompatActivity;

public class Player extends AppCompatActivity {

    String name;

    public static void shortToast(Context context, String name) {
        Toast.makeText(context, name, Toast.LENGTH_LONG).show();
    }

    public String getTextFromImage(Bitmap bitmap) {

        StringBuilder sb = null;

        TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();

        if (!textRecognizer.isOperational()) {

            Toast.makeText(getApplicationContext(), "Could not get the Text", Toast.LENGTH_LONG).show();

        } else {

            Frame frame = new Frame.Builder().setBitmap(bitmap).build();
            SparseArray<TextBlock> items = textRecognizer.detect(frame);
             sb = new StringBuilder();

            for (int i = 0; i < items.size(); i++) {
                TextBlock myItem = items.valueAt(i);
                sb.append(myItem.getValue());
                sb.append("\n");
            }

        }

        return sb.toString();

    }

}
