package CoreJava;

public class Dataatype2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0;
		double b=0;
		double c=a/b;
		//System.out.println(c);
		
		byte num1=45;
		double num2;
		num2=num1;
		
		//System.out.println(num2);
		
		double d=45.5;
		byte e;
		
		e=(byte) d;
		System.out.println(e);
		
		
		byte ab=10;
		byte ac=20;
		int result = ab*ac;
		System.out.println(result);
		

		//int a=5;
		//System.out.println(a);
		//a++;
		//++a;
		//System.out.println(a);
		
		
		int a1=5;
		int b1;
		b1=a1++ + --a1 - a1-- - a1++;
		System.out.println(a1);
		System.out.println(b1);
		
	}

}
