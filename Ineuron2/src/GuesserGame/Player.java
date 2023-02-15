package GuesserGame;

import java.util.Scanner;

public class Player {
	static Scanner  scan = new Scanner(System.in);

	public int enter() {
		// TODO Auto-generated method stub
		System.out.println("Enter a numner");
    	int num = scan.nextInt();  
    	return num;
		
	}

}
