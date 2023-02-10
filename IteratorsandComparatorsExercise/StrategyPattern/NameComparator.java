package IteratorsandComparatorsExercise.StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int result = Integer.compare(firstPerson.getName().length(), secondPerson.getName().length());
        if(result == 0){
            result = Character.compare(Character.toLowerCase(firstPerson.getName().charAt(0)),Character.toLowerCase(secondPerson.getName().charAt(0)));
        }
        return result;
    }
}
