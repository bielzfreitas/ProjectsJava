
public abstract class RaceCar {

	protected int velocity;
	protected int velocityMax;
	protected String name;

	public RaceCar(String name, int velocityMax) {
		this.name = name;
		this.velocityMax = velocityMax;
		this.velocity = 0;
	}
	
	public abstract void speedUp();
	
	public void stop() {
		velocity = velocity / 2;
	}

	public int getVelocity() {
		return velocity;
	}

	public String getName() {
		return name;
	}

}
