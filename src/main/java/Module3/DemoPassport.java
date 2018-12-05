package Module3;

import PersonTask.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoPassport {
    public static void main(String[] args){
        Person firstPerson = new Person("Albert", "Einstein", "everything@relative.com");
        Person secondPerson = new Person("Stephen", "Hawking", "blackHole@universe.com");
        Passport i1 = new Passport("AA", 123456);
        Passport i2 = new Passport("AB", 987654);

        Map<Passport, Person> identityDB = new HashMap<>();
        identityDB.put(i1, firstPerson);
        identityDB.put(i2, secondPerson);

        Passport passExists = new Passport("AB", 987654);
        Passport passNotExists = new Passport("AH", 111111);

        System.out.println(Objects.toString(identityDB.get(passExists)));
        System.out.println(Objects.toString(identityDB.get(passNotExists)));

    }
}
