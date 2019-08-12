package inheritenceexample;

 class One {
	 
	 public void method1()
	 {
		 System.out.println("Class one : Method one");
	 }

}

 public class Single extends One {

	 public static void main(String args[])
	 {
		 InheritenceEx_2 t=new InheritenceEx_2();
		 t.method1();
		 
	 }
}