package com.example.rickmorty;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainControler {

    private com.example.rickmorty.MainActivity activity;

    private RickMorty RickMorty;

    public MainControler(com.example.rickmorty.MainActivity mainActivity) {
        this.activity = mainActivity;
    }
    public void onStart(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://rickandmortyapi.com/graphql/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
