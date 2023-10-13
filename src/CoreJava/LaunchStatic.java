package CoreJava;

class Demo
{
	static int a;
	static int b;
	
static 
{  
	System.out.println("inside Static Block");
	a=10;
	b=20;
}


static void disp()
{   System.out.println("Inside static method");
	System.out.println(a);
	System.out.println(b);
}	
	
    int x;
	int y;
	
	void disp1()
	{
		System.out.println("Inside non-static method");
	}
	
	{
		x=10;
		y=20;
		System.out.println(x);
		System.out.println(y);
	}
	
	public Demo()
	{
		System.out.println("Inside Constructor");
	}
	
}

public class LaunchStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Demo.disp();
		Demo d = new Demo();
               d.disp1();
	}

}
