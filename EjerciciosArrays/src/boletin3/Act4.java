/**
 * 
 */
package boletin3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int clave = 0;
		int[] enteros = new int[9];
		System.out.println("introduce clave:");
		clave = extracted().nextInt();
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 + 9 + 0)));
		}
		System.out.println("La posicion es :" + buscar(enteros, clave));
	}

	public static int buscar(int t[], int clave) {
		Arrays.sort(t);
		int res = Arrays.binarySearch(t, clave);
		return res;
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
