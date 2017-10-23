/**
 * 
 */
package model;

/**
 * @author robinson
 *
 */
public class PersonCreator {

	/**
	 * @param args	 */
	public static void main(String[] args) {
		Person person  = new Person("Tame", "Blue", 0);
	
	System.out.println(person.personCall(person));
person.personCall(person).toString();
	}

}
