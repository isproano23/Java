package krakeDev.demo;

public class Producto {
	
	private int Codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Producto(int codigo, String nombre) {
		this.Codigo = codigo;
		this.nombre = nombre;

	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
