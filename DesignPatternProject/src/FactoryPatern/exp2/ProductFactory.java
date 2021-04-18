package FactoryPatern.exp2;

/*Objeleri buradan oluþturacaðýz*/
public class ProductFactory {

	public Product getProduct(String product){
		
		if(product == null){
			return null;
		}
		
		if("Bread".equals(product)){
			return new Bread();
		}
		
		if("Milk".equals(product)){
			return new Milk();
		}
		
		return null;
		
	}
	
}
