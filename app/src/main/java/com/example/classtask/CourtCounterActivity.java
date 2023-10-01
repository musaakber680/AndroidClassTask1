package com.example.classtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CourtCounterActivity extends AppCompatActivity {

    TextView resteamA, resteamB;
    Button threepoints, twopoints, freethrow, threepointsB, twopointsB, freethrowB, resetBtn;

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);

        resteamA = findViewById(R.id.resteamA);
        resteamB = findViewById(R.id.resteamB);
        threepoints = findViewById(R.id.threepoints);
        twopoints = findViewById(R.id.twopoints);
        freethrow = findViewById(R.id.freethrow);
        threepointsB = findViewById(R.id.threepointsB);
        twopointsB = findViewById(R.id.twopointsB);
        freethrowB = findViewById(R.id.freethrowB);
        resetBtn = findViewById(R.id.resetBtn);

        // three points for team A

        threepoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore += 3;
                updateTeamAScore();
            }
        });

        // end

        // two points for team A

        twopoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore += 2;
                updateTeamAScore();
            }
        });

        // end

        // free throw for team A

        freethrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTeamAScore();
            }
        });

        // end

        // three points for team B

        threepointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore += 3;
                updateTeamBScore();
            }
        });

        // end

        // two points for team B

        twopointsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore += 2;
                updateTeamBScore();
            }
        });

        // end

        // free throw for team B

        freethrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTeamBScore();
            }
        });

        // end

        // for reset the button

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resteamA.setText("0");
                resteamB.setText("0");
            }
        });
        // end

    }

    // result for team A

    private void updateTeamAScore() {
        resteamA.setText(String.valueOf(teamAScore));
    }

    // end

    // result for team B

    private void updateTeamBScore() {
        resteamB.setText(String.valueOf(teamBScore));
    }

    // end

}