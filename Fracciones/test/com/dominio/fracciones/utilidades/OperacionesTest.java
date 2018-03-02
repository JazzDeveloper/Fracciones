package com.dominio.fracciones.utilidades;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class OperacionesTest {
	
	@Test
	public void elMáximoComúnDivisorDeUnNumeroEnteroPositivoConCeroEsElMismoNumeroEnteroPositivo() {
		assertThat(Operaciones.máximoComúnDivisor(20, 0) , is(20));
	}
	
	@Test	
	public void elMáximoComúnDivisorEntreDosYTresEsUno(){
		assertThat(Operaciones.máximoComúnDivisor(2, 3) , is(1));		
	}
	
	@Test	
	public void elMáximoComúnDivisorEntreDosYDosEsDos(){
		assertThat(Operaciones.máximoComúnDivisor(2, 2) , is(2));		
	}
	
	@Test	
	public void elMáximoComúnDivisorEntreCuatroYDosEsDos(){
		assertThat(Operaciones.máximoComúnDivisor(4, 2) , is(2));		
	}
	
	@Test	
	public void elMínimoComúnMúltiploEntreCuatroYDosEsCuatro(){
		assertThat(Operaciones.mínimoComúnMúltiplo(4, 2) , is(4));		
	}

	@Test	
	public void elMínimoComúnMúltiploEntreDosYUnoEsDos(){
		assertThat(Operaciones.mínimoComúnMúltiplo(2, 1) , is(2));		
	}
	
	@Test	
	public void elMínimoComúnMúltiploEntreDosNumerosEnterosPositivosIgualesEsElMismoNumeroEnteroPositivo(){
		assertThat(Operaciones.mínimoComúnMúltiplo(20, 20) , is(20));		
	}

}
