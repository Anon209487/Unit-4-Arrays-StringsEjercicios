/**
 * 
 */
package boletin6;

import java.util.Iterator;

/**
 * 
 */
public class Act19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "hola mundo programa";
		String[] palabras = frase.split(" ");
		for (int i = 1; i < palabras.length; i++) {
			String cad2 = palabras[i].substring(0, 1);
			String cad3 = cad2.toUpperCase();
			palabras[i] = palabras[i].replace(cad2, cad3);
		}

		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i]);

		}
	}

}
