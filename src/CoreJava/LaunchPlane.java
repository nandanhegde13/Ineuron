package CoreJava;

class Plane{
	
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	
	public void fly()
	{
		System.out.println("Plane is flying");
		
	}
	
	public void landing()
	{
		System.out.println("Plane is landing");
	}	
}

class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("Cargo plane flys at lower height");
	}
	
	public void carryGoods()
	{
		System.out.println("Cargo Planes carries goods");
	}
}

class PassangerPlane extends Plane
{
	public void fly()
	{
		System.out.println("Flies at medium height");
		
	}
	
	public void carryPassanger()
	{
		System.out.println("Passanger plane carries passanger");
	}
}
public class LaunchPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CargoPlane cp = new CargoPlane();
       PassangerPlane pp = new PassangerPlane();
       
       cp.takeOff();
       cp.carryGoods();
       cp.fly();
       cp.landing();
       
       pp.takeOff();
       pp.carryPassanger();
       pp.fly();
       pp.landing();
	}

}
