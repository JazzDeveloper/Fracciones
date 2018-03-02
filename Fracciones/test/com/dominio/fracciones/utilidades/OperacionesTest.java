package com.dominio.fracciones.utilidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class OperacionesTest {
	
	@Test
	public void elM�ximoCom�nDivisorDeUnNumeroEnteroPositivoConCeroEsElMismoNumeroEnteroPositivo() {
		assertThat(Operaciones.m�ximoCom�nDivisor(20, 0) , is(20));
	}
	
	@Test	
	public void elM�ximoCom�nDivisorEntreDosYTresEsUno(){
		assertThat(Operaciones.m�ximoCom�nDivisor(2, 3) , is(1));		
	}
	
	@Test	
	public void elM�ximoCom�nDivisorEntreDosYDosEsDos(){
		assertThat(Operaciones.m�ximoCom�nDivisor(2, 2) , is(2));		
	}
	
	@Test	
	public void elM�ximoCom�nDivisorEntreCuatroYDosEsDos(){
		assertThat(Operaciones.m�ximoCom�nDivisor(4, 2) , is(2));		
	}
	
	@Test	
	public void elM�nimoCom�nM�ltiploEntreCuatroYDosEsCuatro(){
		assertThat(Operaciones.m�nimoCom�nM�ltiplo(4, 2) , is(4));		
	}

	@Test	
	public void elM�nimoCom�nM�ltiploEntreDosYUnoEsDos(){
		assertThat(Operaciones.m�nimoCom�nM�ltiplo(2, 1) , is(2));		
	}
	
	@Test	
	public void elM�nimoCom�nM�ltiploEntreDosNumerosEnterosPositivosIgualesEsElMismoNumeroEnteroPositivo(){
		assertThat(Operaciones.m�nimoCom�nM�ltiplo(20, 20) , is(20));		
	}

}
