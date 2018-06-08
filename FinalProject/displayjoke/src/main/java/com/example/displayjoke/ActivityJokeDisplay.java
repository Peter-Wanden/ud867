package com.example.displayjoke;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityJokeDisplay extends AppCompatActivity {

    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeTv = findViewById(R.id.joke_tv);
        String incomingJoke = getIntent().getStringExtra(JOKE_KEY);
        jokeTv.setText(incomingJoke);
    }
}
