package FactoryPatern.exp2;

public class MainClass {

	public static void main(String[] args) {
		
		ProductFactory factory = new ProductFactory();
		
		Product milk = factory.getProduct("Milk");
		Product bread = factory.getProduct("Bread");
		
		System.out.println(milk);
		System.out.println(bread);
	}

}
