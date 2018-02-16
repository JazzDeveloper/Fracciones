package com.dominio.fracciones.utilidades;

public final class Operaciones {

	private Operaciones(){
		throw new AssertionError("Esta es una clase utilitaria");		
	}
	
	public static int m�ximoCom�nDivisor(int a, int b){
		 return b == 0 ? a : m�ximoCom�nDivisor(b, a % b);
	}
	
	public static int m�nimoCom�nM�ltiplo(int a, int b){
		return (a * b) / m�ximoCom�nDivisor(a, b);
	}

}
