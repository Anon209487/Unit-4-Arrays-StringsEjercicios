/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase = "Dabale arroz a la zorra el abad";
		boolean palindromra = contadorzero(frase);

		System.out.println(palindromra);

	}

	private static boolean contadorzero(String frase) {
		// TODO Auto-generated method stub
		int contador = 0;
		boolean palindromra = true;
		String[] frase2 = frase.split(" ");
		frase = " ";
		for (int i = 0; i < frase2.length; i++) {
			frase = frase + frase2[i];
		}
		frase = frase.toLowerCase();
		char[] letras = frase.toCharArray();
		for (int i = frase.length() - 1; i >= 0; i--) {
			if (letras[i] != frase.charAt(contador)) {
				palindromra = false;
			}

			contador++;
		}
		frase = String.valueOf(letras);
		System.out.println(frase);
		return palindromra;

	}
}
