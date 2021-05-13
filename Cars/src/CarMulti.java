
public class CarMulti extends RaceCar {

	private double power;
	
	public CarMulti(String name, double power,  int velocityMax) {
		super(name, velocityMax);
		// TODO Auto-generated constructor stub
		if(power > 1 && power < 2) {
			this.power = power;
		}else {
			this.power = 1.5;
		}
	}

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		if(velocity == 0) {
			velocity = 10;
		}else {
			velocity *= power;
			if(velocity > velocityMax){
				velocity = velocityMax;
			}
		}
	}

}
