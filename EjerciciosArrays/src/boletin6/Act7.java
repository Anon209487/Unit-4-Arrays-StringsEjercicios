/**
 * 
 */
package boletin6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase1 = " ";
		String palabra = "caca";
		frase1 = sc.nextLine();
		int contador = contadorzero(frase1, palabra);
		System.out.println("el numero es :" + contador);
	}

	private static int contadorzero(String frase, String paalabra) {
		// TODO Auto-generated method stub
		int contador = 0;
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if ((palabras[i].compareToIgnoreCase(paalabra) == 0)) {
				contador++;
			}
		}
		return contador;

	}

}
