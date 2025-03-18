import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			String fName;
			String lName;
			String occup;
			byte age;

			System.out.print("\nWhat is your first name? ");
			fName = input.nextLine();

			System.out.print("What is your last name? ");
			lName = input.nextLine();

			System.out.println("What is your occupation? ");
			occup = input.nextLine();

			System.out.println("How old are you, " + fName + " " + lName + "?");
			age = input.nextByte();

			Person myPerson = new Person(fName, lName, occup, 001, age);

			myPerson.presentInfo();
		}

    }

}
