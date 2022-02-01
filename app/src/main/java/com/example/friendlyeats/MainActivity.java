package com.example.friendlyeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

     void initViews() {
         Button first_button=findViewById(R.id.first_button);
         first_button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openSecondActivity();
             }
         });

    }
    void openSecondActivity(){
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}