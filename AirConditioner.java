public class AirConditioner{
	private String colour;
	private String size;
	private int temperature;
	private double capacity;
	private String manufacturer;
	
	public AirConditioner() {
		
	}
	
	public AirConditioner(String colour){
		this.colour = colour;
	}
	
	public AirConditioner(String colour, String size){
		this.colour = colour;
		this.size = size;
	}
	public AirConditioner(String colour, String size, int temperature) {
		this.colour = colour;
		this.size = size;
		this.temperature = temperature;
	}
	public AirConditioner(String colour, String size, int temperature, double capacity) {
		this.colour = colour;
		this.size = size;
		this.temperature = temperature;
		this.capacity = capacity;
	}
	public AirConditioner(String colour, String size, int temperature, double capacity, String manufacturer) {
		this.colour = colour;
		this.size = size;
		this.temperature = temperature;
		this.capacity = capacity;
		this.manufacturer = manufacturer;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int tempRegulator(int temperature) {
		return temperature +=4;
	}
	

}
