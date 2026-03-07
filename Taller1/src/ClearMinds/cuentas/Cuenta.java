package ClearMinds.cuentas;

public class Cuenta {

	String id;
	String tipo ="A";
	double saldo;
	
	public Cuenta(String id) {
		this.id =id;
		this.tipo="A";
	}
	
	public Cuenta(String id, String tipo) {
		this.id = id;
		this.tipo =tipo;
	}
	
	public String getId() {
		return id;
	}
	public String getTipo() { 
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimirConMiEstilo() {
	  System.out.println("*************************");
	  System.out.println("DATOS DE LA CUENTA ");
	  System.out.println("ID......"+this.id);
	  System.out.println("TIPO....."+this.tipo);
	  System.out.println("SALDO....."+this.saldo);	  
}
	
	
}