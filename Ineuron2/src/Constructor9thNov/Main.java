package Constructor9thNov;

class Student{
	private String name;
	private String city;
	private int age;
   

	public  Student(String name, int age, String city)
     {   //this("NandanHegde");
		 
		 this.name=name;
    	 this.age = age;
    	 this.city = city;
     }
	
	public Student(String name){
		this.name = name;
	}
     
     public int getAge()
     {
    	 return this.age;
     }
     public String getName()
     {
    	 return this.name;
     }
     
     public String getCity()
     {
    	 return this.city;
     }
}


class Dog{
	private String name;
	private int cost;
	
	void setName(String Name)
	{
		this.name = Name;
	}
	
	void setCost(int cost)
	{
		this.cost = cost;
	}
	
	String getName()
	{
		return this.name;
	}
	
	int getCost()
	{
		return this.cost;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dog = new Dog();
        dog.setName("Jimmy");
        dog.setCost(10000);
        System.out.println("This is "+dog.getName()+" and this is of"+dog.getCost());
	
	    Student std1 = new Student("Nandan", 22, "Sirsi");
	       
	    System.out.println(std1.getName());
	    System.out.println(std1.getAge());
	    System.out.println(std1.getCity());
	    
	    
	}
	
	
	

}
