package inheritenceexample;

class Father 
{
	int a;
	int b;
}

class Son1 extends Father
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

class Son2 extends Father
{
	public int sub(int a, int b)
	{
		return a-b;
	}
}
public class Hierarchical 
{
	public static void main(String args[])
	{
		Son1 c1=new Son1();
		Son2 c2=new Son2();
		int a=c1.add(10, 12);
		int b=c2.sub(12, 15);
		System.out.println(a);
		System.out.println(b);
	}
}