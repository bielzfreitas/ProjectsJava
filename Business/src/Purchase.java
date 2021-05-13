//dois construtores para uma mesma classe

public class Purchase {
	int amount;
	int numberPlots;
	
	// in cash
	public Purchase(int value) {
		amount = value;
		numberPlots = 1;
	}
	
	// parceled
	public Purchase(int qtPlots, int valuePlot) {
		numberPlots = qtPlots;
		amount = valuePlot * qtPlots;
	}

	public int getAmount() {
		return amount;
	}

	public int getNumberPlots() {
		return numberPlots;
	}

	public int getValuePlot() {
		return amount / numberPlots;
	}
	
}
