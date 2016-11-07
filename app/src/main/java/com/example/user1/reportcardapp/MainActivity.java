package com.example.user1.reportcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lectureClick(View v) {
                Intent objIntent = new Intent(MainActivity.this, techer1.class);
                startActivity(objIntent);
           }
    public void studentClick(View view){
        Intent objIntent = new Intent(MainActivity.this, studentLogIn.class);
        startActivity(objIntent);
    }
}
