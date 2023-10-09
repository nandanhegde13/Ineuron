package CoreJava;

class Student2
{
	private String Name;
	private String city;
	private int age;
	
	public void setData(String name,String city,int age)
	{
		this.Name = name;
		this.age = age;
		this.city = city;
	}
	
	public Student2(String name,String city,int age)
	{
		this.Name = name;
		this.age = age;
		this.city = city;
	}
}
public class LaunchStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student2 std =  new Student2("Nandan","Sirsi",23);
	}

}
