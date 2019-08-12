package exceptionexample;

class ThrowTest2{
	public void div (String a, String b) //throws Exception
	{
		int c = Integer.parseInt(a) / Integer.parseInt(b);
		System.out.println(c);
	}
}
public class ThrowThrows {
	public static void main(String[] args) //throws Exception 
	{
		//ThrowTest o=new ThrowTest();
		
		//o.div("10","0");
	}
}
