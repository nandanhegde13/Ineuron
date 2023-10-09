package CoreJava;

//return type has no role to play, Its only method name and parameters
class Calculator3
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	
	
	float add(int a, float b)
	{
		return a+b;
	}

}
public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Calculator3 cal=new Calculator3();
			cal.add(10,20);
	}

}