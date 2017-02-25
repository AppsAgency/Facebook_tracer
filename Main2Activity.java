package com.example.robot.ex001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bu1=(Button) findViewById(R.id.bu_pic);
        Bundle b = getIntent().getExtras();

    }
}
