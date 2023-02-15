//Scanner is a inbuilt class in java which provides methods to take input from users
package Array_28th_Oct;

import java.util.Scanner;

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------Arrays------");
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
//        int a  = scanner.nextInt();
//        System.out.println(a);
        
        int[] a = new int[3];
        a[1] = scanner.nextInt();
        System.out.println(a[1]);
	}

}
