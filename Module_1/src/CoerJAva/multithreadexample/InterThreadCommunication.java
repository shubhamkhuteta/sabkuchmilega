package multithreadexample;

class Number
{
	public int n;
	boolean value=false;
	
	synchronized void even(int i) 
	{
		if(!value) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}}
			this.n=i;
			System.out.println(n);
			value=false;
			notify();
		
	}
	
	synchronized void odd(int i) {
		if(value) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}}
			this.n=i;
			System.out.println(n);
			value=true;
			notify();
	
}
}

class Odd implements Runnable{
Number num;
	
	Odd(Number number){
		this.num=number;
		new Thread(this,"Even").start();
	}
	
	public void run() {
		for(int i=1;i<=100;i+=2) {
			num.odd(i);
		}
		
	}
}

class Even implements Runnable{
	Number num;
	
	Even(Number number){
		this.num=number;
		new Thread(this,"Even").start();
	}
	
	public void run() {
		for(int i=2;i<=100;i=i+=2) {
			num.even(i);
		}
		
	}
	
}


public class InterThreadCommunication {
	public static void main(String[] args) {
		Number number=new Number();
		Even e=new Even(number);
		Odd o=new Odd(number);
	}
}
