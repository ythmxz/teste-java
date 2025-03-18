public class Person {

	String firstName;
	String lastName;
	String occupation;
	int id;
	int age;

	public Person(String firstName, String lastName, String occupation, int id, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this. id = id;
		this. age = age;

	}

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

	public String getOccupation() {

		return occupation;

	}

	public void setOccupation(String occupation) {

		this.occupation = occupation;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public void presentInfo() {

		System.out.println("\nHi, my name is " + firstName + " " + lastName + ".");
		System.out.println("My occupation is " + occupation + ".");
		System.out.println("I am " + age + " years old.\n");

	}

}
