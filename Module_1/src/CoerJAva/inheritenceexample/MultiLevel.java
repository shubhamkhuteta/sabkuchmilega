package inheritenceexample;

 class InheritenceEx_3
{
	public void method1()
	{
		System.out.println("1 : 1");
	}
	
	public void method2()
	{
		System.out.println("1 : 2");
	}

}

 class InheritenceEx_2 extends InheritenceEx_3
{
	public void method3()
	{
		System.out.println("2 : 1");
	}
	
	public void method4()
	{
		System.out.println("2 : 2");
	}
}
 public class MultiLevel extends InheritenceEx_2
 {
 
 	public static void main(String args[])
 	{
 		MultiLevel i=new MultiLevel();
 		i.method1();
 		i.method2();
 		i.method3();
 		i.method4();
 	}
 }
