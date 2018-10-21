package com.just.pickaplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChosenActivity extends AppCompatActivity {

    Bundle globalInformation;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen);
        Intent i = getIntent();
        globalInformation = i.getExtras();

        t = findViewById(R.id.textView3);

        t.setText(globalInformation.getString("chosenName"));
    }
}