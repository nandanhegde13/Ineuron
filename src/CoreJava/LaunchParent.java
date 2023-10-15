package CoreJava;

class Parent1
{
	public void cry()
	{
		System.out.println("Parent is crying");
	}
}

class Child1 extends Parent1
{
	public void cry()
	{
		System.out.println("Child1 cries at llow voices");
	}
}

class Child2 extends Parent1
{
	public void cry()
	{
		System.out.println("Child2 cries at high voice");
	}
}
public class LaunchParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child1 c1 = new Child1();
        Parent1 ineuron = new Child1();
        Child2 c2 = new Child2();
        
        c1.cry();
        c2.cry();
        
        
	}

}
