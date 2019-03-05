package com.example.fanny.calculadorav2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    EditText resultado;

    double num1;
    double num2;
    double result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        numero1 = (EditText)findViewById(R.id.num1);
        numero2 = (EditText)findViewById(R.id.num2);
        resultado = (EditText)findViewById(R.id.result);
    }

    private void valuesCasting(){
        num1 = Double.parseDouble(numero1.getText().toString());
        num2 = Double.parseDouble(numero2.getText().toString());
    }

    public void addOnClick(View view){
        try{
            valuesCasting();
            result = num1 + num2;
            resultado.setText(String.valueOf(result));
        }catch (Exception e){
            Log.e("Error add:", "Error 01 " + e.getMessage());
            resultado.setText("Error");
        }
    }
    public void restOnClick(View view){
        try{
            valuesCasting();
            result = num1 - num2;
            resultado.setText(String.valueOf(result));
        }catch (Exception e){
            Log.e("Error rest:", "Error 02 " + e.getMessage());
            resultado.setText("Error");
        }
    }
    public void divisionOnClick(View view){
        try{
            valuesCasting();
            result = num1 / num2;
            resultado.setText(String.valueOf(result));
        }catch (Exception e){
            Log.e("Error division:", "Error 03 " + e.getMessage());
            resultado.setText("Error");
        }
    }
    public void multiplicationOnClick(View view){
        try{
            valuesCasting();
            result = num1 * num2;
            resultado.setText(String.valueOf(result));
        }catch (Exception e){
            Log.e("Error multiplication:", "Error 4 " + e.getMessage());
            resultado.setText("Error");
        }
    }
    public void moduleOnClick(View view){
        try{
            valuesCasting();
            result = num1 % num2;
            resultado.setText(String.valueOf(result));
        }catch (Exception e){
            Log.e("Error module:", "Error 05 " + e.getMessage());
            resultado.setText("Error");
        }
    }
}
