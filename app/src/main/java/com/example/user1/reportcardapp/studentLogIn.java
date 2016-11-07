package com.example.user1.reportcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class studentLogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_log_in);
    }
    public void viewClick(View v) {
        Intent objIntent = new Intent(studentLogIn.this, viewresults.class);
        startActivity(objIntent);
    }


}
