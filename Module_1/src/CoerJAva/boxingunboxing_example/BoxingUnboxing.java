package boxingunboxing_example;

public class BoxingUnboxing
{
	public static void main(String[] args) {
		int num=10;//primitive data type
		
		//boxing
		Integer num1=new Integer(num);
		num1.valueOf(num);
		System.out.println("(Boxing) Value of num1 :"+num1);
		
		//autoboxing
		Integer num2=num;
		System.out.println("(AutoBoxing) Value of num2 :"+num2);
		
		//unboxing
		Integer num3=new Integer(20);
		int num4=Integer.valueOf(num3);
		System.out.println("(UnBoxing) Value of num4 :"+num4);
		
		//autounboxing
		int num5=num4;
		System.out.println("(AutoUnBoxing) Value of num5 :"+num5);
	}
}
