package com.example;

import java.util.Random;

public class TellJokes {

    private String[] jokes;
    private Random random;

    public TellJokes() {
        jokes = new String[5];
        jokes[0] = "Why do men find it difficult to make eye contact? Breasts don’t have eyes.";
        jokes[1] = "A bank is a place that will lend you money, if you can prove that you don’t need it.";
        jokes[2] = "I say no to alcohol, it just doesn’t listen.";
        jokes[3] = "Why is the man who invests all your money called a broker?";
        jokes[4] = "Why did the scientist install a knocker on his door? He wanted to win the No-bell prize!";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
