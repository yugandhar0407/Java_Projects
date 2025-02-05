package atmInterface;

import java.util.Scanner;

class Account {
	private double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Sorry!!! \n Your Account has Insufficient Balance");
		}
	}
}

public class ATMInterface {

	public static void main(String[] args) {

		Account account = new Account(1550000.0);

		Scanner scanner = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {
			System.out.println("Welcome to ATM Interface");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("5. Choose an Option: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Current Balance: " + account.getBalance());
				break;
			case 2:
				System.out.println("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				account.deposite(depositAmount);
				System.out.println("Deposit Successful. Total Balance in Your Account is: " + account.getBalance());
				break;
			case 3:
				System.out.println("Enter Withdrawl Amount: ");
				double withdrawlAmount = scanner.nextDouble();
				account.withdraw(withdrawlAmount);
				System.out.println("Withdrawl Successful. Remaining Balance: " + account.getBalance());
				break;
			case 4:
				System.out.println("Thank You for using our ATM. Visit Again!!!");
				exit = true;
				break;
			default:
				System.out.println("Invalid Option. Please choose again.");

			}
			System.out.println();

		}
		scanner.close();
	}

}
