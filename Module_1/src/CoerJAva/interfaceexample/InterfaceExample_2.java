package interfaceexample;

interface One
{
	void method1();
}

abstract class Last
{
	 public void method1()
	 {
		System.out.println("Abstract Method");
	 }
}

public class InterfaceExample_2 extends Last implements One
{

		public static void main(String[] args) 
		{
			InterfaceExample i=new InterfaceExample();
			i.method1();
			//i.method2();
		}
}
