import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			String firstName;
			String lastName;
			String occupation;
			int age;

			System.out.print("\nWhat is your first name? ");
			firstName = input.nextLine();

			System.out.print("What is your last name? ");
			lastName = input.nextLine();

			System.out.print("What is your occupation? ");
			occupation = input.nextLine();

			System.out.print("How old are you, " + firstName + " " + lastName + "? ");
			age = input.nextByte();

			Person myPerson1 = new Person(firstName, lastName, occupation, age);
			myPerson1.presentInfo();

			Person myPerson2 = new Person();

			myPerson2.setFirstName("Ronaldo");
			myPerson2.setLastName("Ribeiro");
			myPerson2.setOccupation("Student");
			myPerson2.setAge(19);

			myPerson2.presentInfo();

		}

    }

}
