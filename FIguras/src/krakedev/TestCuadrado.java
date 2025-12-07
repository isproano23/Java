package krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c=new Cuadrado();
		double resultado;
		double resultado1;
		c.lado=8;
		resultado1=c.Perimetro();
		resultado=c.areaCuadrado();
		System.out.println("EL AREA DEL CUADRADO ES:"+resultado);
		System.out.println("EL PERIMETRO DEL CUADRADO ES:"+resultado1);
		
		

	}

}
