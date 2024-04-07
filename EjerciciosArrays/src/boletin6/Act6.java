/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase2 = "";
		String frase = "";
		int x = 0;
		while (x == 0) {
			System.out.println("intoduca frase ");
			frase = sc.nextLine();
			if (frase.compareToIgnoreCase("fin") == 0) {
				x = 1;
			} else {
				frase2 = frase2 + " " + frase;
			}

		}
		System.out.println(frase2);
	}

}
 