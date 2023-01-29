package DefiningClassesExercise.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String, Person> personList = new HashMap<>();
        while (!line.equals("End")) {
            String[] data = line.split(" ");
            String name = data[0];
            String information = data[1];
            if (!personList.containsKey(name)) {
                personList.put(name,new Person());
            }
            switch (information) {
                case "company":
                    String companyName = data[2];
                    String companyDepartment = data[3];
                    double salary = Double.parseDouble(data[4]);
                    Company company = new Company(companyName, companyDepartment, salary);
                    personList.get(name).setCompany(company);
                    break;
                case "car":
                    String model = data[2];
                    int speed = Integer.parseInt(data[3]);
                    Car car = new Car(model, speed);
                    personList.get(name).setCar(car);
                    break;
                case "pokemon":
                    String pokemonName = data[2];
                    String pokemonType = data[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    personList.get(name).getPokemons().add(pokemon);
                    break;
                case "children":
                    String childName = data[2];
                    String childBirthday = data[3];
                    Children child = new Children(childName,childBirthday);
                    personList.get(name).getChildren().add(child);
                    break;
                case "parents":
                    String parentName = data[2];
                    String parentBirthday = data[3];
                    Parents parent = new Parents(parentName,parentBirthday);
                    personList.get(name).getParents().add(parent);
                    break;
            }
            line = scan.nextLine();
        }
        String searchedOne = scan.nextLine();
        System.out.println(searchedOne);
        Person person = personList.get(searchedOne);
        System.out.println(person);
    }
}
