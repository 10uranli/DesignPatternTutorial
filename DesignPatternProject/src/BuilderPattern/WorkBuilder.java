package BuilderPattern;

public class WorkBuilder {

	  public Work prepareJavaWork (){
	      Work Work = new Work();
	      Work.addItem(new Javacilar());
	      return Work;
	   }   

	   public Work prepareNonJavaWork (){
	      Work Work = new Work();
	      Work.addItem(new DotNetciler());
	      return Work;
	   }
}
