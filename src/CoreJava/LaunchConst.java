package CoreJava;

class Parent
{
	int a,b,c;
	Parent()
	{
		a=10;
		b=20;
		System.out.println("Parent Constructor");
	}
	
	Parent (int a, int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("Parent para const");
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class Child extends Parent
{
	int x,y;
	Child()
	{   this(111,222); 
		x=100;
		y=200;
		
	}
	
	Child(int x, int y)
	{  super(x,y);
	   this.x = x;
	   this.y=y;
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class LaunchConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child ch = new Child();
         ch.disp();
         Child ch1 = new Child(1000,2000);
         ch1.disp();
	}

}
