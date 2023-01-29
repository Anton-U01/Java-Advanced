package DefiningClassesExercise.pokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        while (!line.equals("Tournament")) {
            String[] data = line.split(" ");
            String trainerName = data[0];
            String pokemonName = data[1];
            String type = data[2];
            int health = Integer.parseInt(data[3]);
            Pokemon pokemon = new Pokemon(pokemonName, type, health);
            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName));
            }
            trainers.get(trainerName).getPokemonList().add(pokemon);
            line = scan.nextLine();
        }
        String type = scan.nextLine();
        while (!type.equals("End")) {
            for (Trainer trainer : trainers.values()) {
                List<Pokemon> pokemonsToRemove = new ArrayList<>();
                boolean isThere = false;
                for (Pokemon pokemon : trainer.getPokemonList()) {
                    if (pokemon.getElement().equals(type)) {
                        isThere = true;
                        break;
                    }
                }
                if (isThere) {
                    trainer.setNumberOfBadges(trainer.getNumberOfBadges() + 1);
                } else {
                    for (Pokemon pokemon : trainer.getPokemonList()) {
                        pokemon.setHealth(pokemon.getHealth() - 10);
                        if (pokemon.getHealth() <= 0) {
                            pokemonsToRemove.add(pokemon);
                            break;
                        }
                    }
                }
                for (Pokemon pokemon : pokemonsToRemove) {
                    trainer.getPokemonList().remove(pokemon);
                }
            }
            type = scan.nextLine();
        }
        trainers.entrySet().stream().sorted((t1,t2) -> Integer.compare(t2.getValue().getNumberOfBadges(),t1.getValue().getNumberOfBadges()))
                .forEach(entry -> System.out.println(entry.getValue().toString()));
    }
}

