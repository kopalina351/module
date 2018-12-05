package PersonTask;


import org.apache.log4j.Logger;

public class Person {
    public static int catCount = 0;
    public static int childCount = 0;
    private String name;
    private String surname;
    private String email;
    public static Logger fileInfo = Logger.getLogger("file");


    public byte getChildren() {
        return children;
    }

    public void setChildren(byte children) {
        if (children==2){
            childCount++;
        }
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        if (pet.toString().equals("Cat")){
            catCount++;
        }
        this.pet = pet;
    }

    private byte children;
    private Pet pet;

    Person() {
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public void finalize(){
        catCount--;
        childCount--;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return this.surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getEmail() {
        return this.email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void showInfo() {
        System.out.println(name + " " + surname + " - " + email);
    }

    public static void info(){
        fileInfo.info("Peoples that have cat: " + Person.catCount);
        fileInfo.info("Peoples that have two children: " + Person.childCount);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
