package com.noman.main.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

import com.noman.annotations.PSCode;




public class Account {
	
	@Min(value=2, message="Please provide actual accountNumber")
	private int accountNumber;
	
	@NotNull(message="Please provide Account Holder Name")
	@Size(min=2,max=20,message="Please type actual data")
	
	private String accountHolderName;
	
	@NotNull(message="Please provide Account Balance")
	@Min(value=2, message="Please provide actual accountNumber")
	private int accountBalance;
	
	@NotNull(message="Please provide Account Type")
	@Size(min=2,max=20,message="Please type actual data")
	private String accountType;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull(message="Please provide full date of birth")
	@Past( message="Account cant be created for person not born yet ")
	private Date dateOfBirth;
	
	@NotNull(message="Please provide PS code")
	@PSCode
	private String psCode;
	
	public Account() 
	{
		this.accountNumber = 0;
		this.accountHolderName = "Guest";
		this.accountBalance = 0;
		this.accountType = "";
		this.dateOfBirth = new Date();
		this.psCode = "x213";
	}

	public Account(int accountNumber, String accountHolderName, int accountBalance, String accountType,
			Date dateofBirth, String psCode) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.dateOfBirth = dateofBirth;
		this.psCode = psCode;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateofBirth) {
		this.dateOfBirth = dateofBirth;
	}

	public String getPsCode() {
		return psCode;
	}

	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountType=" + accountType + ", dateofBirth=" + dateOfBirth
				+ ", psCode=" + psCode + "]";
	}



	
}