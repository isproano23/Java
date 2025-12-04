package krakedev;

public class TestProducto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pA = new Producto();
		Producto pB = new Producto();
		Producto pC = new Producto();

		System.out.println("Nombre:" + pA.nombre);
		System.out.println("Descripcion:" + pA.descripcion);
		System.out.println("Precio:" + pA.precio);
		System.out.println("StockActual:" + pA.stcokActual);
		System.out.println("***************************");
		pA.nombre = "LEMONFLU";
		pA.descripcion = "SOBRE ";
		pA.precio = 10.5f;
		pA.stcokActual = 18;

		System.out.println("Marca:" + pA.nombre);
		System.out.println("Anio:" + pA.descripcion);
		System.out.println("Precio:" + pA.precio);
		System.out.println("StockActual:" + pA.stcokActual);
		System.out.println("---------------------------------");
		System.out.println("Marca:" + pB.nombre);
		System.out.println("Anio:" + pB.descripcion);
		System.out.println("Precio:" + pB.precio);
		System.out.println("StockActual:" + pB.stcokActual);
		System.out.println("......................................");
		pB.nombre = "PARACETAMOL";
		pB.descripcion = "PASTILLA";
		pB.precio = 15.25f;
		pB.stcokActual = 20;
		System.out.println("Marca:" + pB.nombre);
		System.out.println("Anio:" + pB.descripcion);
		System.out.println("Precio:" + pB.precio);
		System.out.println("StockActual:" + pB.stcokActual);
		System.out.println("......................................");
		System.out.println("Marca:" + pC.nombre);
		System.out.println("Anio:" + pC.descripcion);
		System.out.println("Precio:" + pC.precio);
		System.out.println("StockActual:" + pC.stcokActual);
		System.out.println("***************************");
		pB.nombre = "TEMPRA";
		pC.descripcion = "Jarabe";
		pC.precio = 200.25f;
		pC.stcokActual = 70;
		System.out.println("Marca:" + pC.nombre);
		System.out.println("Anio:" + pC.descripcion);
		System.out.println("Precio:" + pC.precio);
		System.out.println("StockActual:" + pC.stcokActual);

	}
}
