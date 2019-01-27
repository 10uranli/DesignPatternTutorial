package CreationalPatterns.Builder;

public class Test {

	
	public static void main(String[] args) {
		Body body = new BodyBuilder().setArms(2).setEars(2).setEyes(2).build();
		System.out.println(body.getArms());
		
	}
}
