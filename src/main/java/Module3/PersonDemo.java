package Module3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PersonDemo {

       private static HashMap hashMap;

       public static void main(String[] args) {
       Person person1 = new Person();
       Person person2 = new Person("Petr", "Petrov","e-mail");
       person1.printPerson();
       person2.printPerson();       
       person1.setName("Petr");
       person1.getName();
       person1.printPerson();
       Passport i1 = new Passport("AA", 123456);
       Passport i2 = new Passport("AB", 987654);
       Map<Passport, Person> identityDB = new HashMap<>();
       identityDB.put(i1, person1);
       identityDB.put(i2, person2);
       Passport passExists = new Passport("AB", 987654);
       Passport passNotExists = new Passport("AH", 111111);
       System.out.println(Objects.toString(identityDB.get(passExists)));
       System.out.println(Objects.toString(identityDB.get(passNotExists)));

    }

}
