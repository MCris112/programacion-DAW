package com.example.demo;

public class PokemonSpecie {
    private String name;

    private String url;

    public PokemonSpecie() {}

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getPokemonId()
    {
        String[] parts = url.split("/");

        // Grab the last part of the array, which will be the ID ("1")
        String idString = parts[parts.length - 1];

        // Convert the string to an integer
        return Integer.parseInt(idString);
    }

    @Override
    public String toString() {
        return "PokemonSpecie{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
