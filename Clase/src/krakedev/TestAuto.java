package krakedev;

public class TestAuto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		System.out.println("Marca:" + a1.marca);
		System.out.println("Anio:" + a1.anio);
		System.out.println("Precio:" + a1.precio);
		System.out.println("***************************");
		a1.marca="TOYOTA";
		a1.anio=2024;
		a1.precio=23000;
		System.out.println("Marca:" + a1.marca);
		System.out.println("Anio:" + a1.anio);
		System.out.println("Precio:" + a1.precio);
		System.out.println("---------------------------------");
		System.out.println("Marca:" + a2.marca);
		System.out.println("Anio:" + a2.anio);
		System.out.println("Precio:" + a2.precio);
		System.out.println("......................................");
		a2.marca="NISSAN";
		a2.anio=2018;
		a2.precio=25000;
		System.out.println("Marca:" + a2.marca);
		System.out.println("Anio:" + a2.anio);
		System.out.println("Precio:" + a2.precio);
	}


}
