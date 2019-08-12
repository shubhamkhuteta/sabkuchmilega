package modifiers.first;

class D {
	
	 protected void method1() {
		System.out.println("Method 1 : Package 1");
	}
}


public class A extends D
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.method1();
	}
}