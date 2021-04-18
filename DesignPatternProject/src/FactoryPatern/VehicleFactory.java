package FactoryPatern;

public class VehicleFactory {

	public Vehicle getVehicle(VehicleType type) {
		if (type == null) {
			return null;
		}
		
		if(type.equals(VehicleType.Bicycle)) {
			return new Bicycle();
		}else if (type.equals(VehicleType.Car)) {
			return new Car();
		}
		return null;
		
	}
	
}
