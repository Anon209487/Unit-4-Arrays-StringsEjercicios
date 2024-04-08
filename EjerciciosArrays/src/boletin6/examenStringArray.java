/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class examenStringArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamenSatrinArrayfunciones.desordenaAbecedario();
		ExamenSatrinArrayfunciones.eligeFrase();
		ExamenSatrinArrayfunciones.codificaFrase();
		/**
		 * 
		 * for (int i = 0; i < ExamenSatrinArrayfunciones.abeceario.length; ++i) { for
		 * (int j = 0; j < ExamenSatrinArrayfunciones.abeceario[i].length; ++j) {
		 * System.out.println(ExamenSatrinArrayfunciones.abeceario[i][j]); } }
		 */

		// System.out.println(ExamenSatrinArrayfunciones.fraseReal);
		// System.out.println(ExamenSatrinArrayfunciones.fraseCodificada);
		boolean iguales = false;
		while (iguales == false) {
			System.out.println("OPCIONES:");
			examenStringArray.compruebaCodigo();
			iguales = ExamenSatrinArrayfunciones.sonIguales();
		}
		System.out.println("La frase era " + ExamenSatrinArrayfunciones.fraseReal);
	}

	private static void compruebaCodigo() {
		// TODO Auto-generated method stub
		String letras;
		int coidgo;

		System.out.println("letra");
		letras = extracted().next();
		System.out.println("coidgo");
		coidgo = extracted().nextInt();
		char letra = letras.charAt(0);
		System.out.println(letra);
		ExamenSatrinArrayfunciones.compruebaCodigo(coidgo, letra);
		System.out.println("ha acertado? " + ExamenSatrinArrayfunciones.compruebaCodigo(coidgo, letra));
		System.out.println("La frase es " + ExamenSatrinArrayfunciones.fraseCodificada);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
