package inheritenceexample;

class ClassOne 
{

	public void show1() 
	{
		System.out.println("Class One : Show1");
	}
}

class ClassTwo extends ClassOne 
{

	public void show2() 
	{
		System.out.println("Class Two : Show2");
	}
}

class ClassThree_1 extends ClassTwo 
{
	public void show3() 
	{
		System.out.println("Class Three_1 : Show3");
	}
}

class ClassThree_2 extends ClassTwo 
{
	public void show4() 
	{
		System.out.println("Class Three_2 : Show4");
	}
}

public class Hybrid 
{
	public static void main(String args[])
	{
		ClassTwo c=new ClassTwo();
		ClassThree_1 ct_1 = new ClassThree_1();
		ClassThree_2 ct_2 = new ClassThree_2();
		
		c.show1();
		c.show2();

		ct_1.show3();
		ct_2.show4();		
	}
}
