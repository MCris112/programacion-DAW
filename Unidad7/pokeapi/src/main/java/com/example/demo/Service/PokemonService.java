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
import java.util.Random;

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

    public GenerationResponse getPokemonGenerations(int number) {
        return restTemplate.getForObject("https://pokeapi.co/api/v2/generation/" + number, GenerationResponse.class);
    }

    public Pokemon getPokemonFromSpecie(PokemonSpecie pokemonSpecie) {
        return obtenerPokemon(pokemonSpecie.getPokemonId());
    }

    public ArrayList<Pokemon> getRandomPokemonsFromGeneration(int number, int count) {
        // Pedimos a la API todos los Pokémon de la generación
        GenerationResponse generation = getPokemonGenerations(number);
        List<PokemonSpecie> species = generation.getPokemonSpecies();
        ArrayList<Pokemon> selectedPokemons = new ArrayList<>();
        Random random = new Random();

        int total = species.size();
        // Si por lo que sea no hay Pokémon, devolvemos la lista vacía y nos quitamos de
        // líos
        if (total == 0)
            return selectedPokemons;

        // Creamos un array con todas las posiciones
        // Esto es CLAVE para que no nos salgan Pokémon repetidos
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < total; i++)
            indices.add(i);

        int actualCount = Math.min(count, total);
        for (int i = 0; i < actualCount; i++) {
            // Elegimos un número al azar de los que quedan en el array
            int randomIndex = random.nextInt(indices.size());
            // Sacamos de la lista para que no pueda volver a salir para evitar duplicados
            int speciesIndex = indices.remove(randomIndex);

            // Segun el indice/id que toco, obtenemos el pokemon
            Pokemon pokemon = getPokemonFromSpecie(species.get(speciesIndex));
            if (pokemon != null) {
                selectedPokemons.add(pokemon);
            }
        }

        return selectedPokemons;
    }
}
