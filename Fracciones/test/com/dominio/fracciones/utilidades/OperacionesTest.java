package com.dominio.fracciones.utilidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class OperacionesTest {
	
	@Test
	public void elMáximoComúnDivisorDeUnNumeroEnteroPositivoConCeroEsElMismoNumeroEnteroPositivo() {
		assertThat(20 , is(Operaciones.máximoComúnDivisor(20, 0)));
	}
	
	@Test	
	public void elMáximoComúnDivisorEntreDosYTresEsUno(){
		assertThat(1 , is(Operaciones.máximoComúnDivisor(2, 3)));		
	}
	
	@Test	
	public void elMáximoComúnDivisorEntreDosYDos(){
		assertThat(2 , is(Operaciones.máximoComúnDivisor(2, 2)));		
	}
	
	@Test	
	public void elMáximoComúnDivisorEntreCuatroYDos(){
		assertThat(2 , is(Operaciones.máximoComúnDivisor(4, 2)));		
	}
	
	@Test	
	public void elMínimoComúnMúltiploEntreCuatroYDosEsCuatro(){
		assertThat(4 , is(Operaciones.mínimoComúnMúltiplo(4, 2)));		
	}

	@Test	
	public void elMínimoComúnMúltiploEntreDosYUnoEsDos(){
		assertThat(2 , is(Operaciones.mínimoComúnMúltiplo(2, 1)));		
	}
	
	@Test	
	public void elMínimoComúnMúltiploEntreDosNumerosEnterosPositivosIgualesEsElMismoNumeroEnteroPositivo(){
		assertThat(20 , is(Operaciones.mínimoComúnMúltiplo(20, 20)));		
	}

}
