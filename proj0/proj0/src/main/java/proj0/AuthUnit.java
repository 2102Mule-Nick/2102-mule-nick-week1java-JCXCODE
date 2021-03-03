package proj0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import proj0.interfaces.Auth;
import proj0.interfaces.Menu;

public class AuthUnit implements Auth {

	//We will need a Kryo object.
	Kryo kryo = new Kryo();
	final String FOLDER_NAME = "accts\\";
	final String FILE_EXTENSION = ".dat";
	
	@Override
	public void authenticateUser(String userId, String userName, String passWord){
		
		
		
		
		
		//We will need a FileInputStream.
		//Set it to null initially so Java doesn't shout at me.
		FileInputStream fip = null;
		Input input = null;
		//Instantiate a userAcct that is an object of the UserAcct class.
		UserAcct userAcct = new UserAcct(userId,userName,passWord);
		
		//Formatting note 1: an example file should be called something like 123.John.Password.dat inside the accts folder.
		
		//Formatting note 2: I can find no functional difference between FOLDER_NAME = "accts\\" and FOLDER_NAME = "accts/".
		//So for now don't worry about it.
		
		//A try catch block.
		try {
			//Try to read a .dat file in accts/
			
			fip = new FileInputStream(FOLDER_NAME + userAcct.getUserId() + userAcct.getUserName() + userAcct.getPassWord() + FILE_EXTENSION);
			input = new Input(fip);
			userAcct = kryo.readObject(input, UserAcct.class);
			System.out.print("User authenticated. Welcome " + userAcct.getUserName() + "!");
			//Make a bankMenu to go to
			Menu bankMenu = new BankMenu();
			//go to the bank menu, sending userAcct
			bankMenu.displayWithAcct(userAcct);
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.print("User not found. Make sure your information was correct");
		}
		finally {
			//Another try catch.
			try {
				input.close();
				fip.close();
			} 
			catch (IOException e) {
				//The error to catch
				e.printStackTrace();
			}
		}
		
	}
//Don't touch this. This registers UserAcct object with Kryo so it can read them.
	public AuthUnit() {
		super();
		kryo.register(UserAcct.class);
	}
}


/*
String fileName = FOLDER_NAME + userId + userName + passWord + FILE_EXTENSION;

try(FileInputStream inputStream = new FileInputStream(fileName)){
	Input input = new Input(inputStream);
	UserAcct userAcct = kryo.readObject(input, UserAcct.class);
	input.close();
	bankMenu.displayMainMenu(userAcct);
}
catch (FileNotFoundException e) {
	e.printStackTrace();
	System.out.print("User not found. Make sure your information was correct");
}
*/