package model;

public class Person {
	private String  name;
	private String color;
	private double age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public Person(String name, String color, double age) {
	
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public String calling(String namePerson, String colorPerson) {
		this.name=namePerson ; this.color=colorPerson;
		return namePerson + colorPerson;
				}
	
	public void answer() {
		
		calling("red", "grte");
	}
	
	public String personCall(Person person) {
		person.getName();
		person.getAge();
		person.getColor();
		return person.color;
	}

 	public String toString() {
 		
		return"";
	}
}
