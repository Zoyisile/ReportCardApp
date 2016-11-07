package com.example.user1.reportcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class techer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techer1);
    }
    public void regClick(View view){
        Intent objIntent = new Intent(techer1.this, Register.class);
        startActivity(objIntent);
    }
}
