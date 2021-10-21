package com.acheron.training;

class Account{
	protected String accName;
	protected String accNo;
	protected String bankName;
	Account(String accName,String accNo,String bankName){
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}
	protected void display() {
		System.out.println(accName);
		System.out.println(accNo);
		System.out.println(bankName);
	}
}
