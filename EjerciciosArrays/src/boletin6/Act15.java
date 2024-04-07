/**
 * 
 */
package boletin6;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class Act15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// TODO Auto-generated method stub
		String frase1 = "hola";
		char[] letrasfrase1 = frase1.toCharArray();
		char[] letrasfrase2;
		char[] frasecofigo = frase1.toCharArray();
		frase1 = frase1.toLowerCase();
		char[] letras = frase1.toCharArray();

		int contadorletra = 0;
		int index;
		Random random = new Random();
		for (int i = letras.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			if (index != i) {
				letras[index] ^= letras[i];
				letras[i] ^= letras[index];
				letras[index] ^= letras[i];
			}
		}
		String frase2 = String.valueOf(letras);
		System.out.println(frase2);

		while (frase1.compareToIgnoreCase(frase2) != 0) {

			System.out.println("introduzca contasenya");
			frase2 = sc.nextLine();
			
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
