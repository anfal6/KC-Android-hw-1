package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<B2> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e1 = findViewById(R.id.ED1);
        EditText e2 = findViewById(R.id.ED2);
        EditText e3 = findViewById(R.id.ED3);
        EditText e4 = findViewById(R.id.ED4);
        Button B1 = findViewById(R.id.button1);
        TextView t1 = findViewById(R.id.textView1);
        TextView t2 = findViewById(R.id.textView2);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int num3 = Integer.parseInt(e3.getText().toString());
                int num4 = Integer.parseInt(e4.getText().toString());

                int result = num1+num2+num3+num4;

                t2.setText(String.valueOf(result));
    }
});}

    }

