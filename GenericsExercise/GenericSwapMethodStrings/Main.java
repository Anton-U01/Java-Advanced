package GenericsExercise.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int line = Integer.parseInt(scan.nextLine());
            integers.add(line);
        }
        int[] indexes = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstIndex = indexes[0];
        int secondIndex = indexes[1];
        integers = swapStrings(integers,firstIndex,secondIndex);
        for (Integer integer : integers) {
            System.out.println(integer.getClass().getName() + ": " + integer);
        }
    }

    private static <T>List<T> swapStrings(List<T> integers, int firstIndex, int secondIndex) {
        T tempFirst = integers.get(firstIndex);
        T tempSecond = integers.get(secondIndex);
        integers.set(firstIndex,tempSecond);
        integers.set(secondIndex,tempFirst);
        return integers;
    }
}
