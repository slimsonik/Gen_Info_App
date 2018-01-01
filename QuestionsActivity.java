package com.example.android.geninfo1app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;


public class QuestionsActivity extends Activity {
    RadioButton radio_rabat, radio_uae, radio_rupee, radio_eliz2, radio_west, radio_Al, radio_1131;
    CheckBox checkbox_GM, checkbox_JM, checkbox_JPE;

    int answer1_points;
    int answer2_points;
    int answer3_points;
    int answer4_points;
    int answer5_points;
    int answer6_points;
    int answer7_points;
    int answer8_points;
    int sum_points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //Verify correct answer for question 1
        switch (view.getId()) {
            case R.id.radio_rabat:
                if (checked) {
                    answer1_points = 1;
                } else {
                    answer1_points = 0;
                }
        }
        //Verify correct answer for question 2
        switch (view.getId()) {
            case R.id.radio_uae:
                if (checked) {
                    answer2_points = 1;
                } else {
                    answer2_points = 0;
                }
        }
        //Verify correct answer for question 3
        switch (view.getId()) {
            case R.id.radio_rupee:
                if (checked) {
                    answer3_points = 1;
                } else {
                    answer3_points = 0;
                }
        }

        //Verify correct answer for question 4
        switch (view.getId()) {
            case R.id.radio_eliz2:
                if (checked) {
                    answer4_points = 1;
                } else {
                    answer4_points = 0;
                }
        }
        //Verify correct answer for question 5
        switch (view.getId()) {
            case R.id.radio_west:
                if (checked) {
                    answer5_points = 1;
                } else {
                    answer5_points = 0;
                }
        }
        //Verify correct answer for question 6
        switch (view.getId()) {
            case R.id.radio_Al:
                if (checked) {
                    answer6_points = 1;
                } else {
                    answer6_points = 0;
                }
        }
        //Verify correct answer for question 7
        switch (view.getId()) {
            case R.id.radio_1131:
                if (checked) {
                    answer7_points = 1;
                } else {
                    answer7_points = 0;
                }
        }
    }

    public void onCheckBoxClicked(View view) {
        //Verify correct answer for question 8. Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_JM & R.id.checkbox_JPE:
                if (checked) {
                    answer8_points = 1;
                } else {
                    answer8_points = 0;
                }
        }
    }

    //Sum of total points
    public void onClickEndQuiz(View view) {
        int sum_points = 0;

        sum_points = answer1_points + answer2_points +
                answer3_points + answer4_points +
                answer5_points + answer6_points +
                answer7_points + answer8_points;
        //set text to view the final score
        Intent intent = getIntent();
        String nameOfPerson = intent.getStringExtra("name");
        TextView text = (TextView) findViewById(R.id.quiz_result_text);
        text.setVisibility(View.VISIBLE);
        text.setText(nameOfPerson + "  " + getString(R.string.your_score_is) + "  " + sum_points + "  " + getString(R.string.out_of_8_well_done));

    }

    // this is to move to the next activity of answers
    public void onClickSeeAnswers(View view) {
        Intent getAnswersActivityIntent = new Intent(this, AnswersActivity.class);
        startActivity(getAnswersActivityIntent);
    }


}