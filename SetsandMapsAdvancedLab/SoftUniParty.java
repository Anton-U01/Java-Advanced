package SetsandMapsAdvancedLab;

import java.util.HashSet;
import java.util.Scanner;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> regularGuests = new HashSet<>();
        HashSet<String> VIPGuests = new HashSet<>();
        String line = scan.nextLine();
        while (!line.equals("PARTY")) {
            if (Character.isDigit(line.charAt(0))) {
                VIPGuests.add(line);
            } else {
                regularGuests.add(line);
            }
            line = scan.nextLine();
        }
        line = scan.nextLine();
        while (!line.equals("END")){
            if (Character.isDigit(line.charAt(0))){
                VIPGuests.remove(line);
            } else {
                regularGuests.remove(line);
            }
            line = scan.nextLine();
        }
        System.out.println(VIPGuests.size() + regularGuests.size());
        for (String vipGuest : VIPGuests) {
            System.out.println(vipGuest);
        }
        for (String regularGuest : regularGuests) {
            System.out.println(regularGuest);
        }
    }
}
