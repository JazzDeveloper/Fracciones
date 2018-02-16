package com.dominio.fracciones.utilidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class OperacionesFraccionTest {
	
	@Test
	public void elMáximoComúnDivisorDeUnNumeroEnteroPositivoConCeroEsElMismoNumeroEnteroPositivo() {
		assertThat(20 , is(OperacionesFraccion.máximoComúnDivisor(20, 0)));
	}
	
	@Test	
	public void elMáximoComúnDivisorDeCuarentaYDosConCincuentaYSeisEsCatorce(){
		assertThat(14 , is(OperacionesFraccion.máximoComúnDivisor(42, 56)));		
	}
	
	@Test	
	public void elMínimoComúnMúltiploEntreDosNumerosEnterosPositivosIgualesEsElMismoNumeroEnteroPositivo(){
		assertThat(20 , is(OperacionesFraccion.mínimoComúnMúltiplo(20, 20)));		
	}

	
	
}
