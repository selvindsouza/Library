package com.vijnalabs.library;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.vijnalabs.util.Player;

public class MainActivity extends AppCompatActivity {

    ImageView ivImg;
    TextView tvOcrValue;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImg = findViewById(R.id.ivImg);
        tvOcrValue = findViewById(R.id.tvOcrValue);
        submit = findViewById(R.id.submit);

        Player player = new Player();
        player.shortToast(this, "selvin");

        //player.getTextFromImage();
    }
    public void getTextFromImage(View v) {
        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.exit);
        Player player = new Player();
        String ocrValue = player.getTextFromImage(getApplicationContext(), bitmap);
        Toast.makeText(this, ".." + ocrValue, Toast.LENGTH_LONG).show();
    }
//    public void getTextFromImage(View v) {
//
//        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.exit);
//
//        TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();
//
//        if (!textRecognizer.isOperational()) {
//
//            Toast.makeText(getApplicationContext(), "Could not get the Text", Toast.LENGTH_LONG).show();
//
//        } else {
//
//            Frame frame = new Frame.Builder().setBitmap(bitmap).build();
//            SparseArray<TextBlock> items = textRecognizer.detect(frame);
//            StringBuilder sb = new StringBuilder();
//
//            for (int i = 0; i < items.size(); i++) {
//                TextBlock myItem = items.valueAt(i);
//                sb.append(myItem.getValue());
//                sb.append("\n");
//            }
//
//            tvOcrValue.setText(sb.toString());
//        }
//    }
}
