package CoreJava;

class Demo1
{
	String name = "Nandan";
	int age =28;
	
void disp()
{
	System.out.println("Demo 1"+age +name);
	
}

}

class Demo2 extends Demo1
{
           	

}

public class LaunchIn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo2 demo = new Demo2();
         demo.disp();
	}
}


