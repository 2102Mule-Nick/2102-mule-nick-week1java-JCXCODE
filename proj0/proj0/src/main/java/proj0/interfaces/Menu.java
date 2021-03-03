package proj0.interfaces;

import proj0.UserAcct;

public interface Menu {
	
	//Displays items before a user has logged in.
	public void displayMenuItems();
	
	//Displays items after a user has logged in, taking in their account.
	public void displayWithAcct(UserAcct userAcct);
	
	//Goes back to the previous menu where applicable.
	//There are currently no options for going back while logged in.
	public void backToPreviousMenu();
}
