package SetsandMapsAdvancedLab;

import java.util.*;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> firstPlayer = new LinkedHashSet<>();
        HashSet<Integer> secondPlayer = new LinkedHashSet<>();
        int[] line = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : line) {
            firstPlayer.add(i);
        }
        line = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : line) {
            secondPlayer.add(i);
        }
        for (int i = 0; i < 50; i++) {
            if(firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                return;
            } else if (secondPlayer.isEmpty()){
                System.out.println("First player win!");
                return;
            }
                int card1 = firstPlayer.iterator().next();
                int card2 = secondPlayer.iterator().next();
                firstPlayer.remove(card1);
                secondPlayer.remove(card2);
                if(card1 > card2){
                    firstPlayer.add(card1);
                    firstPlayer.add(card2);
                } else if (card2 > card1){
                    secondPlayer.add(card1);
                    secondPlayer.add(card2);
                } else {
                    firstPlayer.add(card1);
                    secondPlayer.add(card2);
                }
        }
        if(firstPlayer.size() > secondPlayer.size()){
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }

    }
}