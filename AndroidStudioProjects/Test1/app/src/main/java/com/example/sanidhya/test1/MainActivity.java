package com.example.sanidhya.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Fact;
    private Button  Sum;
    private EditText Number;
    private TextView t;
    int n;
    int factor;
    int summer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t= (TextView) findViewById(R.id.t1);

        Fact = (Button) findViewById(R.id.facto);

        Fact.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Number = (EditText) findViewById(R.id.Edit1);
                calculate();
               t.setText(String.valueOf(factor));
            }
        });

        Sum = (Button) findViewById(R.id.sum1);


        Sum.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Number = (EditText) findViewById(R.id.Edit1);
                calculate();
                t.setText(String.valueOf(summer));
            }
        });
    }


    private int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
    private int sum (int n)
    {
        return (n*(n+1))/2 ;
    }
    private void calculate()
    {

        String no = Number.getText().toString();
        try {
            n = Integer.parseInt(no);
        }
        catch(NumberFormatException nfe){}
        factor= factorial(n);
        summer=sum(n);

    }
}