package multithreadexample;

import javax.swing.plaf.synth.SynthStyle;

class MTTest_1 extends Thread 
{

	public void run() 
	{
		
		try {	
	       for (int i = 0; i <= 10; i++) 
	           	{
	      		System.out.println(i);
	    		sleep(0);
	           	}
	        } catch (Exception e){}
	}	
			   
}


public class UsingThread {

	public static void main(String[] args) throws InterruptedException {
		MTTest_1 mt = new MTTest_1();
		Thread t = new Thread(mt);
		t.setName("MainMethod");
		System.out.println(t.getName());
		//System.out.println(t.currentThread().MAX_PRIORITY);
		System.out.println(t);
		t.start();
		//t.join();
		 for (int i = 10; i <= 20; i++) 
        	{
   		System.out.println(i);
        	}
		//t.yield();
		//t.sleep(13000);
	}

}