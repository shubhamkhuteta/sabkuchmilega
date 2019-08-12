package exceptionexample;

class ThrowTest extends Exception{
	private int age;
	
	public ThrowTest(int age){
		this.age=age;
	}
	
	public String toString() {
		return "You are not eligible to cast vote."+age;
	}
}
public class ThrowExample {
	public static void main(String[] args) throws ThrowTest{
		ThrowExample.validation(16);
	}
	
	static void validation(int age) throws ThrowTest{
		if(age<18) {
			throw new ThrowTest(age);
		}
		else {
			System.out.println("Let's vote");
		}
	}
}
