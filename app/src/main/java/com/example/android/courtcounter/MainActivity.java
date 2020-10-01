package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int sumTotal = 0;

    public void addOneForTeamA(View v) {
        if (scoreA + scoreB <= 20)
            scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        if (scoreA + scoreB <= 20)
            scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        if (scoreA + scoreB <= 20)
            scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    int scoreB = 0;

    public void addOneForTeamB(View v) {
        if (scoreA + scoreB <= 20)
            scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void addTwoForTeamB(View v) {
        if (scoreA + scoreB <= 20)
            scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addThreeForTeamB(View v) {
        if (scoreA + scoreB <= 20)
            scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void winner(int scoreA, int scoreB) {
        if (scoreA + scoreB >= 20) {
            if (scoreA > scoreB)
                displayResult("A is Winner!");
            else
                displayResult("B is Winner!");
        }
    }

    public void displayResult(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetTheValue(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
