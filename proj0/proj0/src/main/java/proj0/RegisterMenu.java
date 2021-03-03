package proj0;

import java.util.Scanner;
import proj0.interfaces.Menu;
import services.RegistrationService;

public class RegisterMenu implements Menu {

	@Override
	public void displayMenuItems() {
		
		//Instantiate a registrationService that is an object of the RegistrationService class.
		RegistrationService registrationService = new RegistrationService();
		
		//Instantiate a scanner to read console input.
		Scanner scanner = new Scanner(System.in);
		
		//Print out menu title and prompt.
		System.out.println("<-REGISTRATION MENU->");
		
		//Prompt user for userID
		System.out.print("\nPlease enter a 3 digit id.-->");
				
		//Create a string for the passWord that will be entered by the user.
		String userId = scanner.next();
		
		System.out.print("Please enter your username-->");

		//Create a string for the userName that will be entered by the user.
		String userName = scanner.next();

		//Prompt user for passWord
		System.out.print("\nPlease enter your password-->");

		//Create a string for the passWord that will be entered by the user.
		String passWord = scanner.next();
		
		//Time to register a new user.
		registrationService.registerNewUser(userId, userName, passWord);
	}

	//Nothing calls this function for RegisterMenu, but just in case.
	@Override
	public void backToPreviousMenu() {
		System.out.println("You cannot go back from the Registration Menu!");
		displayMenuItems();
	}

	//Nothing calls this function for RegisterMenu, but just in case.
	@Override
	public void displayWithAcct(UserAcct userAcct) {
		System.out.println("You cannot pass anything to the Registration Menu!");
		displayMenuItems();
	}
}