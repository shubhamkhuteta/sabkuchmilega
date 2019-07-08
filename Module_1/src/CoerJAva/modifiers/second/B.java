package modifiers.second;
import modifiers.first.*;

class E 
{
	void method2()
		{
			System.out.println("Second PAckage : Class e");
		}
}

public class B extends A{
	public static void main(String[] args) {
		B b = new B();
		b.method1();	
	}
}
