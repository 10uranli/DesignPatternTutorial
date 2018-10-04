package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Work {

	 private List<Ability> abilitys = new ArrayList<Ability>();	

	   public void addItem(Ability ability){
		   abilitys.add(ability);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Ability ability : abilitys) {
	         cost += ability.salary();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Ability ability : abilitys) {
	         System.out.print("Item : " + ability.whoIam());
	         System.out.print(", Packing : " + ability.language().lang());
	         System.out.println(", Price : " + ability.salary());
	      }		
	   }	
}
