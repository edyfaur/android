package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText number1Input;
    EditText number2Input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Input = findViewById(R.id.number1_input);
        number2Input = findViewById(R.id.number2_input);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(number1Input.getText().toString());
                double number2 = Double.parseDouble(number2Input.getText().toString());

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("number1", number1);
                intent.putExtra("number2", number2);
                startActivity(intent);
            }
        });
        double result = getIntent().getDoubleExtra("result", 0);
        TextView resultView = findViewById(R.id.result_view);
        resultView.setText("Result: " + result);
    }
}
