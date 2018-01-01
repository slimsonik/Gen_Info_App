package com.example.android.geninfo1app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // this is to send the name entered to the second activity and also to move to the next activity when enter is pressed
    public void onSendEnterApp(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        Intent getQuestionsActivityIntent = new Intent(MainActivity.this, QuestionsActivity.class);
        getQuestionsActivityIntent.putExtra("name", nameField.getText().toString());
        startActivity(getQuestionsActivityIntent);

    }
}
