package proj0;

import java.util.Scanner;
import proj0.interfaces.Auth;
import proj0.interfaces.Menu;

public class LoginMenu implements Menu {

	@Override
	public void displayMenuItems() {
		
		//Instantiate a auth that is an object of the AuthUnit class.
		Auth authUnit = new AuthUnit();
		
		//Make a scanner
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user for userName
		System.out.println("<-LOGIN MENU->");
		System.out.print("Please enter your user ID-->");

		//Create a string for the userName that will be entered by the user.
		String userId = scanner.next();
		
		System.out.print("Please enter your username-->");

		//Create a string for the userName that will be entered by the user.
		String userName = scanner.next();

		//Prompt user for passWord
		System.out.print("Please enter your password-->");

		//Create a string for the passWord that will be entered by the user.
		String passWord = scanner.next();

		//Send userName and passWord to authUnit.
		authUnit.authenticateUser(userId, userName, passWord);
	}

	//Nothing calls this function for LoginMenu, but just in case.
	@Override
	public void backToPreviousMenu() {
		System.out.println("You cannot go back from the Login Menu!");
		displayMenuItems();
	}

	@Override
	public void displayWithAcct(UserAcct userAcct) {
		System.out.println("You cannot be MORE logged in! You are litereally at the Login Menu!");
		displayMenuItems();
	}
}
