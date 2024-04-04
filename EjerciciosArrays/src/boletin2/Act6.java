/**
 * 
 */
package boletin2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorBuscar;
		int numVcecesValor = 0;
		int[] enteros = new int[99];
		valorBuscar = extracted().nextInt();

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 - 100 + 1)));
		}
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] == valorBuscar) {
				numVcecesValor++;
			}
			int posicion = Arrays.binarySearch(enteros, valorBuscar);
			if (posicion == 0) {
				System.out.println("no se ha encontrado ");
			} else {
				System.out.println("se ha encontrado un total de: " + numVcecesValor + " veces");
			}
		}

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
