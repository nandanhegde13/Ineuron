package CoreJava;

import java.util.Scanner;

class Farmer
{
	private float pa;
	private float td;
	private float si;
	private static float ri;
	
	static {
		ri = 2.5f;
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal amount");
		pa = scan. nextFloat();
		System.out.println("Enter time duration");
		td = scan.nextFloat();
		
		
	}	
	void compute()
	{
	   si=(pa*td*ri)/100;	
	}
	
	void disp()
	{
		System.out.println("SI is"+si);
	}
	

	
}
public class LaunchLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Farmer f1 = new Farmer();
            Farmer f2 = new Farmer();
            
            f1.input();
            f1.compute();
            f1.disp();

            f1.input();
            f1.compute();
            f1.disp();
	}

}
