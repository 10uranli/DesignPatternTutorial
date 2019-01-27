package CreationalPatterns.Singleton;

public class Test {

	public static void main(String[] args) {
		Life life = Life.getOurLife();
		life.getAge();
		Death death = Death.getDeath();
		death.helloDeath();
	}
}
