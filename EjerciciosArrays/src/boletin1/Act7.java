/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Act7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] enteros = new double[7];
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("introduce numero:");
			enteros[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
