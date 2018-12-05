package Module3;

public class Person {
	 private String name;
	 private String surname;
	 private String email;
	 
	Person() {
		this.name="Ivan";
		this.surname="Ivanov";
		this.email="IvanIvanov@email";
	}
	
	public Person(String n, String s, String e){
		this.name = n;
		this.surname =s;
		this.email = e;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		if(name != null) {
			this.name=name;
		}
	}

	public void setSurname(String surname) {
		this.surname=surname;
	}

	public void setEmail(String email) {
		this.email=email;
	}
	public void printPerson() {
		System.out.println(name + " " + " " + surname + " " + " " + email);
	}
}
