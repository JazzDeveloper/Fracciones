package com.dominio.fracciones;
import static com.dominio.fracciones.utilidades.Operaciones.*;

import java.util.Objects;

public final class Fracción {
	
	private final int numerador;
	private final int denominador;
	
	public Fracción(final int numerador, final int denominador) {		
		if(denominador == 0){
			throw new IllegalArgumentException();
		}	
		this.numerador = numerador;
		this.denominador = denominador;		
	}
	
	public Fracción(final int numerador) {		
		this(numerador, 1);
	}
	
	public Fracción simplificada(){
		return new Fracción(simplificarOperando(this.numerador),simplificarOperando(this.denominador));
	}
	
	private int simplificarOperando(final int operando){
		return operando / máximoComúnDivisor(this.numerador, this.denominador);		
	}
	
	public Fracción más(final Fracción fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		Fracción otra =  fraccion;
		int mínimoComúnMúltiploDenominadores = mínimoComúnMúltiplo(this.denominador, otra.denominador);
		int a = mínimoComúnMúltiploDenominadores / (this.denominador * otra.numerador);
		int b = mínimoComúnMúltiploDenominadores / (this.numerador * otra.denominador);
			
		return new Fracción(a + b, mínimoComúnMúltiploDenominadores);		
	}
	
	public Fracción menos(final Fracción fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		return this.inverso().más(fraccion);		
	}
	
	public Fracción inverso(){
		return new Fracción(-this.numerador,this.denominador); 
	}
	
	public Fracción recíproco(){
		return new Fracción(this.denominador,this.numerador); 
	}
	
	public Fracción por(final Fracción fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		Fracción otra =  fraccion;
		return new Fracción(this.numerador*otra.numerador,this.denominador*otra.denominador); 
	}
	
	public Fracción dividido(final Fracción fraccion){
		if(fraccion == null) throw new IllegalArgumentException();
		Fracción otra =  fraccion;
		return this.por(otra.recíproco()); 
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
		Fracción otra = (Fracción) obj;
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
