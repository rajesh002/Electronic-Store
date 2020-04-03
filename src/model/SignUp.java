package model;

public class SignUp {
     private String userName;
     private String passWord;
     private String confirmPassword;
     private String phoneNumber;
     public SignUp(String userName,String passWord,String confirmPassword){
    	 this.userName=userName;
    	 this.passWord=passWord;
    	 this.confirmPassword=confirmPassword;
     }
     
     public String getUserName() {
    	 return userName;
     }
     
     public String getPassword() {
    	 return passWord;
     }
     
     public String getConfirmPassword() {
    	 return confirmPassword;
     }
     
}
