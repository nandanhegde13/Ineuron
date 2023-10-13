package CoreJava;


class Demo12 extends Demo11
{
	 
}

class Demo11
{
	String name="nandan";
	int age = 28;
	void disp()
	{
		System.out.println("Demo1 "+age+name);
	}
}



class Demo13 extends Demo12
{
      	
}


public class LaunchMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo13 d = new Demo13();
        d.disp();      		
	}
}
