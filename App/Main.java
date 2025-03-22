import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

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

		input.close();

		Person myPerson = new Person(firstName, lastName, occupation, age);
		myPerson.presentInfo();

    }

}
