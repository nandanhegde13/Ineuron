package CoreJava;

class Loan
{
	void disp()
	{
		System.out.println("Welcome to Ineuron Bank");
		
	}
	
}

class PersonalLoan extends Loan
{
	void disp()
	{
		System.out.println("Personal loan app");
	}
}
public class LaunchLoan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonalLoan pl =  new PersonalLoan();
        pl.disp();
	}

}
