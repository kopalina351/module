package Module3;

public class Person {
	 private String name;
	 private String surename;
	 private String email;
	 
	Person() {
		this.name="Ivan";
		this.surename="Ivanov";
		this.email="IvanIvanov@email";
	}
	
	public Person(String n, String s, String e){
		this.name = n;
		this.surename =s;
		this.email = e;
	   
	}
	

	public void printPerson() {	
	
		System.out.println(this.name + " " + " " + this.surename + " " + " " + this.email);
		
	}		
	
	public String getName() {
		return name;
	}
	
	public String getSurename() {
		return surename;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		if(name != null) {
			this.name=name;
		}
	}
	
	public void setSurename(String surename) {
		this.surename=surename;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
}
