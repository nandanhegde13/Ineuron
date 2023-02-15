package GuesserGame;

public class Main {

	public static void main(String[] args) {
	   System.out.println("------Welcome to Guesser Game-------");
	   
	   Umpire umpire  = new Umpire();
	   umpire.display();
	   umpire.setPlayer1();
	   umpire.setPlayer2();
	   umpire.setPlayer3();
	   umpire.claculate_result();

	}

}
