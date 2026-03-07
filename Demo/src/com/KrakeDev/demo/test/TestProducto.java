package com.KrakeDev.demo.test;

import krakeDev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto1=new Producto(511,"PARACETAMOL");
		producto1.setDescripcion("MEDICINA");
		producto1.setPrecio(9.25);
		
		System.out.println("Informacion del Producto");
		System.out.println("CODIGO...."+producto1.getCodigo());
		System.out.println("NOMBRE...."+producto1.getNombre());
		System.out.println("DESCRIPCION...."+producto1.getDescripcion());
		System.out.println("PRECIO...."+producto1.getPrecio());
        
		

	}

}
