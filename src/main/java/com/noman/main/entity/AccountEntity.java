package com.noman.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class AccountEntity {
	
	@Id
	@Column(name="accountNumber")
	private int accountNumber;
	
	@Column(name="accountHolderName")
	private String accountHolderName;
	
	@Column(name="accountBalance")
	private int accountBalance;
	
	@Column(name="accountType")
	private String accountType;
	
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name="psCode")
	private String psCode;
	
	public AccountEntity() {
		
	}
	
	public AccountEntity(int accountNumber, String accountHolderName, int accountBalance, String accountType,
			Date dateOfBirth, String psCode) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
		this.dateOfBirth = dateOfBirth;
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
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPsCode() {
		return psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}
	
	
	
	
	
}
