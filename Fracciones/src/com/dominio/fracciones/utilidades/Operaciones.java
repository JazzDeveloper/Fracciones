package com.dominio.fracciones.utilidades;

public final class Operaciones {

	private Operaciones(){
		throw new AssertionError("Esta es una clase utilitaria");		
	}
	
	public static int máximoComúnDivisor(int a, int b){
		 return b == 0 ? a : máximoComúnDivisor(b, a % b);
	}
	
	public static int mínimoComúnMúltiplo(int a, int b){
		return (a * b) / máximoComúnDivisor(a, b);
	}

}
