package com.example.dell.decissionmaking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.resultId);
        editText = findViewById(R.id.numberId);
    }

    public void checkNumber(View view) {

        int number = Integer.parseInt(editText.getText().toString());

        if (number > 0){
            //positive
            textView.setText("positive");
        }
        else if(number < 0) {
            //negative
            textView.setText("negative");
        }
        else {
            //number is zero
            textView.setText("zero");
        }

    }
}
