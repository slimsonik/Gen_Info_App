package com.example.android.geninfo1app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class AnswersActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);
    }
    // this is to start the quiz from the beginning
    public void RetryQuiz(View view) {
        Intent getMainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(getMainActivityIntent);
    }

}
