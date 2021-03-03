package proj0;

import java.util.Scanner;
import proj0.interfaces.Menu;

public class BankMenu implements Menu {

	@Override
	public void displayMenuItems() {
		System.out.println("<-ACCOUNT MENU->");
		System.out.println("This menu can only be accessed by logging in.");
		backToPreviousMenu();
	}

	@Override
	public void backToPreviousMenu() {
		final Menu mainMenu = new MainMenu();
		mainMenu.displayMenuItems();
	}

	@Override
	public void displayWithAcct(UserAcct userAcct) {
		// Instantiate a scanner to read console input.
		Scanner scanner = new Scanner(System.in);

		// Print instructions
		System.out.println("<-ACCOUNT MENU->");
		System.out.println("-->1) Deposit");
		System.out.println("-->2) Withdraw");
		System.out.println("-->3) Back");
		System.out.println("-->4) Quit");
		System.out.print("Please type in the number for\none of the following options-->");

		// Scan user input
		String userInput = scanner.next();

		// Decision logic based on what the user answered.
		switch (userInput) {

		// Case if the user typed "1"
		case "1":
			Menu depositMenu = new DepositMenu();
			depositMenu.displayWithAcct(userAcct);
			break;
		// Case if the user typed "2"
		case "2":
			Menu withdrawMenu = new WithdrawMenu();
			withdrawMenu.displayWithAcct(userAcct);
			break;
		// Case if the user typed "3"
		case "3":
			backToPreviousMenu();
			break;
		// Case if the user typed "4"
		case "4":
			// Print a polite goodbye message.
			System.out.println("Goodbye");

			// Exit the program. No break needed.
			System.exit(0);

			// What happens if the user types LITERALLY anything else.
		default:
			// Print instructions.
			System.out.print("Please enter one of the provided options.");
			System.out.println("--------------------------------------");
			// Send user back to top of menu.
			displayMenuItems();
		}
	}
}