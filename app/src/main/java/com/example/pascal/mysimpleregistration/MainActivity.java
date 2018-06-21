package com.example.pascal.mysimpleregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final EditText editText1 = findViewById(R.id.editText1);

        final EditText editText2 = findViewById(R.id.editText2);

        final EditText editText3 = findViewById(R.id.editText3);

        final EditText editText4 = findViewById(R.id.editText4);

        final EditText editText5 = findViewById(R.id.editText5);



        Button btn = findViewById(R.id.btn_Submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myText = editText1.getText().toString();
                String myText2 = editText2.getText().toString();
                String myText3 = editText3.getText().toString();
                String myText4 = editText4.getText().toString();
                String myText5 = editText5.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("text", myText);
                intent.putExtra("text2", myText2);
                intent.putExtra("text3", myText3);
                intent.putExtra("text4", myText4);
                intent.putExtra("text5", myText5);

                startActivity(intent);



                finish();
            }
        });








    }
}
