package com.prueba.junit.romanos;

import java.util.HashMap;
import java.util.Map;

public class ConvertirNumeros {

	public static void main(String[] args) {

		int[] numero = { 8, 1, 3, 5, 2, 6, 7 };

		String[] letras = { "l", "a", "b", "r" };

		int[][] matriz = { { 3, 2, 1 }, { 8, 9, 0 }, { 3, 2, 4 } };

		int[][] grilla = new int[10][10];

		int suma = 0;
		for (int i = 0; i < numero.length; i++) {
			suma += numero[i];
		}
		System.out.println("Promedio: " + suma + "Promedio: " + numero.length);
		double promedio = suma/numero.length;
		System.out.println("Promedio: " + promedio);

		for (int i = 0; i < grilla.length; i++) {
			for (int j = 0; j < grilla[i].length; j++) {
				System.out.printf("%2s ", "-");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}

		for (int i = 0; i < letras.length; i++) {
			for (int j = 0; j < letras.length - 1; j++) {
				if (letras[j + 1].compareTo(letras[j]) < 0) {
					String aux = letras[j];
					letras[j] = letras[j + 1];
					letras[j + 1] = aux;
				}
			}
		}

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
	}

	public ConvertirNumeros() {
		this.equivalencias.put('I', 1);
		this.equivalencias.put('V', 5);
		this.equivalencias.put('X', 10);
		this.equivalencias.put('L', 50);
		this.equivalencias.put('C', 100);
		this.equivalencias.put('D', 500);
		this.equivalencias.put('M', 1000);
	}

	private Map<Character, Integer> equivalencias = new HashMap<>();

	public Integer convertirLetraANumero(String letra) {
		return contar(letra);
	}

	private int contar(String letras) {
		int cuenta = 0;
		for (int i = 0; i < letras.length(); i++) {
			int valorLetra = equivalencias.get(letras.charAt(i));
			if (i + 1 < letras.length() && valorLetra < equivalencias.get(letras.charAt(i + 1))) {
				cuenta -= valorLetra;
			} else {
				cuenta += valorLetra;
			}
		}
		return cuenta;
	}

}
