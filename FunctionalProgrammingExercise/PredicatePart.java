package FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> guests = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String line = scan.nextLine();
        while (!line.equals("Party!")) {
            String[] data = line.split(" ");
            String command = data[0];
            String type = data[1];
            String string = data[2];
            Predicate<String> checkStart = e -> e.startsWith(string);
            Predicate<String> checkEnd = e -> e.endsWith(string);
            Predicate<String> checkSize = e -> e.length() == Integer.parseInt(string);
            List<String> addedGuests = new ArrayList<>();
            switch (command) {
                case "Remove":
                    if (type.equals("StartsWith")) {
                        guests.removeIf(checkStart);
                    } else if (type.equals("EndsWith")) {
                        guests.removeIf(checkEnd);
                    } else {
                        guests.removeIf(checkSize);
                    }
                    break;
                case "Double":
                    if (type.equals("StartsWith")) {
                        for (String guest : guests) {
                            if (checkStart.test(guest)) {
                                addedGuests.add(guest);
                            }
                        }
                    } else if (type.equals("EndsWith")) {
                        for (String guest : guests) {
                            if (checkEnd.test(guest)) {
                                addedGuests.add(guest);
                            }
                        }
                    } else {
                        for (String guest : guests) {
                            if (checkSize.test(guest)) {
                                addedGuests.add(guest);
                            }
                        }
                    }
                    guests.addAll(addedGuests);
                    addedGuests.clear();
                    break;
            }
            line = scan.nextLine();
        }
        if (guests.size() == 0) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.print(String.join(", ", guests));
            System.out.print(" are going to the party!");
        }
    }
}
