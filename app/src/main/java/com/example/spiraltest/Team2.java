package com.example.spiraltest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.spiraltest.R;

public class Team2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team2);
    }

    public void toSpiralPrac(View v)
    {
        Intent intent = new Intent(Team2.this, Team2PracticeSpiral.class);
        startActivity(intent);
    }
}
