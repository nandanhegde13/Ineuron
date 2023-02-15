package Encapsulation_8thNov;

class Student
{
	private String name;
	private int age;
	private String city;
    void setage(int age)
    {
    	this.age = age;
    }
    void setName(String name)
    
    {
    	this.name = name;
    }
    
 void setCity(String city)
    
    {
    	this.city = city;
    }
    
 
 String getName()
 {
	 return this.name;
 }
 String getCity()
 {
	 return this.city;
 }
 
 int getAge()
 {
	 return this.age;
 }
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student std = new Student();
       std.setage(22);
       std.setName("nandan");
       std.setCity("Sirsi");
       System.out.println("Hi Everyone I am "+std.getName()+ " and I am "+std.getAge()+ 
    		              " year old and I am from "+std.getCity());
	}

}
