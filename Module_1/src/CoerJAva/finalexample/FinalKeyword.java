package finalexample;

class FinalTest
{
	final int num=10;
	void method1() {
		//num++;
		System.out.println(num);
	}
}

public class FinalKeyword extends FinalTest
{
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		fk.method1();
		
	}
	
	void method1() {
		System.out.println(num);
	}
}
