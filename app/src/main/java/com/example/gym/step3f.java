package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.starostinagym.R;

public class step3f extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.starostinagym.R.layout.activity_step3f);
    }
    public void GoToStepFour(View view){
        Intent intent = new Intent(this, step4.class);
        startActivity(intent);
    }
}