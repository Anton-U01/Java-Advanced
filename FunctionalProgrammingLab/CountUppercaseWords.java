package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split(" ");
        List<String> words = Arrays.stream(text)
                .filter(e -> Character.isUpperCase(e.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(words.size());
        for (String word : words) {
            System.out.println(word);
        }
    }
}
