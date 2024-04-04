/**
 * 
 */
package boletin2;

import java.util.Arrays;
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
		int[] enteros = new int[10];
		int[] enteros2 = new int[10];
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("introduce numero:");
			enteros[i] = new Scanner(System.in).nextInt();

		}
		for (int i = 0; i < enteros2.length; i++) {
			System.out.println("introduce numero:");
			enteros2[i] = new Scanner(System.in).nextInt();

		}
		System.out.println("SON IGUALES? : " + Arrays.equals(enteros2, enteros));
	}

}
