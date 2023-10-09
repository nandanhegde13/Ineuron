package CoreJava;

class Student1
{
	private int age;
	private  String Name;
	private String city;
	private boolean isMarried;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	
	
}
public class LaunchEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student1 std =  new Student1();
         std.setName("Nandan");
         std.setAge(23);
         System.out.println(std.getName());
	}

}
