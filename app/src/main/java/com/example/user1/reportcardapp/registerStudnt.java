package com.example.user1.reportcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class registerStudnt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_studnt);
    }
    public void regClick(View view){
        Intent objIntent = new Intent(registerStudnt.this,Register.class);
        startActivity(objIntent);
    }
}
