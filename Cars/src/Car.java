public class Car extends RaceCar {
	
	private int power;

	public Car(String name, int power, int velocityMax) {
		super(name, velocityMax);
		this.power = power;
	}

	@Override
	public void speedUp() {
		velocity += power;
		if(velocity > velocityMax)
			velocity = velocityMax;
	}
	
	/*public void printOut() {
		System.out.println("The car "+name+ " is at speed of "+getVelocity()+ " km/h");
	}*/
}
