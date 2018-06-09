package com.example.jokedisplay;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    public String getJoke() {
        return tellJoke;
    }
}
