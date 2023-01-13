package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    double number1;
    double number2;
    TextView resultView;
    Button addButton;
    Button subButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1 = getIntent().getDoubleExtra("number1", 0);
        number2 = getIntent().getDoubleExtra("number2", 0);
        resultView = findViewById(R.id.result_view);
        addButton = findViewById(R.id.add_button);
        subButton = findViewById(R.id.sub_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = number1 + number2;
               // resultView.setText("Result: " + result);
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = number1 - number2;
                //resultView.setText("Result: " + result);
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });

    }
}


