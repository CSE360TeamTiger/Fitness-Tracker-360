
import java.io.*;
import java.util.*;
public class User {
	private boolean authenticated;
	private String email;
	private String firstName;
	private String lastName;
	private String encryptedPassword;
	
	public User(String email, String fName, String lName, String password){
		
		this.email = email;
		this.encryptedPassword = setPassword(password); //add function call to encryption algorthim
		this.firstName = fName;
		this.lastName =lName;
		this.authenticated = false;
	}
	public User(){
		this.email = "";
		this.encryptedPassword = "";
		this.firstName = "";
		this.lastName ="";
		this.authenticated = false;
	}
	
	public String getEmail(){ return email;}
	public String getFirstName(){ return firstName;}
	public String getLastName(){ return lastName;}
	public String getPassword(){ return encryptedPassword;}
	public boolean getAuthenticate(){ return authenticated;}
	
	public void setEmail(String email){ this.email = email;}
	private String setPassword(String password){ return password; /*algorithm for encrytion*/}
	public void setFirstName(String fName){ this.firstName  = fName;}
	public void setLastName(String lName){ this.lastName = lName;}
	public void setAuthenticate(boolean authenticate){ this.authenticated = true;}
}

