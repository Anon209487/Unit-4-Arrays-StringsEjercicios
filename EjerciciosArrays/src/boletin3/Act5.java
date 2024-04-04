/**
 * 
 */
package boletin3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Act5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int clave = 0;
		int[] enteros = new int[9];
		System.out.println("introduce clave:");
		clave = extracted().nextInt();
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 + 2 + 0)));
		}
		System.out.println(Arrays.toString(enteros));
		int[] indice = buscarTodos(enteros, clave);
		System.out.println(Arrays.toString(indice));
	}

	public static int[] buscarTodos(int t[], int clave) {
		int[] enteros = new int[9];
		int contador = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				enteros[contador] = i;
				contador++;
			}

		}

		return enteros;

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
