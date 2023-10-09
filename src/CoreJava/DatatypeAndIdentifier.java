package CoreJava;

class Car{
	int noOfWheels;
	
	public void move()
	{
       System.out.println("Car is moving");
	}
	public void accelerate()
	{
       System.out.println("Accelerated");
	}
}

class Student
{
	//HAS-part (variables)
	String name;
	int id;
	float height;
	//DOES-part(methods)
	public void study(){
	//logic of studying
}
	public void play()
	{
		//logic of playing
	}

}
public class DatatypeAndIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Number data
//		------------------
//		To store whole numbers we have 4 datatypes
//
//		a. byte
//		b. short
//		c. int
//		d. long
		
		System.out.println("Size of byte is :: "+Byte.SIZE);
		System.out.println("MINVALUE of byte is :: "+Byte.MIN_VALUE);
		System.out.println("MAXVALUE of byte is :: "+Byte.MAX_VALUE);
		// size -> 8 bits
		// minvalue -> -128
		// maxvalue -> 127
		
		//short
		System.out.println("Size of short is :: "+Short.SIZE);
		System.out.println("MINVALUE of short is :: "+Short.MIN_VALUE);
		System.out.println("MAXVALUE of short is :: "+Short.MAX_VALUE);
		//size : 16bits(2 byte)
		//minvalue: -32768
		//maxvalue: +32767
		
		//int
		System.out.println("Size of int is :: "+Integer.SIZE);
		System.out.println("MINVALUE of int is :: "+Integer.MIN_VALUE);
		System.out.println("MAXVALUE of intt is :: "+Integer.MAX_VALUE);
//		size: 32bits(4 bytes)
//		minvalue:-2147483648
//		maxvalue: 2147483647
		
		//long
		System.out.println("Size of long is :: "+Long.SIZE);
		System.out.println("MINVALUE of long is :: "+Long.MIN_VALUE);
		System.out.println("MAXVALUE of long is :: "+Long.MAX_VALUE);

//		size: 64bits(8bytes)
//		minvalue:-9223372036854775808
//		maxvalue:9223372036854775807
		
	}

}
