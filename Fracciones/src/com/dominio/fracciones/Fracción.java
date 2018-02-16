package com.dominio.fracciones;
import static com.dominio.fracciones.utilidades.Operaciones.*;

import java.util.Objects;

public final class Fracci�n {
	
	private final int numerador;
	private final int denominador;
	
	public Fracci�n(final int numerador, final int denominador) {		
		if(denominador == 0){
			throw new IllegalArgumentException();
		}	
		this.numerador = numerador;
		this.denominador = denominador;		
	}
	
	public Fracci�n(final int numerador) {		
		this(numerador, 1);
	}
	
	public Fracci�n simplificada(){
		return new Fracci�n(simplificarOperando(this.numerador),simplificarOperando(this.denominador));
	}
	
	private int simplificarOperando(final int operando){
		return operando / m�ximoCom�nDivisor(this.numerador, this.denominador);		
	}
	
	public Fracci�n m�s(final Fracci�n fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		Fracci�n otra =  fraccion;
		int m�nimoCom�nM�ltiploDenominadores = m�nimoCom�nM�ltiplo(this.denominador, otra.denominador);
		int a = m�nimoCom�nM�ltiploDenominadores / (this.denominador * otra.numerador);
		int b = m�nimoCom�nM�ltiploDenominadores / (this.numerador * otra.denominador);
			
		return new Fracci�n(a + b, m�nimoCom�nM�ltiploDenominadores);		
	}
	
	public Fracci�n menos(final Fracci�n fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		return this.inverso().m�s(fraccion);		
	}
	
	public Fracci�n inverso(){
		return new Fracci�n(-this.numerador,this.denominador); 
	}
	
	public Fracci�n rec�proco(){
		return new Fracci�n(this.denominador,this.numerador); 
	}
	
	public Fracci�n por(final Fracci�n fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		Fracci�n otra =  fraccion;
		return new Fracci�n(this.numerador*otra.numerador,this.denominador*otra.denominador); 
	}
	
	public Fracci�n dividido(final Fracci�n fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		Fracci�n otra =  fraccion;
		return this.por(otra.rec�proco()); 
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s", numerador, denominador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fracci�n otra = (Fracci�n) obj;
		if (denominador != otra.denominador)
			return false;
		if (numerador != otra.numerador)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int resultado = 1;
		resultado = prime * resultado + denominador;
		resultado = prime * resultado + numerador;
		return resultado;
	}
		
}
