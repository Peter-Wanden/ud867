package com.udacity.gadle.builditbigger;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.displayjoke.ActivityJokeDisplay;
import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    private static final String joke = "Two parrots on a perch. One says to the other 'Can you smell fish?'";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Rule
    public ActivityTestRule<ActivityJokeDisplay> mDisplayActivityRule = new ActivityTestRule<>(
            ActivityJokeDisplay.class);

    @Test
    public void testJokeButton() {

        onView(withId(R.id.fragment_main_tell_joke_button)).perform(click());

        onView(withId(R.id.joke_tv)).check(matches(withText(joke)));
    }
}
