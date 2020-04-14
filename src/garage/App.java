package garage;

public class App {
	public static void main(String[] args) {
		Garage g = new Garage();
		Car brum = new Car(1000,280,4,34);
		Car brum2 = new Car(1000,280,4,34);
		Car brum3 = new Car(1000,280,4,34);
		Boat betsy = new Boat(2467,2000,0,"Prop");
		
		// Adding vehicle to the garage
		g.addVehicle(brum);
		g.addVehicle(brum2);
		g.addVehicle(brum3);
		g.addVehicle(betsy);
		g.printVehicles();
		
//		System.out.println(g.calcBill());
		
		// Remove vehicle by class type
		System.out.println("______________");
		g.removeVehiclesByType(Car.class);
		g.printVehicles();
		
//		// Calculate bill 
//		System.out.println(brum.calcBill());
//		System.out.println(betsy.calcBill());
		
	}
	
}