package com.dominio.fracciones;

public class Principal {

	public static void main(String[] args) {
		
		Fraccion f = new Fraccion(200, 15);

		System.out.format("%s", "Simplificar " + f.simplificar());
		
	}

}
