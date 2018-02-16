package com.dominio.fracciones;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class FraccionTest {

	private  Fraccion fraccion1;
	private  Fraccion fraccion2;
	
	@Before
	public void crearFraccion() {
		fraccion1 = new Fraccion(1, 1);		
		fraccion2 = new Fraccion(1, 2);		
	}
	
	@Test
	public void simplificarDiezSobreDosEsCincoSobreUno(){
		assertThat("1/1" ,is(fraccion1.simplificar().toString()));	
	}

	@Test
	public void laSumaDeUnoSobreUnoYUnoSobreDosEsTresSobreDos(){
		assertThat(fraccion1.más(fraccion2),is(new Fraccion(3, 2)));	
	}
	

}
