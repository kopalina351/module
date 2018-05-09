package Module3;
public class PersonDemo {

	public static void main(String[] args) {		
       Person person1 = new Person();
       Person person2 = new Person("Petr", "Petrov","e-mail");
       person1.printPerson();
       person2.printPerson();       
       person1.setName("Sunny");           
       person1.printPerson();
	}

}
