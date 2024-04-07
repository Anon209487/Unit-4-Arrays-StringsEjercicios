/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		String palabra = "caca pedo culosss";
		contadorzero(palabra);

	}

	private static void contadorzero(String frase) {
		// TODO Auto-generated method stub
		int contador = 0;
		int longitudmaxima = 0;
		String palabralarga = "";
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if ((palabras[i].length()) > longitudmaxima) {
				longitudmaxima = palabras[i].length();
				palabralarga = palabras[i];

			}
		}
		System.out.println("el numero es :" + palabralarga + " " + longitudmaxima);

	}
}
