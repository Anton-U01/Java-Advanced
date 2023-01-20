package SetsandMapsAdvancedExercise;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> collection = new LinkedHashMap<>();
        Map<String, HashSet<String>> cardsCollection = new LinkedHashMap<>();
        String line = scan.nextLine();
        while (!line.equals("JOKER")) {
            String[] data = line.split(": ");
            String name = data[0];
            List<String> cards = Arrays.stream(data[1].split(", ")).collect(Collectors.toList());
            HashSet<String> cardsAsSet = new HashSet<>();
            for (String card : cards) {
                cardsAsSet.add(card);
            }
            if (cardsCollection.containsKey(name)) {
                cardsAsSet.addAll(cardsCollection.get(name));
                cardsCollection.put(name,cardsAsSet);
            } else {
                cardsCollection.put(name,cardsAsSet);
            }
            line = scan.nextLine();
        }
        for (Map.Entry<String, HashSet<String>> entry : cardsCollection.entrySet()) {
            List<String> cards = new ArrayList<>(entry.getValue());
            int sum = 0;
            for (int i = 0; i < cards.size(); i++) {
                sum += sumOfCard(cards.get(i));
            }
            collection.put(entry.getKey(),sum);
        }
        for (Map.Entry<String, Integer> entry : collection.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static int sumOfCard(String cards) {
        int sum = 0;
        if (cards.length() != 2) {
            char type = cards.charAt(cards.length() - 1);
            switch (type) {
                case 'S':
                    sum += 10 * 4;
                    break;
                case 'H':
                    sum += 10 * 3;
                    break;
                case 'D':
                    sum += 10 * 2;
                    break;
                case 'C':
                    sum += 10;
                    break;
            }
        } else {
            int power = 0;
            if (Character.isDigit(cards.charAt(0))) {
                power = Character.getNumericValue(cards.charAt(0));
            } else {
                switch (cards.charAt(0)) {
                    case 'J':
                        power = 11;
                        break;
                    case 'Q':
                        power = 12;
                        break;
                    case 'K':
                        power = 13;
                        break;
                    case 'A':
                        power = 14;
                        break;
                }
            }
            char type = cards.charAt(cards.length() - 1);
            switch (type) {
                case 'S':
                    sum += power * 4;
                    break;
                case 'H':
                    sum += power * 3;
                    break;
                case 'D':
                    sum += power * 2;
                    break;
                case 'C':
                    sum += power;
                    break;
            }
        }
        return sum;
    }

}
