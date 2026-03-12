package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item item=new Item("Doritos",28,16,11);
		
		  System.out.println("Estado inicial:");
	        item.imprimir();
	        
	        System.out.println("\nVendiendo 10 productos...");
	        item.vender(10);
	        item.imprimir();

		

	}

}
