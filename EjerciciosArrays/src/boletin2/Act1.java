/**
 * 
 */
package boletin2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamayo;
		int rellenar;
		System.out.println("introduce numero:");
		tamayo = extracted().nextInt();
		int[] enteros = new int[tamayo];
		System.out.println("introduce numero:");
		rellenar = extracted().nextInt();
		Arrays.fill(enteros, rellenar);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
