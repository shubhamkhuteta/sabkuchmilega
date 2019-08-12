package multithreadexample;



class MTTest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			System.out.println(i);
			
		}
	}
	
}
public class MultiThreadingEx  {
	
	public static void main(String[] args) {
		MTTest mt=new MTTest();
		Thread t=new Thread(mt);
		t.start();
	}
	
}