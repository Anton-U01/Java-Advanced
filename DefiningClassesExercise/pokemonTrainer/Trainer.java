package DefiningClassesExercise.pokemonTrainer;

import DefiningClassesExercise.pokemonTrainer.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges = 0;
    private List<Pokemon> pokemonList;

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Trainer(String name){
        this.name = name;
        this.pokemonList = new ArrayList<>();
    }

    public Trainer(String name, int numberOfBadges) {
        this.name = name;
        this.numberOfBadges = numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name + " " + numberOfBadges + " " + pokemonList.size();
    }
}
