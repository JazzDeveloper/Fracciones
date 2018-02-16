package com.dominio.fracciones;
import static com.dominio.fracciones.utilidades.OperacionesFraccion.*;

public final class Fraccion {
	private final int numerador;
	private final int denominador;
	
	public Fraccion(final int numerador, final int denominador) {		
		if(denominador == 0){
			throw new IllegalArgumentException();
		}	
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion(final int numerador) {		
		this(numerador, 1);
	}
	
	public Fraccion simplificar(){
		return new Fraccion(simplificarOperando(this.numerador),simplificarOperando(this.denominador));
	}
	
	private int simplificarOperando(final int operando){
		return operando / m�ximoCom�nDivisor(this.numerador, this.denominador);		
	}
	
	public Fraccion m�s(final Fraccion fraccion){
		Fraccion otraFraccion =  fraccion;
		
		int m�nimoCom�nM�ltiploDenominadores = m�nimoCom�nM�ltiplo(this.denominador, otraFraccion.denominador);
		int a = m�nimoCom�nM�ltiploDenominadores / otraFraccion.denominador * this.numerador;
		int b = m�nimoCom�nM�ltiploDenominadores / this.denominador * otraFraccion.numerador;
			
		return new Fraccion(a + b, m�nimoCom�nM�ltiplo(this.denominador, otraFraccion.denominador));		
	} 

	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
		
}
