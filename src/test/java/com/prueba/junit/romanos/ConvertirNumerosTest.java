package com.prueba.junit.romanos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertirNumerosTest {
	
	private ConvertirNumeros cn = new ConvertirNumeros();
	
	@Test
	void convertirI() {
		assertEquals(1, cn.convertirLetraANumero("I"));
	}
	
	@Test
	void convertirII() {
		assertEquals(2, cn.convertirLetraANumero("II"));
	}
	
	@Test
	void convertirIII() {
		assertEquals(3, cn.convertirLetraANumero("III"));
	}
	
	@Test
	void convertirIV() {
		assertEquals(4, cn.convertirLetraANumero("IV"));
	}
	
	@Test
	void convertirV() {
		assertEquals(5, cn.convertirLetraANumero("V"));
	}
	
	@Test
	void convertirVI() {
		assertEquals(6, cn.convertirLetraANumero("VI"));
	}
	
	@Test
	void convertirVII() {
		assertEquals(7, cn.convertirLetraANumero("VII"));
	}
	
	@Test
	void convertirVIII() {
		assertEquals(8, cn.convertirLetraANumero("VIII"));
	}
	
	@Test
	void convertirIX() {
		assertEquals(9, cn.convertirLetraANumero("IX"));
	}
	
	@Test
	void convertirX() {
		assertEquals(10, cn.convertirLetraANumero("X"));
	}
	
	@Test
	void convertirNumeros10() {
		assertEquals(17, cn.convertirLetraANumero("XVII"));
		assertEquals(19, cn.convertirLetraANumero("XIX"));
		assertEquals(20, cn.convertirLetraANumero("XX"));
	}
	
	@Test
	void convertirCualquierLetra() {
		assertEquals(2024, cn.convertirLetraANumero("MMXXIV"));
		assertEquals(511, cn.convertirLetraANumero("DXI"));
	}
	

}
