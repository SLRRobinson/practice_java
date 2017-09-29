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
	 * @param args
	 */
	public static void main(String[] args) {

		Person person  = new Person("David", "Robinson", 0);
	System.out.println(person.getColor());
	System.out.println(person.calling("Aaron","Angela"));

	}

}
