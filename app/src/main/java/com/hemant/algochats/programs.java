package com.hemant.algochats;

import android.content.Intent;
import android.os.Bundle;

import com.hemant.python.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class programs extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView3;
    String file;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listView3=(ListView)findViewById(R.id.program_listview);
        listView3.setOnItemClickListener(this);
        String[] s3 =new String[]{"Find the Area of Rectangle Using Classes","Swap Two number without using a Temporary variable","Reverse a Given Number",
                "Check whether given number is positive or nigative","Calculate Average of Numbers in a Given List","Print Odd Numbers Within a Given Range",
                "Read Two Numbers and Print Their Quotient and Remainder","Find Sum of Digits in a Number","Find Smallest Divisor of an Integer"
        ,"Count the Number of Digits in a Number","Check if a Number is a Palindrome","Print all Integer that are not Divisible by Either 2 or 3 and Lie between 1 and 50"
        ,"Read a Number n and Print the Series 1+2+....+n=","Read a Number n and Print the Natural Numbers Summation Pattern","Program to Print Identity Matrix",
       "Check Whether a Given Year is a Leap Year" };
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,s3);
        listView3.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView< ? > adapterView, View view, int i, long l) {

        String value3= (String)listView3.getItemAtPosition(i);

        if ("Find the Area of Rectangle Using Classes".equals(value3)) {
            file = "rect";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Swap Two number without using a Temporary variable".equals(value3)) {
            file = "swap";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Reverse a Given Number".equals(value3)) {
            file = "reverse";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Check whether given number is positive or nigative".equals(value3)) {
            file = "PorN";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Calculate Average of Numbers in a Given List".equals(value3)) {
            file = "7";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Print Odd Numbers Within a Given Range".equals(value3)) {
            file = "11";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Read Two Numbers and Print Their Quotient and Remainder".equals(value3)) {
            file = "9";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Find Sum of Digits in a Number".equals(value3)) {
            file = "12";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Find Smallest Divisor of an Integer".equals(value3)) {
            file = "13";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Count the Number of Digits in a Number".equals(value3)) {
            file = "14";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Check if a Number is a Palindrome".equals(value3)) {
            file = "15";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Print all Integer that are not Divisible by Either 2 or 3 and Lie between 1 and 50".equals(value3)) {
            file = "16";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Read a Number n and Print the Series 1+2+....+n=".equals(value3)) {
            file = "17";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Read a Number n and Print the Natural Numbers Summation Pattern".equals(value3)) {
            file = "18";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Program to Print Identity Matrix".equals(value3)) {
            file = "19";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        } else if ("Check Whether a Given Year is a Leap Year".equals(value3)) {
            file = "24";
            intent = new Intent(this, programDataActivity.class);
            intent.putExtra("title", file);
            startActivity(intent);
        }
    }
}
