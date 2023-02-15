package Method_Overloading_27thOct;
//Method overloading is the process of writing more than one method with same name and different type of parameters or different number of parameters,or same parameters in different order

class Test{
      void add(int a,int b)
      {
    	  System.out.print( a+b);
      }
      
	  void add(int a, int b,int c)
	  {
		  System.out.println(a+b+c);
	  }
	  
	  void add(float a , float b)
	  {
		  System.out.println(a+b);
	  }
	  
	  void add(int a ,float b, int c)
	  {
		  System.out.println(a+b+c);
	  }
	  
	  void add(int a, int b, float c)
	  {
		  System.out.println(a+b+c);
	  }
	  
}

public class Launch2 {
	
	
	public static void main(String[] args)
	{
		System.out.println("Method overloading");
	    Test obj1 = new Test();
	    obj1.add(1, 1);
	    obj1.add(1f, 1f);
	    obj1.add(1, 1,3f);
	
	}

}
