package collectionexample;

class Account1{
	int balance;
	
	public void Account1(int balance){
		balance=5000;
	}
	
	public void withdraw(int bal) {
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("Nothing");
		}
		balance+=bal;
		System.out.println("Amount Deposited  : "+bal);
		System.out.println("Updated Balance : "+balance);
	}
	
	public void inquiry() {
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("Nothing");
		}
		System.out.println("Updated Balance : "+balance);
	}
	
}

class Transaction implements Runnable{
	Account1 obj;
	Transaction (Account1 a) {obj=a;}
	
	public void run() {
		obj.withdraw(5000);
		obj.inquiry();
		
	}
	
}
public class BankApplication {
	public static void main(String[] args) throws InterruptedException {
		Account1 a=new Account1();
		Transaction ts=new Transaction(a);
		Thread t1=new Thread(ts);
		Thread t2=new Thread(ts);
		t1.start();
		t1.join();
		t2.start();
	}
}
