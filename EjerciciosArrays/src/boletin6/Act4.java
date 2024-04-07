/**
 * 
 */
package boletin6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class Act4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase1 = "caca  pedo pis";

		String[] palabras = contadorzero(frase1);

		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " , ");
		}

	}

	private static String[] contadorzero(String frase) {
		// TODO Auto-generated method stub
		String[] palabras = frase.split(" ");
		Arrays.sort(palabras);
		return palabras;

	}
}