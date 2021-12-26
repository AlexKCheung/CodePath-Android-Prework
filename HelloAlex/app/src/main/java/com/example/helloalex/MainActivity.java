package com.example.helloalex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // button to let user change text color of label
        // when button clicked: do action
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change text color on label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        // button to change background color
        findViewById(R.id.background_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_green));
            }
        });

        // button to change text words
        findViewById(R.id.text_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // reset all to default
        // resets text color, background color, text words
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // text color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));

                // text words
                ((TextView) findViewById(R.id.text)).setText("Hello from Alex!");

                // background color
                findViewById(R.id.parent).setBackgroundColor((getResources().getColor(R.color.light_blue)));

            }
        });


    }
}