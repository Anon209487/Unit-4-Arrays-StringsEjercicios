/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class Act2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase1 = "caca";
		String frase2 = "";

		char[] letrasfrase1 = frase1.toCharArray();
		char[] letrasfrase2;
		char[] frasecofigo = frase1.toCharArray();
		int longitudfrase2;
		int longitudfrase1;

		longitudfrase1 = frase1.length();
		while (frase1.compareToIgnoreCase(frase2) != 0) {

			System.out.println("introduzca contasenya");
			frase2 = new Scanner(System.in).nextLine();

			longitudfrase2 = frase2.length();
			if (longitudfrase1 > longitudfrase2) {
				System.out.println("la frase es mas larga:");

			} else if (longitudfrase1 == longitudfrase2) {
				System.out.println("la frase es igual de larga");
			} else {
				System.out.println("la frase es mas corta ");
			}
			for (int i = 0; i < frase1.length(); i++) {
				letrasfrase2 = frase2.toCharArray();
				if (i < frase2.length() && letrasfrase2[i] == letrasfrase1[i]) {
					frasecofigo[i] = letrasfrase1[i];
				} else {
					frasecofigo[i] = '*';
				}
			}
			for (int i = 0; i < frasecofigo.length; i++) {
				System.out.print(frasecofigo[i] + " ");
			}

		}
		System.out.println("win ");

	}

}
