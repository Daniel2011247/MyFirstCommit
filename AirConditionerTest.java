import java.util.Scanner;
public class AirConditionerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter AC colour");
		String colour = sc.next();
		System.out.print("Enter AC size");
		String size = sc.next();
		System.out.print("Enter AC temperature");
		int temperature = sc.nextInt();
		System.out.print("Enter AC capacity");
		double capacity = sc.nextDouble();
		System.out.print("Enter AC manufacturer");
		String manufacturer  = sc.next();
		
		AirConditioner obj = new AirConditioner();
		AirConditioner obj1 = new AirConditioner(colour);
		AirConditioner obj2 = new AirConditioner(colour, size);
		AirConditioner obj3 = new AirConditioner(colour, size, temperature);
		AirConditioner obj4 = new AirConditioner(colour, size, temperature, capacity);
		AirConditioner obj5 = new AirConditioner(colour, size, temperature, capacity, manufacturer);
		
		obj1.setColour(colour);
		obj1.getColour();
		obj2.setSize(size);
		obj2.getSize();
		obj3.setTemperature(temperature);
		obj3.getTemperature();
		obj4.setCapacity(capacity);
		obj4.getCapacity();
		obj5.setManufacturer(manufacturer);
		obj5.getManufacturer();
		System.out.println(obj1.getColour());
		System.out.println(obj2.getSize());
		System.out.println(obj3.getTemperature());
		System.out.println(obj4.getCapacity());
		System.out.println(obj5.getManufacturer());
		System.out.println(obj.tempRegulator(temperature));
	}

}
