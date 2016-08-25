package com.example.akanksha.assignment_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    int number,i,check=0,flag=0;
    String message,check1="f";
    public final static String MESSAGE_KEY="com.example.akanksha.assignment_2.message_key";
    public final static String MESS_KEY1="com.example.akanksha.assignment_2.mess_key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        message = intent.getStringExtra(MESSAGE_KEY);
        number = Integer.parseInt(message);

    }


    public void onButtonClick7(View v)
    {
        check1="t";
        for(i=2;i<number;i++)
        {
            if(number%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            Toast.makeText(ThirdActivity.this,number+" "+"Not Prime",Toast.LENGTH_SHORT).show();
        else{

            Toast.makeText(ThirdActivity.this,number+" "+"Prime",Toast.LENGTH_SHORT).show();}



    }


    public void onBackPressed()
    {
        if(check1.equalsIgnoreCase("t"))
        {
            Intent intent2 = new Intent();
            intent2.putExtra(MESS_KEY1,check1);
            setResult(RESULT_OK,intent2);
        }


        super.onBackPressed();
    }





}// class ends



