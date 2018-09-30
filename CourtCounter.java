package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int score = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Resets the given scores for Teams A and B.
     */
    public void reset(View v) {
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        scoreTeamA = 0;
        scoreTeamB = 0;
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
/** Adds 3 points for Team A **/
    public void addThreeForTeamA(View v) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    /** Adds 2 points for Team A **/
    public void addTwoForTeamA(View v) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    /** Adds 1 point for Team A **/
    public void addOneForTeamA(View v) {
         scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    int scoreTeamB = 0;


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /** Adds 3 points for Team B **/
    public void addThreeForTeamB(View v) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    /** Adds 2 points for Team B **/
    public void addTwoForTeamB(View v) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    /** Adds 1 point for Team B **/
    public void addOneForTeamB(View v) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

}
