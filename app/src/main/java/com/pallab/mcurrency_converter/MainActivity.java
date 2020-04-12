package com.pallab.mcurrency_converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public void convertToEuro(View view) {
        EditText editText = (EditText) findViewById(R.id.edtText);
        int dollars = Integer.parseInt(editText.getText().toString());
        double euro = 76.18;
        double result = dollars * euro;
        Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
