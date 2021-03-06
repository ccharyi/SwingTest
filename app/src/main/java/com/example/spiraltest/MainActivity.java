package com.example.spiraltest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.spiraltest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }

    private void OnClickButtonListener(){
        Button team_1 = (Button)findViewById(R.id.team1);
        Button team_2 = (Button)findViewById(R.id.team2);
        Button team_3 = (Button)findViewById(R.id.team3);
        Button team_4 = (Button)findViewById(R.id.team4);
        Button team_5 = (Button)findViewById(R.id.team5);
        Button team_6 = (Button)findViewById(R.id.team6);
        Button team_7 = (Button)findViewById(R.id.team7);
        Button team_8 = (Button)findViewById(R.id.team8);
        Button team_9 = (Button)findViewById(R.id.team9);
        Button team_10 = (Button)findViewById(R.id.team10);
        Button team_12 = (Button)findViewById(R.id.team12);
        Button team_13 = (Button)findViewById(R.id.team13);
        Button team_14 = (Button)findViewById(R.id.team14);
        Button team_15 = (Button)findViewById(R.id.team15);
        Button team_16 = (Button)findViewById(R.id.team16);
        Button team_17 = (Button)findViewById(R.id.team17);
        Button team_19 = (Button)findViewById(R.id.team19);

        team_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team1");
                        startActivity(intent);
                    }
                }
        );
        team_2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team2");
                        startActivity(intent);
                    }
                }
        );
        team_3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team3");
                        startActivity(intent);
                    }
                }
        );
        team_4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle("Spiral Test Instructions");
                        builder.setMessage("When the countdown completes, use your LEFT hand to trace the spiral" +
                                " that appears on the screen. After the first round ends, repeat this " +
                                "process with your RIGHT hand.");
                        builder.setPositiveButton("Okay",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // if this button is clicked, close
                                // current activity
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent("com.example.spiraltest.Team4");
                                        startActivity(intent);
                                    }
                                }, 50);
                            }
                        });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                }
        );
        team_5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team5");
                        startActivity(intent);
                    }
                }
        );
        team_6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team6");
                        startActivity(intent);
                    }
                }
        );
        team_7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team7");
                        startActivity(intent);
                    }
                }
        );
        team_8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team8");
                        startActivity(intent);
                    }
                }
        );
        team_9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team9");
                        startActivity(intent);
                    }
                }
        );
        team_10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team10");
                        startActivity(intent);
                    }
                }
        );
        team_12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team12");
                        startActivity(intent);
                    }
                }
        );
        team_13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team13");
                        startActivity(intent);
                    }
                }
        );
        team_14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team14");
                        startActivity(intent);
                    }
                }
        );
        team_15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team15");
                        startActivity(intent);
                    }
                }
        );
        team_16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team16");
                        startActivity(intent);
                    }
                }
        );
        team_17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team17");
                        startActivity(intent);
                    }
                }
        );
        team_19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.spiraltest.Team19");
                        startActivity(intent);
                    }
                }
        );




    }
}
