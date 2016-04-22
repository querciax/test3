package com.example.ggg.test3;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private TextView showDate,showTime,showTime2,showTime3,showTime4,showTime5;
    private TimePickerDialog timePickerDialog;
    int yearMain,monthMain,dateMain,hourMain,muniteMain;
    Button button,button2,button3,button4,button5;
    int hourMain2 = -1 ,muniteMain2 = -1;
    int hourMain3 = -1 ,muniteMain3 = -1;
    int hourMain4 = -1 ,muniteMain4 = -1;
    int hourMain5 = -1 ,muniteMain5 = -1;

    private ListView listAlarm;
    public static ArrayList<String> listValue;
    EditText editText;
    String value;
    int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listAlarm = (ListView)findViewById(R.id.listView);
        listValue = new ArrayList<String>();
        showDate = (TextView)findViewById(R.id.textView19);
        showTime = (TextView)findViewById(R.id.textView24);
        showTime2 = (TextView)findViewById(R.id.textView28);
        showTime3 = (TextView)findViewById(R.id.textView30);
        showTime4 = (TextView)findViewById(R.id.textView32);
        showTime5 = (TextView)findViewById(R.id.textView34);
        editText =(EditText)findViewById(R.id.editText4);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button3);
        button3 = (Button)findViewById(R.id.button2);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);


       // value = editText.getText().toString();
        //day = Integer.parseInt(value);



    }// Main Method

    public void clickDate (View view) {

        Calendar calendar = Calendar.getInstance();
        int intDate = calendar.get(Calendar.DAY_OF_MONTH);
        int intMonth = calendar.get(Calendar.MONTH);
        int intYear = calendar.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog =  new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                showDate.setText(Integer.toString(dayOfMonth) + "/" +
                        Integer.toString(monthOfYear + 1) + "/ " +
                        Integer.toString(year));

                yearMain = year;
                monthMain = monthOfYear;
                dateMain = dayOfMonth;

            }

        }, intYear,intMonth,intDate );

        datePickerDialog.show();

    } // Click setDate month year dialog and add

    public void clickTime (View view) {
        Calendar calendar = Calendar.getInstance();
        timePickerDialog = new TimePickerDialog(MainActivity.this, onTimeSetListener1,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false);

        timePickerDialog.setTitle("โปรดเลือกเวลา");
        timePickerDialog.show();
    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener1 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calendar = Calendar.getInstance();
            Calendar cloneCalendar1 = (Calendar) calendar.clone();

            cloneCalendar1.set(Calendar.HOUR_OF_DAY, hourOfDay);
            cloneCalendar1.set(Calendar.MINUTE, minute);
            showTime.setText(Integer.toString(hourOfDay) + ":" + Integer.toString(minute));

            hourMain = hourOfDay;
            muniteMain = minute;



            Log.d("18April", "cloneCalendar1 ==> " + cloneCalendar1.getTime());


        } // OnTimeSet
    }; // Time Dialog and add Time

    public void resetTime(View view){

        hourMain = -1;
        muniteMain = -1;
        showTime.setText("ไม่แจ้งเตือน");

    }

    public void resetTime2(View view){
        hourMain2 = -1;
        muniteMain2 = -1;
        showTime2.setText("ไม่แจ้งเตือน");
    }

    public void resetTime3(View view){
        hourMain2 = -1;
        muniteMain2 = -1;
        showTime3.setText("ไม่แจ้งเตือน");
    }

    public void resetTime4(View view){
        hourMain2 = -1;
        muniteMain2 = -1;
        showTime4.setText("ไม่แจ้งเตือน");
    }

    public void resetTime5(View view){
        hourMain2 = -1;
        muniteMain2 = -1;
        showTime5.setText("ไม่แจ้งเตือน");
    }


    public void clickTime2 (View view) {
        Calendar calendar = Calendar.getInstance();
        timePickerDialog = new TimePickerDialog(MainActivity.this, onTimeSetListener2,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false);

        timePickerDialog.setTitle("โปรดเลือกเวลา");
        timePickerDialog.show();
    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener2 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calendar = Calendar.getInstance();
            Calendar cloneCalendar1 = (Calendar) calendar.clone();

            cloneCalendar1.set(Calendar.HOUR_OF_DAY, hourOfDay);
            cloneCalendar1.set(Calendar.MINUTE, minute);
            showTime2.setText(Integer.toString(hourOfDay) + ":" + Integer.toString(minute));

            hourMain2 = hourOfDay;
            muniteMain2 = minute;



            Log.d("18April", "cloneCalendar1 ==> " + cloneCalendar1.getTime());


        } // OnTimeSet
    }; // Time Dialog and add Time

    public void clickTime3 (View view) {
        Calendar calendar = Calendar.getInstance();
        timePickerDialog = new TimePickerDialog(MainActivity.this, onTimeSetListener3,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false);

        timePickerDialog.setTitle("โปรดเลือกเวลา");
        timePickerDialog.show();
    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener3 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calendar = Calendar.getInstance();
            Calendar cloneCalendar1 = (Calendar) calendar.clone();

            cloneCalendar1.set(Calendar.HOUR_OF_DAY, hourOfDay);
            cloneCalendar1.set(Calendar.MINUTE, minute);
            showTime3.setText(Integer.toString(hourOfDay) + ":" + Integer.toString(minute));

            hourMain3 = hourOfDay;
            muniteMain3 = minute;



            Log.d("18April", "cloneCalendar1 ==> " + cloneCalendar1.getTime());


        } // OnTimeSet
    }; // Time Dialog and add Time

    public void clickTime4 (View view) {
        Calendar calendar = Calendar.getInstance();
        timePickerDialog = new TimePickerDialog(MainActivity.this, onTimeSetListener4,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false);

        timePickerDialog.setTitle("โปรดเลือกเวลา");
        timePickerDialog.show();
    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener4 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calendar = Calendar.getInstance();
            Calendar cloneCalendar1 = (Calendar) calendar.clone();

            cloneCalendar1.set(Calendar.HOUR_OF_DAY, hourOfDay);
            cloneCalendar1.set(Calendar.MINUTE, minute);
            showTime4.setText(Integer.toString(hourOfDay) + ":" + Integer.toString(minute));

            hourMain4 = hourOfDay;
            muniteMain4 = minute;



            Log.d("18April", "cloneCalendar1 ==> " + cloneCalendar1.getTime());


        } // OnTimeSet
    }; // Time Dialog and add Time

    public void clickTime5 (View view) {
        Calendar calendar = Calendar.getInstance();
        timePickerDialog = new TimePickerDialog(MainActivity.this, onTimeSetListener5,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false);

        timePickerDialog.setTitle("โปรดเลือกเวลา");
        timePickerDialog.show();
    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener5 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calendar = Calendar.getInstance();
            Calendar cloneCalendar1 = (Calendar) calendar.clone();

            cloneCalendar1.set(Calendar.HOUR_OF_DAY, hourOfDay);
            cloneCalendar1.set(Calendar.MINUTE, minute);
            showTime5.setText(Integer.toString(hourOfDay) + ":" + Integer.toString(minute));

            hourMain5 = hourOfDay;
            muniteMain5 = minute;



            Log.d("18April", "cloneCalendar1 ==> " + cloneCalendar1.getTime());


        } // OnTimeSet
    }; // Time Dialog and add Time



    public void setValue(View view){

        Calendar calendar = Calendar.getInstance();
        Calendar cloneCalendar = (Calendar)calendar.clone();

        cloneCalendar.set(Calendar.YEAR,yearMain);
        cloneCalendar.set(Calendar.MONTH,monthMain);
        cloneCalendar.set(Calendar.DAY_OF_MONTH, dateMain);

     if(hourMain > -1 && muniteMain > -1){
        cloneCalendar.set(Calendar.HOUR_OF_DAY, hourMain);
        cloneCalendar.set(Calendar.MINUTE, muniteMain);
        cloneCalendar.set(Calendar.SECOND, 0);

        mySetToAlarm(cloneCalendar);}

      //  resetValue(hourMain,muniteMain);
     if(hourMain2 > -1 && muniteMain2 > -1){
        cloneCalendar.set(Calendar.HOUR_OF_DAY,hourMain2);
        cloneCalendar.set(Calendar.MINUTE,muniteMain2);
        cloneCalendar.set(Calendar.SECOND,0);
        mySetToAlarm(cloneCalendar); }

     if(hourMain3 > -1 && muniteMain3 > -1){
        cloneCalendar.set(Calendar.HOUR_OF_DAY,hourMain3);
        cloneCalendar.set(Calendar.MINUTE,muniteMain3);
        cloneCalendar.set(Calendar.SECOND,0);
        mySetToAlarm(cloneCalendar); }

     if(hourMain4 > -1 && muniteMain4 > -1){
        cloneCalendar.set(Calendar.HOUR_OF_DAY,hourMain4);
        cloneCalendar.set(Calendar.MINUTE,muniteMain4);
        cloneCalendar.set(Calendar.SECOND,0);
        mySetToAlarm(cloneCalendar); }

     if(hourMain5 > -1 && muniteMain5 > -1){
     cloneCalendar.set(Calendar.HOUR_OF_DAY,hourMain5);
     cloneCalendar.set(Calendar.MINUTE,muniteMain5);
     cloneCalendar.set(Calendar.SECOND,0);
     mySetToAlarm(cloneCalendar); }

    } // TIME + DATE MONTH YEAR

    public void resetValue(int h,int mi){


        hourMain = 0;
        muniteMain = 0;



    }

    private void mySetToAlarm(Calendar mySetCalendar1) {

        listValue.add(mySetCalendar1.getTime() + "");



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listValue);
        listAlarm.setAdapter(adapter);

        final int _id = (int) System.currentTimeMillis();

        Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getBaseContext(), _id, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, mySetCalendar1.getTimeInMillis(), pendingIntent);

    } // mySetToAlarm mothod


}
