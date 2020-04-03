package model;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class login {
	private String userName;
	private String passWord;
	protected ArrayList<String> userNames=new  ArrayList<String>();
	protected ArrayList<String> passWords=new ArrayList<String>();
	
	public login(String userName,String passWord) {
		userNames.add("admin");
		passWords.add("admin");
		this.passWord=passWord;
		this.userName=userName;
	}

	public String getUserName() {
   	 return userName;
    }
    
    public String getPassword() {
   	 return passWord;
    }
	
	
}
