package GuesserGame;

public class Umpire {
    String name="Nandan"; 
    Player player1;
    Player player2;
    Player player3;
    int numberToBeGuessed;
    
    int num1,num2,num3 = 0;
    
    
    public Umpire()
    {
    	this.numberToBeGuessed = (int)(Math.floor(Math.random()*10));
    	System.out.println(numberToBeGuessed);
    }
    public void setPlayer1() {
    	this.player1 = new Player();
    	num1 = player1.enter();
    	
	}
    public void setPlayer2() {
    	this.player2 = new Player();
    	num2=player2.enter();
	}
    public void setPlayer3() {
    	this.player3 = new Player();
    	num3 = player3.enter();
	}
    
    void claculate_result()
    {
    	if ((num1== numberToBeGuessed)&&(num2==numberToBeGuessed)&& (num3 == numberToBeGuessed))
    	{
    		System.out.println("All players won");
    	}
    	
    	 else if((num1== numberToBeGuessed)&&(num2==numberToBeGuessed))
    	{
    		System.out.println("Player1 and Player2 Won");
    	}
    	 else if((num1== numberToBeGuessed)&&(num3==numberToBeGuessed))
     	{
     		System.out.println("Player1 and Player3 Won");
     	}
    	
    	 else if((num2== numberToBeGuessed)&&(num3==numberToBeGuessed))
      	{
      		System.out.println("Player2 and Player3 Won");
      	}
    	 else if((num1== numberToBeGuessed))
       	{
        		System.out.println("Player1 Won");
       	}
    	
    	else if((num2== numberToBeGuessed))
    	{
    	     System.out.println("Player2 Won");	
    	}
    	
    	else if((num3 == numberToBeGuessed))
    	{
    		System.out.println("Player3 Won");
    	}
    	else {
    		System.out.println("No one won");
    	}
    }
    
    
    void display()
     {
    	 System.out.println("Hello I am "+ name +" I will be the umpire for this match");
    	 
     }
    
    
	
}
