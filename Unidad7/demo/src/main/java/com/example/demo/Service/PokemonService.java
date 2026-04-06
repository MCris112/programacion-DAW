package com.example.demo.Service;

import com.example.demo.GenerationResponse;
import com.example.demo.Model.Pokemon;
import com.example.demo.PokemonResponse;
import com.example.demo.PokemonSpecie;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {

    private final String URL = "https://pokeapi.co/api/v2/pokemon/";
    private final RestTemplate restTemplate = new RestTemplate();
    public Pokemon obtenerPokemon(int id) {
        try {
            // Consumir la API y mapear a DTO
            PokemonResponse response = restTemplate.getForObject(URL + id, PokemonResponse.class);
            if (response == null) {
                throw new RuntimeException("No se recibió respuesta de la API");
            }
            // Crear el modelo Pokemon
            return new Pokemon(response);
        } catch (Exception e) {
            System.err.println("Error al obtener el Pokemon: " + e.getMessage());
            return null;
        }
    }


    public GenerationResponse getPokemonGenerations(int number)
    {
        return restTemplate.getForObject("https://pokeapi.co/api/v2/generation/"+number, GenerationResponse.class);
    }

    public Pokemon getPokemonFromSpecie(PokemonSpecie pokemonSpecie){
        return obtenerPokemon( pokemonSpecie.getPokemonId() );
    }

    public ArrayList<Pokemon> getPokemonsFromGeneration(int number, int page, int perPage)
    {
        GenerationResponse generation = getPokemonGenerations(number);

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        for (int i = ((page * perPage) - perPage); i < perPage; i++) {
            pokemons.add(getPokemonFromSpecie( generation.getPokemonSpecies().get(i) ));
        }

        return pokemons;
    }
}
