package garage;

public class Car extends Vehicle {

	private int bootSpace;

	public Car() {
		super();
	}

	public Car(int weight, int topSpeed, int noOfWheels, int bootSpace) {
		super(weight, topSpeed, noOfWheels);
		this.bootSpace = bootSpace;
	}

	

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	@Override
	public String toString() {
		return "Car [bootSpace=" + bootSpace + "," + super.toString() + "]";
	}

	@Override
	public float calcBill() {
		return 0;
	}

	
}