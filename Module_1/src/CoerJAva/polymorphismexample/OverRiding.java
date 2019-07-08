package polymorphismexample;

class ORTest{
	void methodOne()
	{
		System.out.println("Parent class method");
	}
	
	void girlFriend()
	{
		System.out.print("ABC");
	}
}

public class OverRiding extends ORTest{
	
	public static void main(String[] args) {
		OverRiding or=new OverRiding();
		or.methodOne();
		or.girlFriend();
	}
	
	void girlFriend()
	{
		System.out.println("XYZ");
	}
}

