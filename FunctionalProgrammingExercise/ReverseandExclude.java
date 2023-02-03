package FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseandExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());
        Collections.reverse(numbers);
        Predicate<Integer> filter = e -> e % n != 0;
        numbers.stream().filter(e -> filter.test(e)).forEach(e -> System.out.print(e + " "));
    }
}
