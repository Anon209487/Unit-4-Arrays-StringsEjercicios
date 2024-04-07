/**
 * 
 */
package boletin6;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class Act14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase = "Dabale arroz a la zorra el abad";

		frase = frase.toLowerCase();
		char[] letras = frase.toCharArray();
		int contadorletra = 0;
		for (int x = 0; x < letras.length; x++) {
			contadorletra = 0;
			if (x == frase.indexOf(frase.charAt(x))) {

				for (int i = 0; i < letras.length; i++) {
					if (frase.charAt(x) == frase.charAt(i)) {
						contadorletra++;
					}

				}
				System.out.println("el numero es :" + contadorletra + " la letra " + frase.charAt(x));
			}
		
		}
	}
}
