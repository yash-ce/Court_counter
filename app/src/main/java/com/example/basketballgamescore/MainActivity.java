package com.example.basketballgamescore;
//
import androidx.appcompat.app.AppCompatActivity;
//
import android.os.Bundle;
//
////public class MainActivity extends AppCompatActivity {
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////    }
////}
//
////package com.example.android.courtcounter;
//
//import android.os.Bundle;
////import android.support.v7.app.AppCompatActivity;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    /**
//     * Increase the score for Team A by 1 point.
//     */
//    public void addOneForTeamA(View v) {
//        displayForTeamA(1);
//    }
//
//    /**
//     * Increase the score for Team A by 2 points.
//     */
//    public void addTwoForTeamA(View v) {
//        displayForTeamA(2);
//    }
//
//    /**
//     * Increase the score for Team A by 3 points.
//     */
//    public void addThreeForTeamA(View v) {
//        displayForTeamA(3);
//    }
//
//    /**
//     * Displays the given score for Team A.
//     */
//    public void displayForTeamA(int score) {
//        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
//        scoreView.setText(String.valueOf(score));
//    }
//}


//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//

//`package com.example.android.courtcounter;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_a_score = 0;
    int team_b_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {

        displayForTeamA(team_a_score+=1);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA(team_a_score+=2);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {

        displayForTeamA(team_a_score+=3);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {

        displayForTeamB(team_b_score+=1);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        displayForTeamB(team_b_score+=2);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {

        displayForTeamB(team_b_score+=3);
    }

    public void resetScore(View v) {
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}