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

    public static class PokemonPage {
        public ArrayList<Pokemon> pokemons;
        public int totalPages;
        public PokemonPage(ArrayList<Pokemon> pokemons, int totalPages) {
            this.pokemons = pokemons;
            this.totalPages = totalPages;
        }
    }

    public PokemonPage getPokemonsFromGeneration(int number, int page, int perPage)
    {
        GenerationResponse generation = getPokemonGenerations(number);

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        int total = generation.getPokemonSpecies().size();
        int startIndex = (page - 1) * perPage;
        int endIndex = Math.min(startIndex + perPage, total);

        for (int i = startIndex; i < endIndex; i++) {
            pokemons.add(getPokemonFromSpecie( generation.getPokemonSpecies().get(i) ));
        }

        int totalPages = (int) Math.ceil((double) total / perPage);
        return new PokemonPage(pokemons, totalPages);
    }
}
