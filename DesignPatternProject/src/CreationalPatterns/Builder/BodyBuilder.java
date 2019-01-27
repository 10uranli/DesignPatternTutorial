package CreationalPatterns.Builder;

public class BodyBuilder {

	private Body body;
	
	public BodyBuilder() {
		body = new Body();
	}
	
	public BodyBuilder setArms(int arms) {
		body.setArms(arms);
		return this;
	}

	public BodyBuilder setEars(int ears) {
		body.setEars(ears);
		return this;
	}
	
	public BodyBuilder setEyes(int eyes) {
		body.setEyes(eyes);
		return this;
	}
	
	public Body build(){
		return body;
	}
}
