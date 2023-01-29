package DefiningClassesExercise.opinionPoll;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String personInfo (){
        return this.name + " - " + this.age;
    }
}
