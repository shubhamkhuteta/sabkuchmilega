package superfinalexample;

class ParentOne {

	static int a=10;
	
	public ParentOne(int a) 
	{
		System.out.println("Parent class P Constructor");
	// TODO Auto-generated constructor stub
	}
	
	public ParentOne() 
	{
		System.out.println(a);
	// TODO Auto-generated constructor stub
	}
	 
	public void method1() {
		System.out.println("Method of Parent class");
		this.method1();
	}
}

public class SuperThis extends ParentOne{

	static int a=100;
	
	public SuperThis() 
	{
		super();
		System.out.println("Super Constructor"+super.a);
		this.method1();
		
		//super.method1();
	// TODO Auto-generated constructor stub
	}
	
	public SuperThis(int a) 
	{
		//super();
		//this.method1();
		super.method1();
		//System.out.println(a);
	// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		SuperThis co =new SuperThis();
		co.method1();
		ParentOne po = new ParentOne();
	}
	 
	public void method1() {
		System.out.println("Method of Child class");
	}
}