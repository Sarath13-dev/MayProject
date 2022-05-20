package com.abstractclass;
//POJO
public class Facebook {
	
	private String username;
	
	private int password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if(username.equals("RamSarath")) {
			this.username="Valid";
		}
		else if(username.equals("Anand")){
			this.username="Valid";
		}
		else {
		this.username = "InValid";
		}
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		if(username.equals("Valid")&& password==123) {
			this.password=1;
		}
		else if(username.equals("Valid")&& password==321) {
			this.password=1;
		}
		else {
		this.password = 0;
		}
	}
	
	public String output(String usernameStatus, int passwordStatus) {
		if(usernameStatus.equals("Valid")&& passwordStatus==1) {
			return "valid Account";
		}
		else if(usernameStatus.equals("Invalid")&& passwordStatus==1) {
			return "InValid Username";
		}
		else if(usernameStatus.equals("Valid") && passwordStatus==0) {
			return "InValid Password";
		}
		else {
			return "Invalid Username and Password";
		}
	}
	
	
	

}
