package proj0;

import java.util.Scanner;

import proj0.interfaces.Menu;
import services.TransactionServices;

public class WithdrawMenu implements Menu {

	@Override
	public void displayMenuItems() {
		System.out.println("<-WITHDRAW MENU->");
		System.out.println("This menu can only be accessed by logging in.");
		backToPreviousMenu();
	}

	@Override
	public void backToPreviousMenu() {
		Menu bankMenu = new BankMenu();
		bankMenu.displayMenuItems();
	}

	@Override
	public void displayWithAcct(UserAcct userAcct) {
		System.out.println("You have made it to the WITHDRAW MENU");
		System.out.print("How much would you like to withdraw?");
		
		// Instantiate a scanner to read console input.
		Scanner scanner = new Scanner(System.in);
		
		//Instantiate a new transactionServices
		TransactionServices transactionServices = new TransactionServices();
		
		// Get user input.
		double total = scanner.nextDouble();

		transactionServices.withdraw(userAcct, total);
	}
}
