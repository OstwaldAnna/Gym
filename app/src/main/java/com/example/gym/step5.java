package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.starostinagym.R;

public class step5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.starostinagym.R.layout.activity_step5);
    }
    public void GoToRegistr(View view){
        Intent intent = new Intent(this, main_registration.class);
        startActivity(intent);
    }
}