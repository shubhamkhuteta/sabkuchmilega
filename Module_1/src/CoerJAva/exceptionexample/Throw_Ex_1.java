package exceptionexample;

class Throw_Ex_0 extends Exception {
	
	private String un="capgemini", pw="capgemin";
	public Throw_Ex_0(String un, String pw)
	{
		this.un=un;
		this.pw=pw;
	}
	
	public String toString() {
		return "Please enter valid username and password";
	}
}


public class Throw_Ex_1 {
	static String username="capgemini";
	static String password="capgemini";
	
	static void validation(String un, String pw) throws Throw_Ex_0 {
		if(un.equals(username) && pw.equals(password))  {
			System.out.println("Welcome");
		}
		else {
			throw new Throw_Ex_0(un,pw);
		}
	}
	public static void main(String[] args) throws Throw_Ex_0 {
	
		Throw_Ex_1.validation("capgemini", "capgemini");
}
	
}
