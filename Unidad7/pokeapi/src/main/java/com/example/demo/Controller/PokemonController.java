package com.example.demo.Controller;

import com.example.demo.Model.Pokemon;
import com.example.demo.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping({"/"})
    public String index(Model model) {
        Random r = new Random();

        ArrayList<Pokemon> pokemons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int id = r.nextInt(150) + 1;
            Pokemon pokemon = service.obtenerPokemon( id );

            if (pokemon == null) {
                model.addAttribute("error", "No se pudo obtener el Pokémon");
                return "error"; // plantilla error.html
            }

            pokemons.add(pokemon);
        }

        model.addAttribute("pokemons", pokemons);

        return "index";
    }

    @GetMapping({"/pokemons/{id}"})
    public String mostrarPokemon(@PathVariable Integer id, Model model) {
        // Si no se pasa id, usaré un Pokemon aleatorio
        Pokemon pokemon = service.obtenerPokemon(id);
        if (pokemon == null) {
            model.addAttribute("error", "No se pudo obtener el Pokémon");
            return "error";
        }
        pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        model.addAttribute("pokemon", pokemon);
        model.addAttribute("id", id);

        return "pokemon";
    }
    @GetMapping({"/pokemons/generations/{id}"})
    public String mostrarPokemons(@PathVariable Integer id, 
                                  @RequestParam(value = "page", defaultValue = "1") int page,
                                  Model model) {

        if ( id == 3 )
            return "error"; // Only for debugging

        PokemonService.PokemonPage pagedResult = service.getPokemonsFromGeneration(id, page, 15);

        model.addAttribute("pokemons", pagedResult.pokemons);
        model.addAttribute("generation", id);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", pagedResult.totalPages);

        return "generation"; // plantilla pokemon.html
    }

    private Pokemon obtenerPokemon(Integer id) {
        Pokemon pokemon = service.obtenerPokemon(id);
        if (pokemon == null) {
            return null;
        }
        pokemon.setImagen("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png");
        return pokemon;
    }
}
