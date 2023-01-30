package FunctionalProgrammingLab;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterbyAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Integer> persons = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(", ");
            String name = line[0];
            int age = Integer.parseInt(line[1]);
            persons.put(name,age);
        }
        String condition = scan.nextLine();
        int ageForComp = Integer.parseInt(scan.nextLine());
        String format = scan.nextLine();
        BiPredicate<Integer,Integer> filter;
        if(condition.equals("younger")){
            filter = (personAge,age) -> personAge <= ageForComp;
        }else {
            filter = (personAge,age) -> personAge >= ageForComp;
        }
        Consumer<Map.Entry<String,Integer>> printConsumer;
        if(format.equals("age")){
            printConsumer = person -> System.out.println(person.getValue());
        }else if(format.equals("name")){
            printConsumer = person -> System.out.println(person.getKey());
        }else {
            printConsumer = person -> System.out.println(person.getKey() + " - " + person.getValue());
        }
        persons.entrySet()
                .stream()
                .filter(person -> filter.test(person.getValue(),ageForComp))
                .forEach(printConsumer);
    }
}
