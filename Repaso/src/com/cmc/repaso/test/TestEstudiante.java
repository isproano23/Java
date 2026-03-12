package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante=new Estudiante("Isaac");
		
		estudiante.calificar(5.41);
	  
		System.out.println("NOMBRE: " +estudiante.getNombre());
		System.out.println("RESULTADO: " +estudiante.getResultado());
		System.out.println("NOTA: " +estudiante.getNota());
		

	}

}
