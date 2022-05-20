package com.interfacee;


public class BankDetails {

	private String username;
	
	private int accNo;
	
	private String ifscCode;
	
	public void setUsername(String a) {
		if(a.equals("RamSarath")) {
			this.username="Valid";
		}
		else if(a.equals("Anand")) {
			this.username="Valid";
		}
		else {
		this.username="Invalid";
		}
	}
	
	public String getUsername() {
		return username;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int b) {
		if(b==123) {
			this.accNo=1;
		}
		else if(b==456) {
			this.accNo=1;
		}
		else {
		this.accNo = 0;
		}
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String c) {
		if(c.equals("IOB")) {
			this.ifscCode="Valid ifsc";
		}
		else if(c.equals("SBI")) {
			this.ifscCode="Valid ifsc";
		}
		else {
		this.ifscCode = "Invalid ifsc";
		}
	}
	
	
	public String output(String username, int accno, String ifsc) {
		if(username.equals("Valid") && accno==1 && ifsc.equals("Valid ifsc")) {
			return "Valid Account Holder";
		}
		else {
			return "InValid Account Holder";
		}
	}
	
	
	
	
}
