package BuilderPattern;

public class WorkMain {

	public static void main(String[] args) {
		 WorkBuilder WorkBuilder = new WorkBuilder();

	      Work javaWork = WorkBuilder.prepareJavaWork();
	      System.out.println("javaWork");
	      javaWork.showItems();
	      System.out.println("Total Cost: " + javaWork.getCost());

	      Work nonJavaWork = WorkBuilder.prepareNonJavaWork();
	      System.out.println("\n\nNon-javaWork");
	      nonJavaWork.showItems();
	      System.out.println("Total Cost: " + nonJavaWork.getCost());
	}
}
