package FactoryPatern.exp2;

public class Milk implements Product{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ben sütüm";
	}

	@Override
	public Integer getPrice() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String toString() {
		return "Milk [getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

	
}
