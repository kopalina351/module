package PersonTask;

public class PersonExercise {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Albert");
        firstPerson.setSurname("Einstein");
        firstPerson.setEmail("everything@relative.com");

        Person secondPerson = new Person("Stephen", "Hawking", "blackHole@universe.com");

        firstPerson.showInfo();
        secondPerson.showInfo();
    }
}