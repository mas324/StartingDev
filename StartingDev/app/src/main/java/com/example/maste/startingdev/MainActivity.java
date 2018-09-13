package com.example.maste.startingdev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.screenView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Reset text color to black
            ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorBlack));
            //Reset text to "Hello from Shawn"
            ((TextView) findViewById(R.id.textView)).setText("Hello from Shawn");
            //Reset background color to colorPrimary
            findViewById(R.id.screenView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.textColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("User", "Pressed text color");
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.backgroundColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("User", "Pressed bg color");
                findViewById(R.id.screenView).setBackgroundColor(getResources().getColor(R.color.colorSecondary));
            }
        });

        findViewById(R.id.changeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("User", "Pressed input button");
                String newText = ((EditText) findViewById(R.id.newText)).getText().toString();
                if (TextUtils.isEmpty(newText))
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Shawn");
                else
                    ((TextView) findViewById(R.id.textView)).setText(newText);
            }
        });

    }
}