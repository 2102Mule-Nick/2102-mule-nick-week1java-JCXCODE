package proj0;

import proj0.interfaces.Menu;

public class Driver {
	public static void main(String[] args) {
		
		//Instantiate a menu that is an object of the MainMenu class.
		final Menu mainMenu = new MainMenu(); 
		
		//Call the displayMenuItems function of mainMenu.
		mainMenu.displayMenuItems();	
	}
}
