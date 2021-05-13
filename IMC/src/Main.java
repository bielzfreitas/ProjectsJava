public class Main {

	static double result;
    static String message;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    Patient p1 = new Patient(70,1.69);
        result = p1.calculationBMI();
        message = p1.diagnosis(result);
        System.out.println(message);

	}

}
