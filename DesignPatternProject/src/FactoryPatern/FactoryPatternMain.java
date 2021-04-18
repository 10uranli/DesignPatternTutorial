package FactoryPatern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		
		//Car Objesi
		Vehicle car = factory.getVehicle(VehicleType.Car);
		car.getSpeed();
		
		//Bicycle Objesi
		Vehicle bicycle = factory.getVehicle(VehicleType.Bicycle);
		bicycle.getSpeed();
	}
}
