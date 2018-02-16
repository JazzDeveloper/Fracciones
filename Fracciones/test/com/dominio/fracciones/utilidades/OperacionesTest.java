package com.dominio.fracciones.utilidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class OperacionesTest {
	
	@Test
	public void elM�ximoCom�nDivisorDeUnNumeroEnteroPositivoConCeroEsElMismoNumeroEnteroPositivo() {
		assertThat(20 , is(Operaciones.m�ximoCom�nDivisor(20, 0)));
	}
	
	@Test	
	public void elM�ximoCom�nDivisorEntreDosYTresEsUno(){
		assertThat(1 , is(Operaciones.m�ximoCom�nDivisor(2, 3)));		
	}
	
	@Test	
	public void elM�ximoCom�nDivisorEntreDosYDos(){
		assertThat(2 , is(Operaciones.m�ximoCom�nDivisor(2, 2)));		
	}
	
	@Test	
	public void elM�ximoCom�nDivisorEntreCuatroYDos(){
		assertThat(2 , is(Operaciones.m�ximoCom�nDivisor(4, 2)));		
	}
	
	@Test	
	public void elM�nimoCom�nM�ltiploEntreCuatroYDosEsCuatro(){
		assertThat(4 , is(Operaciones.m�nimoCom�nM�ltiplo(4, 2)));		
	}

	@Test	
	public void elM�nimoCom�nM�ltiploEntreDosYUnoEsDos(){
		assertThat(2 , is(Operaciones.m�nimoCom�nM�ltiplo(2, 1)));		
	}
	
	@Test	
	public void elM�nimoCom�nM�ltiploEntreDosNumerosEnterosPositivosIgualesEsElMismoNumeroEnteroPositivo(){
		assertThat(20 , is(Operaciones.m�nimoCom�nM�ltiplo(20, 20)));		
	}

}
