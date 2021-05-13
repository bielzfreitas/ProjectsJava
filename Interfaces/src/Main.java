
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barulhento[] barulhentos = new Barulhento[3];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Carro();
		barulhentos[2] = new Bateria();
		
		sons(barulhentos);
	}
	
	public static void sons(Barulhento[] barulhentos) {
		for(Barulhento b : barulhentos) {
			System.out.println(b.fazerBarulho());
		}
	}

}
