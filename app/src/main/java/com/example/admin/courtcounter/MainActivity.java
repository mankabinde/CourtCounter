package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* adds two point when clicked
    * */
    public void addTwoTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);


    }

    /**
     * adds one point when clicked
     */
    public void addOneTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds three points when clicked
     */

    public void addThreeTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

    }
public void resetScores(){

}
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /* adds two point when clicked
    *
    */
    public void addTwoTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    /* adds three point when clicked
    * */
    public void addThreeTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /* adds one point when clicked
    * */
    public void addOneTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }
    public void resetScores(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
