package polymorphismexample;

 class Test {

	static void add()
	{
		System.out.println("Default Method");
	}
	
	static void add(int a, int b)
	{
		System.out.println("Same Perameter Method (int) "+(a+b));
	}
	
	static void add(float a, float b)
	{
		System.out.println("Same Perameter Method (int) "+(a+b));
	}
	
	static void add(int a, float b)
	{
		System.out.println("Diffrent Perameter Method (int and float) "+(a+b));
	}
	
	static void add(float a, int b)
	{
		System.out.println("Diffrent Perameter Method (float and int) "+(a+b));
	}
}

public class OverLoading
{
	public static void main(String[] args) {
		Test.add();
		Test.add('a', 'b');
		Test.add(12.12f, 18.10f);
		Test.add(10, 10.12f);
		Test.add(12.10f, 12);
	}
}
