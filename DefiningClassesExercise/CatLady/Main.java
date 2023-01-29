package DefiningClassesExercise.CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String,Cat> catMap = new HashMap<>();
        while (!line.equals("End")){
            String[] data = line.split(" ");
            String breed = data[0];
            String name = data[1];
            double parameter = Double.parseDouble(data[2]);
            Cat cat = null;
            switch (breed){
                case "Siamese":
                    cat = new Siamese(name,parameter);
                    break;
                case "Cymric":
                    cat = new Cymric(name,parameter);
                    break;
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(name,parameter);
                    break;
            }
            catMap.put(name,cat);
            line = scan.nextLine();
        }
        String searchedCat = scan.nextLine();
        System.out.println(catMap.get(searchedCat));
    }
}
