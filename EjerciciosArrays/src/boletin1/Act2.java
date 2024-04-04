/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Act2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] enteros = new int[4];
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("introduce numero:");
			enteros[i] = new Scanner(System.in).nextInt();

		}
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);

		}
		System.out.println(enteros.toString());
	}

}
