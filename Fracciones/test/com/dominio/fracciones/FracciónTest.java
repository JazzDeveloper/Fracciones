package com.dominio.fracciones;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class Fracci�nTest {
	
	//@Test(expected = IllegalArgumentException.class)
	public void unaFraccionNoPuedeTenerDenominadorCero(){    
		new Fracci�n(5,0);
	}
	
	@Test
	public void unaFraccionSoloConNumeradorTieneComoDenominadorPorDefectoUno(){    
		assertThat(new Fracci�n(10,1) ,is(new Fracci�n(10)));	
	}
	
	@Test
	public void simplificarDiezMediosEsCinco(){
		assertThat(new Fracci�n(10,2) ,is(new Fracci�n(5,1).simplificada()));	
	}

	@Test 
	public void laSumaEntreUnoYUnMedioEsTresMedios(){
		assertThat(new Fracci�n(1, 1).m�s(new Fracci�n(1, 2)),is(new Fracci�n(3,2)));	
	}
	
	@Test 
	public void laRestaEntreUnoYUnMedioEsUnMedio(){
		assertThat(new Fracci�n(1, 1).menos(new Fracci�n(1, 2)),is(new Fracci�n(1,2)));	
	}
	
	@Test 
	public void laMultiplicacionEntreUnoYUnMedioEsUnMedio(){
		assertThat(new Fracci�n(1, 1).por(new Fracci�n(1, 2)),is(new Fracci�n(1,2)));	
	}
	
	@Test 
	public void laDivisi�nEntreUnoYUnMedioEsDos(){
		assertThat(new Fracci�n(1, 1).dividido(new Fracci�n(1, 2)),is(new Fracci�n(2,1)));	
	}
	
}
