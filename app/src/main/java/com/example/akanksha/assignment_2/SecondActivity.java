package com.example.akanksha.assignment_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    public final static String MESS_KEY="com.example.akanksha.assignment_2.mess_key";;
    String check="f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


            }



    public void onButtonClick6(View v)
    {
        check="t";

        Toast.makeText(SecondActivity.this,"A prime no is the one which is divisible by itself and  1 only",Toast.LENGTH_SHORT).show();

    }

    public void onBackPressed()
    {
        if(check.equalsIgnoreCase("t"))
        Toast.makeText(SecondActivity.this,"Hint Received",Toast.LENGTH_SHORT).show();

        Intent intent2 = new Intent();
        intent2.putExtra(MESS_KEY,check);
        setResult(RESULT_OK,intent2);
        super.onBackPressed();
    }
    }// class ends


