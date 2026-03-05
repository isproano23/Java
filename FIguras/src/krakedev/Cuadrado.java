package krakedev;

public class Cuadrado {
	public int lado;
	
	
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}

	public double areaCuadrado() {
		double area;
		 area=lado*lado;
		return area;
	}
	
	public double Perimetro() {
		double perimetro;
		perimetro=lado*4;
		return  perimetro;
	}

}
