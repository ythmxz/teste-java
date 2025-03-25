public class Person {

	private String firstName;
	private String lastName;
	private String occupation;
	private int age;

	public Person() {

		this.firstName = null;
		this.lastName = null;
		this.occupation = null;
		this.age = 0;

	}

	public Person(String firstName, String lastName, String occupation, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this. age = age;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String newFirstName) {

		this.firstName = newFirstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String newLastName) {

		this.lastName = newLastName;

	}

	public String getOccupation() {

		return occupation;

	}

	public void setOccupation(String newOccupation) {

		this.occupation = newOccupation;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int newAge) {

		this.age = newAge;

	}

	public void presentInfo() {

		System.out.println("\nHi, my name is " + firstName + " " + lastName + ".");
		System.out.println("My occupation is " + occupation + ".");
		System.out.println("I am " + age + " years old.\n");

	}

}
