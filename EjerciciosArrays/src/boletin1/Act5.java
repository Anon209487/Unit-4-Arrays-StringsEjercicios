/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Act5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[9];
		int suma = 0;
		int minimo = 0;
		int maximo = 0;
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("introduce numero:");
			enteros[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0; i < enteros.length; i++) {
			suma = enteros[i] + suma;
			if (minimo > enteros[i]) {
				minimo = enteros[i];
			}
			if (maximo < enteros[i]) {
				maximo = enteros[i];
			}
		}
		System.out.println("suma: " + suma + " maximo: " + maximo + " minimo: " + minimo);
	}

}
