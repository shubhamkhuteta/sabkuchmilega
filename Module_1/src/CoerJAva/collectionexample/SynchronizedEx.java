package collectionexample;

class One{
	public synchronized void  showMessage(String message) {
		System.out.println("Thread started : "+message);
		try {
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println("Interruption");
		}
		System.out.println("Thread Completed");
	}
}

class Two extends Thread{
	String message;
	One o;
	
	Two(One o, String message){
		this.o=o;
		this.message=message;
		this.start();
	}
	
	public void run() {
		o.showMessage(message);
	}
}
public class SynchronizedEx{
	

	public static void main(String[] args) {
		One o=new One();
		Two t1=new Two(o,"Hello");
		Two t2=new Two(o,"Hi");
		Two t3=new Two(o,"Manakkam");
				
				
	}
}
