package com.cmc.repaso.entidades;

public class Item {
 private String nombre;
 private int productosActuales;
 private int productosDevueltos;
 private int productosVendidos;
 
 public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
	this.nombre = nombre;
	this.productosActuales = productosActuales;
	this.productosDevueltos = productosDevueltos;
	this.productosVendidos = productosVendidos;
 }

 public String getNomnbre() {
	return nombre;
 }

 public void setNomnbre(String nombre) {
	this.nombre = nombre;
 }

 public int getProductosActuales() {
	return productosActuales;
 }

 public void setProductosActuales(int productosActuales) {
	this.productosActuales = productosActuales;
 }

 public int getProductosDevueltos() {
	return productosDevueltos;
 }

 public void setProductosDevueltos(int productosDevueltos) {
	this.productosDevueltos = productosDevueltos;
 }

 public int getProdutosVendidos() {
	return productosVendidos;
 }

 public void setProdutosVendidos(int produtosVendidos) {
	this.productosVendidos = produtosVendidos;
 }
 
 public void imprimir() {
     System.out.println("Nombre: " + nombre);
     System.out.println("Productos actuales: " + productosActuales);
     System.out.println("Productos devueltos: " + productosDevueltos);
     System.out.println("Productos vendidos: " +productosVendidos);
 }
 
 public void vender(int cantidad) {
     if (cantidad <= productosActuales) {
         productosActuales -= cantidad;
         productosVendidos += cantidad;
     } else {
         System.out.println("No hay suficientes productos para vender.");
     }
 }
 
 public void devolver(int cantidad) {
     if (cantidad <= productosVendidos) {
         productosActuales += cantidad;
         productosVendidos -= cantidad;
         productosDevueltos += cantidad;
     } else {
         System.out.println("No hay suficientes productos vendidos para devolver.");
     }
 }
 
}
