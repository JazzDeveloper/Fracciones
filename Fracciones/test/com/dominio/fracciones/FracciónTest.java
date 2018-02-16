package com.dominio.fracciones;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class Fracci�nTest {

	private Fracci�n unoSobreUno;
	private Fracci�n unoSobreDos;
	
	@Before
	public void crearFracciones() {
		unoSobreUno = new Fracci�n(1, 1);		
		unoSobreDos = new Fracci�n(1, 2);		
	}
	
	//@Test(expected = IllegalArgumentException.class)
	public void unaFraccionNoPuedeTenerDenominadorCero(){    
		new Fracci�n(5,0);
	}
	
	@Test
	public void unaFraccionSoloConNumeradorTieneComoDenominadorPorDefectoUno(){    
		assertThat(new Fracci�n(10,1) ,is(new Fracci�n(10)));	
	}
	
	@Test
	public void simplificarDiezSobreDosEsCincoSobreUno(){
		assertThat(new Fracci�n(5,1) ,is(new Fracci�n(10,2).simplificada()));	
	}

	@Test 
	public void laSumaEntreUnoSobreUnoYUnoSobreDosEsTresSobreDos(){
		assertThat(unoSobreUno.m�s(unoSobreDos),is(new Fracci�n(3,2)));	
	}
	
	@Test 
	public void laRestaEntreUnoSobreUnoYUnoSobreDosEsUnoSobreDos(){
		assertThat(unoSobreUno.menos(unoSobreDos),is(new Fracci�n(1,2)));	
	}
	
	@Test 
	public void laMultiplicacionEntreUnoSobreUnoYUnoSobreDosEsUnoSobreDos(){
		assertThat(unoSobreUno.por(unoSobreDos),is(new Fracci�n(1,2)));	
	}
	
	@Test 
	public void laDivisi�nEntreUnoSobreUnoYUnoSobreDosEsDosSobreUno(){
		assertThat(unoSobreUno.dividido(unoSobreDos),is(new Fracci�n(2,1)));	
	}
	
}
