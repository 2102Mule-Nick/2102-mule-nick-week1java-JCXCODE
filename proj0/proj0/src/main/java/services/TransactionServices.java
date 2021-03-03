package services;

import proj0.MainMenu;
import proj0.UserAcct;
import proj0.interfaces.Menu;

public class TransactionServices {
	
	public void withdraw(UserAcct userAcct, double total) {
		//Instantiate a menu that is an object of the MainMenu class.
		final Menu mainMenu = new MainMenu(); 
				
		System.out.print("Your checking balance was" + userAcct.getCheckingBal());
		System.out.print("You withdrew" + total);
		double newBal = userAcct.getCheckingBal() - total;
		userAcct.setCheckingBal(newBal);
		System.out.print("Your checking balance is" + userAcct.getCheckingBal());
		System.out.print("Returning to Main Menu");
		//Call the displayMenuItems function of mainMenu.
		mainMenu.displayMenuItems();
	}
	
	public void deposit(UserAcct userAcct, double total) {
		//Instantiate a menu that is an object of the MainMenu class.
		final Menu mainMenu = new MainMenu();
		
		System.out.print("Your checking balance was" + userAcct.getCheckingBal());
		System.out.print("You deposited" + total);
		double newBal = userAcct.getCheckingBal() + total;
		userAcct.setCheckingBal(newBal);
		System.out.print("Your checking balance is" + userAcct.getCheckingBal());
		System.out.print("Returning to Main Menu");
		//Call the displayMenuItems function of mainMenu.
		mainMenu.displayMenuItems();
	}
	
}
