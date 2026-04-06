package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GenerationResponse {

    private int id;


    @JsonProperty("pokemon_species")
    private List<PokemonSpecie> pokemonSpecies;

    public GenerationResponse() {
    }

    public int getId() {
        return id;
    }

    public List<PokemonSpecie> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
