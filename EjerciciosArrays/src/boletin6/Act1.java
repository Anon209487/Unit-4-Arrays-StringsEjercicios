/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String frase1 = "";
		String frase2 = "";
		int longitudfrase2;
		int longitudfrase1;
		System.out.println("introduzca frase1");
		frase2 = sc.nextLine();
		System.out.println("introduzca frase1");
		frase1 = sc.nextLine();

		longitudfrase1 = frase1.length();
		longitudfrase2 = frase2.length();
		if (longitudfrase1 > longitudfrase2) {
			System.out.println("la frase mas larga es:" + frase1);

		} else if (longitudfrase1 == longitudfrase2) {
			System.out.println("la frases son iguales ");
		} else {
			System.out.println("la frase mas larga es:" + frase2);
		}

	}

}
