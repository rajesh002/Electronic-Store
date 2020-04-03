package businesslogic;

import model.login;

public class checkUser extends login{
	
	public checkUser(String userName,String passWord){
	super(userName,passWord);
	}
	
 
	
	public boolean admin() {
		if(getUserName().equals(userNames.get(0)) && getPassword().equals(passWords.get(0)))
			return true;
		else {
			System.out.println("Enter correct details");
			return false;
	}
	
	}
	
	
	
	
	
	
	
	
}
	




