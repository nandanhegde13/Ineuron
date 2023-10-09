package CoreJava;

public class OperatorsAndConditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=4;
//		int b=2;
//		int res=a%b;
//		System.out.println(res);
//        
		
		/*
		 * int a=10; int b=20;
		 * 
		 * System.out.println(a>b); System.out.println(a<b); System.out.println(a==b);
		 */
		/*
		 * int abc=5; abc=10;
		 * 
		 * 
		 * 
		 * int a,b,c,d;
		 * 
		 * a=b=c=d=10+5;
		 * 
		 * System.out.println(a + " "+b + " " +c+" "+d);
		 */
		
		
//		int a=2;
//		a+=20;
//		System.out.println(a);
//		a-=20;
//		System.out.println(a);
//		a*=20;
//		System.out.println(a);
//		a/=20;
//		System.out.println(a);
//		a%=20;
//		System.out.println(a);
//		
		
		/*
		 * int a=8; int b=2;
		 * 
		 * if(a>b) { if(a==10) { System.out.println("Subtraction");
		 * System.out.println(a-b); } else {
		 * System.out.println("A is greater but not equal to 10"); } } else if(a==b) {
		 * System.out.println("Addition"); System.out.println(a+b); } else if(a<b) {
		 * System.out.println("a is lesser"); } else {
		 * 
		 * }
		 */
		
		/*
		 * int a=10; int b=20; int c=5;
		 * 
		 * if(a<b) { if(a<c) { System.out.println("A is the least "+a); }
		 * 
		 * else { System.out.println("C is the least"+c); } } else if(b<c) {
		 * System.out.println("B is least" +b); } else {
		 * System.out.println("C is least"+ c);
		 * 
		 * }
		 */
		
//		int a=10;
//		int b=20;
//		int c=30;
//		
//		if(a<b && a==b)
//		{
//			System.out.println("A is least");
//		}
//		else if(b<c && b==a)
//		{
//			System.out.println("B is least");
//		}
//		else if(c <a && c<b)
//		{
//			System.out.println("else block last block");
//		}
//		else
//		{
//			System.out.println("Last block");
//		}
		
		/*
		 * int a=10; int b=20;
		 * 
		 * 
		 * int c= (a<b)? a: b; System.out.println(c);
		 */
//		
//		int a=100;
//		int b=20;
//		int c=60;
//		
//		int res = (a<b)? (a<c? a:c):(b<c?b:c) ;
//		System.out.println(res);
//	
//		int num1=100;
//		int num2=20;
//		int num3=60;
//		if(num1<num2)
//		{
//			if(num1<num3)
//			{
//				System.out.println(num1);
//			}
//			else
//			{
//				System.out.println(num3);
//			}
//		}
//		else if(num2<num3)
//		{
//			System.out.println(num2);
//		}
//		else
//		{
//			System.out.println(num3);
//		}
//		
int number=100;
		
		switch(number){
		
		case 100: System.out.println("1st case");
		         break;
		case 108: System.out.println("2nd case");
				break;
		case 10: System.out.println("3rd case");
				break;
		 
		default : System.out.println("no cases matching");
		
		}
		
		
	}

}
