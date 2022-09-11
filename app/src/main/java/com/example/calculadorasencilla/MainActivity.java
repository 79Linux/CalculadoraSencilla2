package com.example.calculadorasencilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_mult;
    private Button btn_div;

    private TextView text_resultado;

    private EditText edit_num1;
    private EditText edit_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_resultado = findViewById(R.id.Resultado);

        edit_num1=findViewById(R.id.num_1);
        edit_num2=findViewById(R.id.num_2);


        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            text_resultado.setText(suma(Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString())) + "");
            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText(resta(Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString())) + "");
            }
        });
        btn_mult = findViewById(R.id.button_mult);
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText(multiplicacion(Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString())) + "");
            }
        });
        btn_div = findViewById(R.id.button4_div);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText(division(Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString())) + "" );
            }
        });


    }

    public double suma(int a, int b) {
        return a+b;
    }
    public double resta(int a, int b) {
        return a-b;
    }
    public double multiplicacion(int a, int b) {
        return a*b;
    }
    public double division(int a, int b) {
        int resultado = 0;
        if (b != 0) {
            return a / b;
        }
        return resultado;
    }
}
