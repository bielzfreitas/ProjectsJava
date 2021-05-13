import java.util.HashMap;
import java.util.Map;

public class Race {

	private int track;
	private Map<RaceCar, Integer> cars = new HashMap<>();
	
	public Race(int size) {
		// TODO Auto-generated constructor stub
		track = size;
	}
	
	public void addCar(RaceCar car) {
		cars.put(car, 0);
	}

	private boolean finish() {
		for(Integer value : cars.values()) {
			if(value >= track)
				return true;
		}
		return false;
	}
	
	public void start() {
		while(!finish()) {
			for(RaceCar car : cars.keySet()) {
				car.speedUp();
				int distance = cars.get(car);
				distance = car.getVelocity();
				cars.put(car, distance);
			}
		}
		
		for(RaceCar car : cars.keySet()) {
			System.out.println(car.getName()+" - "+cars.get(car));
		}
		
	}
}
