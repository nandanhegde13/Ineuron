package Assignments;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Pattern 1
		  int n=9;
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<n;j++)
				{
					if(i==j && i<n-2 || j==0&& i<n-1 || j==n-2&& i<n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((i==0&&j<n-1&& j>0)|| j==0 && i<n-1 || j==n-2&&i<n-1 || i==n/3&&j<n-2)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if(i==j&& i<n-2 || j==0&&i<n-1 || j==n-2&&i<n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if(i==0&&j<n-1 || i==n-2&& j<n-1 || j==n-2&&i<n-1 || j==n/4 &&i<n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((i==0&&j<n-1&& j>0)|| j==0 && i<n-1 || j==n-2&&i<n-1 || i==n/3&&j<n-2)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if(i==j && i<n-2 || j==0&& i<n-1 || j==n-2&& i<n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((i==0 || i==n-2)&&j<=n-1 || (j==0 || j==n-1)&& i<n-1)
					{
						System.out.print(" ");
					}
					else {
						System.out.print(" ");
					}
				}
				

				for(int j=0;j<n;j++)
				{
					if((i==0 && j<n-1) || (i==n-2 && j<n-1) || (j==n/2&& i<n-1))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				
				for(int j=0;j<n;j++)
				{
					if(i==j && i<n-2 || j==0&& i<n-1 || j==n-2&& i<n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((j==0&&i<n-1) || (i==n-2&& j<n-1) || (i==0&& j<n-1) || (i==(n-2)/2&& j<n-1))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((j==0 || j==n-2)&&i<n-1 ||  (i==n-2 &&j<n-1))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((j==0&&i<n-1)  || (i==0&& j<n-1) || (i==(n-2)/2&& j<n-1) || (j==n-2 &&i<n/2) || (i-j+1==(n-1)/2)&& i<n-1 )
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for(int j=0;j<n;j++)
				{
					if((j==0 || j==n-2)&&i<n-1 ||  (i==n-2 &&j<n-1) || (i==0 &&j<n-1))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				
				
				for(int j=0;j<n;j++)
				{
					if(i==j && i<n-2 || j==0&& i<n-1 || j==n-2&& i<n-1)
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			//Pattern 2
		int n2=4;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
                 System.out.print(i+ " ");				
			}
			System.out.println(" ");
		}
		
		System.out.println();
		System.out.println();
		
		//Pattern 3
		int n3=15;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(i==0||i==n-1|| j==0||j==n-1 || i+j<n/2 || j-i>=n/2  ) {
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
        
        
        //Pattern 4
        int n4=16;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==n-1 || i==n-2 || (i-j>=n/2) || ( i+j>=n-1+(n-1)/2 ))
				{
				  System.out.print("*");	
				}
				else {
				  System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//Pattern5

	      int n5=14;
			for(int i=0;i<n;i++) {
	    	  for(int j=0;j<n;j++) {
	    		 if( (i==0) || (i==n-1) || (i-j >= n/2   ) || (i+j<=n/2)) {
	    			 System.out.print("*");
	    		 }
	    		 else {
	    			 System.out.print(" ");
	    		 }
	    	  }
	    	  System.out.println();
	      }
		
	}
}
