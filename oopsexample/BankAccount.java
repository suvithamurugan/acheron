package com.acheron.training;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String accName = input.nextLine();
		String accNo = input.next();
		input.nextLine();
		String bankName = input.nextLine();
		String orgName = input.nextLine();
		SavingsAccount savings = new SavingsAccount(accName, accNo, bankName, orgName);
		savings.display();
	}

}


