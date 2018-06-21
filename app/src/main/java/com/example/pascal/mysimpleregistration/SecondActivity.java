package com.example.pascal.mysimpleregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        TextView textView1 = findViewById(R.id.textView11);

        String givenText1 = getIntent().getExtras().getString("text");

        textView1.setText(givenText1);



        TextView textView2 = findViewById(R.id.textView22);

        String givenText2 = getIntent().getExtras().getString("text2");

        textView2.setText(givenText2);


        TextView textViw3 = findViewById(R.id.textView33);

        String givenText3 = getIntent().getExtras().getString("text3");

        textViw3.setText(givenText3);


        TextView textView4 = findViewById(R.id.textView44);

        String givenText4 = getIntent().getExtras().getString("text4");

        textView4.setText(givenText4);


        TextView textView5 = findViewById(R.id.textView55);

        String givenText5 = getIntent().getExtras().getString("text5");

        textView5.setText(givenText5);



    }
}
