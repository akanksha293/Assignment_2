/* application uses images and launcher icon that have been copied from the internet.
*/
package com.example.akanksha.assignment_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import android.widget.Toast;

import com.example.akanksha.assignment_2.R;

public class MainActivity extends AppCompatActivity {

    int num,number,x=0,check2=0;
    TextView t1;
    String mes="f",mes1="f";

    public final static String MESSAGE_KEY="com.example.akanksha.assignment_2.message_key";
    public final static String MESS_KEY="com.example.akanksha.assignment_2.mess_key";
    public final static String MESS_KEY1="com.example.akanksha.assignment_2.mess_key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView);
        if (savedInstanceState != null) {
        CharSequence savedText = savedInstanceState.getString("prime");
            t1.setText(savedText);

        }
        else
        {
            random();}

    }


    public void random()
    {
        Random r=new Random();
        num=r.nextInt((1000-2)+1)+2;
        t1.setText(Integer.toString(num));
    }

    public void onButtonClick1(View v)
    {
        int i,flag=0;
        if(mes1.equalsIgnoreCase("f"))
        {
            for(i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                Toast.makeText(MainActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
            else{

                Toast.makeText(MainActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();}

        }
        else
        {
            Toast.makeText(MainActivity.this,"You have cheated",Toast.LENGTH_SHORT).show();

        }

    }

    public void onButtonClick2(View v)
    {
        int i,flag=0;
        if(mes1.equalsIgnoreCase("f"))
        {
            for(i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                Toast.makeText(MainActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();}
            else
                Toast.makeText(MainActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(MainActivity.this,"You have cheated",Toast.LENGTH_SHORT).show();

        }


    }

    public void onButtonClick3(View v)
    {
        mes1="f";
        mes="f";
        random();
    }

    public void onButtonClick4(View v)
    {
        if(mes1.equalsIgnoreCase("f"))
        {
            if(mes.equalsIgnoreCase("f"))
            {
                Intent intent1 = new Intent("com.example.akanksha.assignment_2.SecondActivity");
                startActivityForResult(intent1,1);
            }
            else
                Toast.makeText(MainActivity.this,"You have already taken hint",Toast.LENGTH_LONG).show();
        }

        else
            Toast.makeText(MainActivity.this,"Already cheated, no use of hint",Toast.LENGTH_LONG).show();



    }

    public void onActivityResult(int requestcode, int resultcode, Intent data)
    {
        super.onActivityResult(requestcode,resultcode,data);
        if(requestcode == 1)
        {
            if(resultcode == RESULT_OK){
                mes= data.getStringExtra(MESS_KEY);

            }
        }

        if(requestcode == 2)
        {
            if(resultcode == RESULT_OK){
                mes1= data.getStringExtra(MESS_KEY1);

            }
        }


    }

    public void onButtonClick5(View v)
    {
        if(mes1.equalsIgnoreCase("f"))
        {
            if(mes.equalsIgnoreCase("t"))
                Toast.makeText(MainActivity.this,"Already taken hint and now cheating",Toast.LENGTH_LONG).show();

            String msg = t1.getText().toString();
            Intent intent = new Intent("com.example.akanksha.assignment_2.ThirdActivity");
            intent.putExtra(MESSAGE_KEY,msg);
            startActivityForResult(intent,2);
        }
        else
            Toast.makeText(MainActivity.this,"Already cheated",Toast.LENGTH_LONG).show();



    }




    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putCharSequence("prime",t1.getText().toString()); /*saving state before rotation */

    }






}//class ends
