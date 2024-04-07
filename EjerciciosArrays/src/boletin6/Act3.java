/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase = "";
		System.out.println("intoduca frase ");
		frase = sc.nextLine();
		int contadorzero = contadorzero(frase);

		System.out.println("el numero espacio es:" + contadorzero);
	}

	private static int contadorzero(String frase) {
		// TODO Auto-generated method stub
		int contadorzero = 0;
		char letra;
		for (int i = 0; i < frase.length(); i++) {
			letra = frase.charAt(i);
			if (letra == ' ') {
				contadorzero++;
			}
		}
		return contadorzero;

	}

}
