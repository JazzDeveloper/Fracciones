package com.dominio.fracciones;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class FracciónTest {
	
	//@Test(expected = IllegalArgumentException.class)
	public void unaFraccionNoPuedeTenerDenominadorCero(){    
		new Fracción(5,0);
	}
	
	@Test
	public void unaFraccionSoloConNumeradorTieneComoDenominadorPorDefectoUno(){    
		assertThat(new Fracción(10,1) ,is(new Fracción(10)));	
	}
	
	@Test
	public void simplificarDiezMediosEsCinco(){
		assertThat(new Fracción(10,2) ,is(new Fracción(5,1).simplificada()));	
	}

	@Test 
	public void laSumaEntreUnoYUnMedioEsTresMedios(){
		assertThat(new Fracción(1, 1).más(new Fracción(1, 2)),is(new Fracción(3,2)));	
	}
	
	@Test 
	public void laRestaEntreUnoYUnMedioEsUnMedio(){
		assertThat(new Fracción(1, 1).menos(new Fracción(1, 2)),is(new Fracción(1,2)));	
	}
	
	@Test 
	public void laMultiplicacionEntreUnoYUnMedioEsUnMedio(){
		assertThat(new Fracción(1, 1).por(new Fracción(1, 2)),is(new Fracción(1,2)));	
	}
	
	@Test 
	public void laDivisiónEntreUnoYUnMedioEsDos(){
		assertThat(new Fracción(1, 1).dividido(new Fracción(1, 2)),is(new Fracción(2,1)));	
	}
	
}
