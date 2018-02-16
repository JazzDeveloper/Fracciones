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
	public void elM�ximoCom�nDivisorDeCuarentaYDosConCincuentaYSeisEsCatorce(){
		assertThat(14 , is(Operaciones.m�ximoCom�nDivisor(42, 56)));		
	}
	
	@Test	
	public void elM�nimoCom�nM�ltiploEntreDosNumerosEnterosPositivosIgualesEsElMismoNumeroEnteroPositivo(){
		assertThat(20 , is(Operaciones.m�nimoCom�nM�ltiplo(20, 20)));		
	}

	
}