package com.example.mcleod.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message_activty);
        String myMessage = getIntent().getStringExtra(MyActivity.EXTRA_MESSAGE);
        TextView displayText = (TextView) findViewById(R.id.displayMessage);
        displayText.setText(myMessage);

    }
}
