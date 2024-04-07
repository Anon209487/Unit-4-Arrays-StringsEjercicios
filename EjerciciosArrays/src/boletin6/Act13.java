/**
 * 
 */
package boletin6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase2 = "";
		String frase = "";
		System.out.println("intoduca frase ");
		frase = sc.nextLine();
		System.out.println("intoduca frase ");
		frase2 = sc.nextLine();

		char[] letras = frase.toCharArray();
		char[] letras2 = frase2.toCharArray();
		Arrays.sort(letras);
		Arrays.sort(letras2);
		frase2 = String.valueOf(letras);
		frase = String.valueOf(letras2);
		if (frase.compareToIgnoreCase(frase2) == 0) {
			System.out.println("son palindroma");
		}
		else  {
			System.out.println(" no son palindroma");
		}

	}
}
