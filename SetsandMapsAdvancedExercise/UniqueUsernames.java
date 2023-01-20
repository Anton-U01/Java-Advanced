package SetsandMapsAdvancedExercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        HashSet<String> usernames = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            usernames.add(line);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
