/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase = "";
		System.out.println("intoduca frase ");
		frase = sc.nextLine();
		String frasereversa = contadorzero(frase);

		System.out.println(frasereversa);
	}

	private static String contadorzero(String frase) {
		// TODO Auto-generated method stub
		int contador = 0;
		char[] letras = frase.toCharArray();
		for (int i = frase.length() - 1; i >= 0; i--) {
			letras[i] = frase.charAt(contador);
			contador++;
		}
		frase = String.valueOf(letras);
		return frase;

	}
}