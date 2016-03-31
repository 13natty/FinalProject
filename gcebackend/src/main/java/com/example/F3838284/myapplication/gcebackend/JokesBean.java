package com.example.F3838284.myapplication.gcebackend;

import com.example.TellJokes;

/** The object model for the data we are sending through endpoints */
public class JokesBean {

    private TellJokes tellJokes;

    public JokesBean() {
        tellJokes = new TellJokes();
    }

    public String getJoke() {
        return tellJokes.getRandomJoke();
    }
}