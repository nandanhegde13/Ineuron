class Calc{
	int a,b,c;
	void add()
	{
		a=10;
		b=20;
		c= a+b;
		System.out.println(c);
	}
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	int res(int a,int b)
	{
		return a+b;
	}
}


/**
 * @author NANDAN HEGDE
 *
 */
/**
 * @author NANDAN HEGDE
 *
 */
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Namaste");
		Calc cal1 = new Calc();
		cal1.add();
        cal1.sum(15,30);
        System.out.println("Res "+cal1.res(1, 1));
	}
	
}
