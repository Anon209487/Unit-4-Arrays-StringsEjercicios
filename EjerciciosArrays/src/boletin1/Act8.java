/**
 * 
 */
package boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Act8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] enteros = new int[99];
		int numerobuscar;
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 + 100 + 0)));
			System.out.println(false);
		}
		System.out.println("introduce numero:");
		numerobuscar = extracted().nextInt();
		
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] == numerobuscar) {
				System.out.println("La poscicion es:" + i);
			}

		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
