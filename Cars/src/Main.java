
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Race raceDay = new Race(2000);
		raceDay.addCar(new Car("Chiron", 10, 400));
		raceDay.addCar(new Car("Agera", 9, 405));
		raceDay.addCar(new CarMulti("Impreza", 1.7, 230));
		raceDay.addCar(new CarMulti("Lancer", 1.4, 220));
		raceDay.start();
	}

}
