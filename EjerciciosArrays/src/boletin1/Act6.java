/**
 * 
 */
package boletin1;

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
		int[] enteros = new int[7];
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("introduce numero:");
			enteros[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i]%2==0) {
				System.out.println(" numero par :" + enteros[i]);
			}
			else {
				System.out.println(" numero impar :" + enteros[i]);
			}
		}	
	}

}
