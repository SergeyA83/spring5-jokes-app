package com.example.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokeService{
    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke(){
        return quotes.getRandomQuote();
    }
}
