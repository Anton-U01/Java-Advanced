package DefiningClassesExercise.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;

    public Person() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    private Car car;
    private List<Children> children;
    private List<Parents> parents;
    private List<Pokemon> pokemons;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Children> getChildren() {
        return children;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Company:").append("\n");
        if(company != null){
            builder.append(company).append("\n");
        }
        builder.append("Car:\n");
        if(car != null){
            builder.append(car + "\n");
        }
        builder.append("Pokemon:\n");
        for (Pokemon pokemon : pokemons) {
            builder.append(pokemon).append("\n");
        }
        builder.append("Parents:\n");
        for (Parents parent : parents) {
            builder.append(parent).append("\n");
        }
        builder.append("Children:\n");
        for (Children child : children) {
            builder.append(child).append("\n");
        }
        return builder.toString();
    }
}
