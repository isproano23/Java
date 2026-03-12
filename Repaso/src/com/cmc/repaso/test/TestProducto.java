package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto=new Producto("Camisetas",28.75);
		
		double descuento=producto.calcularPrecioPromo(15);
		
		System.out.println("Nombre del Producto: " +producto.getNombre());
		System.out.println("Precio del Producto: " +producto.getPrecio());
		System.out.println("Precio con Descuento:"+descuento);
		

	}

}
