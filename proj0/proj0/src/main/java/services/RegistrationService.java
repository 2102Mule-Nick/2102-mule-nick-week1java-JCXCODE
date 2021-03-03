package services;

import proj0.UserAcct;
import proj0.UserDaoImpl;
import proj0.interfaces.UserDao;

public class RegistrationService {

	public void registerNewUser(String userId, String userName, String passWord) {
		
		//Instantiate a userDaoImpl that is an object of the UserDaoImpl class.
		UserDao userDoaImpl = new UserDaoImpl();
			
		//Create a new userAct object by calling its args constructor.
		UserAcct userAcct = new UserAcct(userId, userName, passWord);
			
		//Call the write function to write the new user to a file.
		userDoaImpl.makeNewUser(userAcct);
	}
}