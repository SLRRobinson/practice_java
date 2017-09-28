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
	
	public void calling(String namePerson, String colorPerson) {
		name=namePerson ; color=colorPerson;
				}
	
	public void answer() {
		
		calling("red", "grte");
	}

	public String toString() {
		return"";
	}
}
