package FactoryPatern.exp2;

public class Bread  implements Product {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ben ekme�im";
	}

	@Override
	public Integer getPrice() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return "Bread [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

	
}
