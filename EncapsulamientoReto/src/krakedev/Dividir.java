package krakedev;

public class Dividir {
	private  double dividendo;
	private double divisor;
	
	public double dividir() {
		double resultado;
		resultado=dividendo/divisor;
		return resultado;
		
	}

	public double getDividendo() {
		return dividendo;
	}

	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}

	public double getDivisor() {
		return divisor;
	}

	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}

}