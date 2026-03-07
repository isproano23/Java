package ClearMinds.cuentas.test;

import ClearMinds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {

		
		System.out.println("VALORES INICIALES");
		
		Cuenta cta1=new Cuenta("03476","A");
		
		Cuenta cta2= new Cuenta("48569","C");
		
		Cuenta cta3= new Cuenta("963221","D");
		
		Cuenta ct4=new Cuenta("965223");
		
		cta1.setSaldo(456);
		cta2.setSaldo(523); 
		cta3.setSaldo(741);
		
		cta1.imprimirConMiEstilo();
		cta2.imprimirConMiEstilo();
		cta3.imprimirConMiEstilo();
		ct4.imprimirConMiEstilo();
		
		
		
	}
	
	

}
