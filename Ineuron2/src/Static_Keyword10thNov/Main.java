package Static_Keyword10thNov;

public class Main {

	
	private static String name;
	private static int age;
	
	static {
		System.out.println("Static block");
		name="nandan";
		age=22;
		
	}
	static void disp()
	{   	
		    System.out.println("Static method");
		    System.out.println(name);
	}
	
	int a ,b;
	void disp1()
	{
		System.out.println("non static  method");
	    a=10;b=20;
	    System.out.println(a+b);
	}
	
	
	
	public Main()
	{
		System.out.println("constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Main main = new Main();
       Main.disp();
       main.disp1();
	}

}
