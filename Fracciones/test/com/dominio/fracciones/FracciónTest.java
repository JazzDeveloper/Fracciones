package com.dominio.fracciones;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class FracciónTest {

	private Fracción unoSobreUno;
	private Fracción unoSobreDos;
	
	@Before
	public void crearFracciones() {
		unoSobreUno = new Fracción(1, 1);		
		unoSobreDos = new Fracción(1, 2);		
	}
	
	//@Test(expected = IllegalArgumentException.class)
	public void unaFraccionNoPuedeTenerDenominadorCero(){    
		new Fracción(5,0);
	}
	
	@Test
	public void unaFraccionSoloConNumeradorTieneComoDenominadorPorDefectoUno(){    
		assertThat(new Fracción(10,1) ,is(new Fracción(10)));	
	}
	
	@Test
	public void simplificarDiezSobreDosEsCincoSobreUno(){
		assertThat(new Fracción(5,1) ,is(new Fracción(10,2).simplificada()));	
	}

	@Test 
	public void laSumaEntreUnoSobreUnoYUnoSobreDosEsTresSobreDos(){
		assertThat(unoSobreUno.más(unoSobreDos),is(new Fracción(3,2)));	
	}
	
	@Test 
	public void laRestaEntreUnoSobreUnoYUnoSobreDosEsUnoSobreDos(){
		assertThat(unoSobreUno.menos(unoSobreDos),is(new Fracción(1,2)));	
	}
	
	@Test 
	public void laMultiplicacionEntreUnoSobreUnoYUnoSobreDosEsUnoSobreDos(){
		assertThat(unoSobreUno.por(unoSobreDos),is(new Fracción(1,2)));	
	}
	
	@Test 
	public void laDivisiónEntreUnoSobreUnoYUnoSobreDosEsDosSobreUno(){
		assertThat(unoSobreUno.dividido(unoSobreDos),is(new Fracción(2,1)));	
	}
	
}
