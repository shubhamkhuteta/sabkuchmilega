package bank.system.ui;

import java.util.*;

import bank.system.services.BankService;

public class BankUI {
	public static void main(String[] args) {

		int close = 0;
		Scanner sc = new Scanner(System.in);
		BankUI bankui=new BankUI();
		
		while(close==0){
			bankui.showMenu();
			
			int input=sc.nextInt();
			
			BankService bankService=new BankService();
			
			switch(input) {
			case 1:
				System.out.println("Case 1 : Create Account");
				//bankService.createAccount();
				break;
			case 2:
				System.out.println("Case 2 : Show Balance");
				break;
			case 3:
				System.out.println("Case 3 : Deposit Balance");
				break;
			case 4:
				System.out.println("Case 4 : Withdraw Balance");
				break;
			case 5:
				System.out.println("Case 5 : Fund Transfer");
				break;
			case 6:
				System.out.println("Case 6 : Account Statement");
				break;
			case 7:
				System.out.println("Case 7 : Log Out");
				break;
			default:
				System.out.println("You have been successfully logged out");
				System.out.println("Do you want to exit ? press 0 to continue 1 to exit");
				close=sc.nextInt();
				if(close==0) {
					close=0;
				}else {
					System.exit(0);
				}

			}
		}
		sc.close();
	}

	public void showMenu() {
		System.out.println("1. Create Account ");
		System.out.println("2. Show Balance ");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Fund Transfer");
		System.out.println("6. Account Statement");
		System.out.println("7. Log out");
		System.out.println("Enter your choice :");
	}
}
