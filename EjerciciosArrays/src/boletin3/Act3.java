/**
 * 
 */
package boletin3;

import java.util.Scanner;

/**
 * 
 */
public class Act3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud;
		int fin;
		System.out.println("introduce numero:");
		fin = extracted().nextInt();
		longitud = extracted().nextInt();
		int[] enteros = rellenaPares(longitud, fin);
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	private static int[] rellenaPares(int longitud, int fin) {
		int par = 0;
		int contador = 0;
		int[] enteros = new int[longitud];
		while (contador != enteros.length) {
			par = (int) (Math.floor(Math.random() * (2 + fin)));
			if (par % 2 == 0) {
				enteros[contador] = par;
				contador++;
			}
		}

		return enteros;

	}

}
