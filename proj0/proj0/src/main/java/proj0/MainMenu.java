package proj0;

import java.util.Scanner;
import proj0.interfaces.Menu;

public final class MainMenu implements Menu {

	@Override
	public void displayMenuItems() {
		
		//Instantiate a scanner to read console input.
		Scanner scanner = new Scanner(System.in);
		
		//Instantiate a menu that is an object of the RegisterMenu class.
		final Menu registerMenu = new RegisterMenu();
		
		//Instantiate a menu that is an object of the LoginMenu class.
		final Menu loginMenu = new LoginMenu();

		//Print out menu title, options, and prompt.
		System.out.println("<-MAIN MENU->");
		System.out.println("-->1) Login");
		System.out.println("-->2) Register");
		System.out.println("-->3) Quit\n");
		System.out.print("Please type in the number for\none of the following options-->");
		
		//Declare a String variable to hold the user input.		
		String userInput = scanner.next();

		//Switch to handle user decision.
		switch(userInput) {
		case "1":
			loginMenu.displayMenuItems();
			break;
		case "2":
			registerMenu.displayMenuItems();
			break;
		case "3":
			//Print a polite goodbye message.
			System.out.println("Goodbye");
			//Exit the program. No break needed.
			System.exit(0);
		default:
			//In case the user didn't read the prompt, or mistyped.
			System.out.println("Please type in 1, 2, or 3 for the corresponding option.");
		}
	}

	//Nothing calls this function for MainMenu, but just in case.
	@Override
	public void backToPreviousMenu() {
		System.out.println("You are at the topmost menu!");
		displayMenuItems();
	}

	//Nothing calls this function for MainMenu, but just in case.
	@Override
	public void displayWithAcct(UserAcct userAcct) {
		System.out.println("You cannot be logged in before goind through the login menu!");
		displayMenuItems();
	}
}	