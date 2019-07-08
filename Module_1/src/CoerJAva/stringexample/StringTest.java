package stringexample;

public class StringTest {
	public static void main(String[] args) 
	{
		//StringLiteral
		String s="ibm asd";
		String s1="ibm";
		
		System.out.print("String Literal\n");
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		//StringBuffer
		StringBuffer s2 = new StringBuffer("ibm");
		StringBuffer s3 = new StringBuffer("ibm");
	
		System.out.print("String Buffer\n");
		
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
		
		//StringObject
		String s4 = new String("abcdef");
		String s5 = new String("ibm");
		
		System.out.print("String Object\n");
		
		System.out.println(s4.equals(s5));
		System.out.println(s4==s5);
		
		StringBuilder s6 = new StringBuilder("abcde");
		StringBuilder s7 = new StringBuilder("ibm");
		
		System.out.print("String Builder\n");
		
		System.out.println(s6.equals(s7));
		System.out.println(s6==s7);
		
		System.out.println("\nString Functions\n");
		
		System.out.println(s6.capacity());
		
		System.out.println(s6.charAt(0));
		
		System.out.println(s6.length());
		
		System.out.println(s6.deleteCharAt(1));
		
		System.out.println(s6.delete(0, 1));
		
		System.out.println(s6.replace(0, 1, s));
		
		System.out.println(s6.reverse());
		
		System.out.println(s6.getClass());
		
		System.out.println(s6.subSequence(0, 2));
		
		//System.out.print(s6.trimToSize());
		
		//System.out.println(s6.setLength(1));
		
		System.out.println(s.lastIndexOf("m"));
		
		System.out.println(s.lastIndexOf(5));
		
		System.out.println(s.lastIndexOf("c", 0));
		
		System.out.println(s.lastIndexOf(s, 2));
		
		System.out.println(s.contains(s1));
		
		System.out.println(s.compareTo(s1));
		
		System.out.println(s.contentEquals(s1));
		
		System.out.println(s.compareToIgnoreCase(s1));
		
		System.out.println(s.endsWith(s1));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.intern()==s1.intern());
		
		System.out.println(s1.matches(s));
		
		System.out.println(s.replaceAll(s, s4));
		
		System.out.println(s.startsWith(s1));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());
		
	}
	
}
