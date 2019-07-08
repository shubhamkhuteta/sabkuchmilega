package interfaceexample;

interface A
{
	void method1();
}

abstract class B
{
	abstract void method2();
}

public class InterfaceExample extends B implements A {
	
	public static void main(String[] args) {
		InterfaceExample i=new InterfaceExample();
		i.method1();
		i.method2();
	}
	

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
		
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}




}
