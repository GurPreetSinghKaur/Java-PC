package gurpreet.junit.exercises;

public class Person {
    public String name;
    public boolean isDentist;
    public String city;

    Person(String name, String city, boolean isDentist) {
        this.name = name;
        this.city = city;
        this.isDentist = isDentist;

    }

    Person(String name, boolean isDentist) {
        this.name = name;
        this.isDentist = isDentist;
    }
}
