package PersonTask;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonLoggingDemo {
    public static Logger cons = Logger.getLogger("cons");
    public static Logger admin = Logger.getLogger("admin");

    public static void main(String[] args) throws IOException{
        cons.setLevel(Level.TRACE);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            createPerson();
            cons.trace("Continue Y/N/INFO ?");
            String answer = reader.readLine();
            answer = answer.toUpperCase();
            if(answer.equalsIgnoreCase("N")){
                break;
            }else if(answer.equalsIgnoreCase("INFO")){
                Person.info();
            }else {
                continue;
            }
        } while (true);
    }

    private static Person createPerson() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        cons.trace("Name:");
        String name = reader.readLine();
        cons.trace("Surname:");
        String surname = reader.readLine();
        cons.trace("Email:");
        String email = reader.readLine();
        cons.trace("Pet:");
        String pet = reader.readLine();
        Pet petEnum = null;
        cons.assertLog(Pet.contains(pet), "That's not a pet");
        cons.trace("Number of children:");
        byte children = Byte.parseByte(reader.readLine());
        if (children<0) {
            cons.warn("Number of children should be positive or zero");
            children = 0;
        }
        if (petEnum!=null) {
            Person person = new Person(name,surname,email);
            person.setChildren(children);
            person.setPet(petEnum);
            admin.info("Person with pet was created.");
            return person;
        } else {
            Person person = new Person(name,surname,email);
            person.setChildren(children);
            admin.info("Person was created.");
            return person;
        }
    }
}
