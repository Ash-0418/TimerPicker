package com.example.myapplication13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TimePicker tp;
    TextView ta3;
    Calendar c;
    String format="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp=(TimePicker)findViewById(R.id.timePicker1);
        ta3=(TextView)findViewById(R.id.textView3);
        c=Calendar.getInstance();
        //ta3.setText(""+c);
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int min=c.get(Calendar.MINUTE);
        showTime(hour,min);

    }//onCreate
    public void showTime(int hour, int min){
        if(hour==0){
            hour+=12;format="AM";
        }else if(hour==12){
            format="PM";
        }else if(hour>12){
            hour-=12;format="PM";
        }else{
            format="AM";
        }
        ta3.setText(""+hour+":"+min+" "+format);
    }//showTime
    public void displayTime(View v){
        int hour=tp.getHour();
        int min=tp.getMinute();
        showTime(hour,min);
    }
}//class