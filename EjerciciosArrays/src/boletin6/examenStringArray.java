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
		System.out.println("La resl es: " + ExamenSatrinArrayfunciones.fraseReal);
		System.out.println("La codificada es: " + ExamenSatrinArrayfunciones.fraseCodificada);
		boolean iguales = false;
		while (iguales == false) {

			examenStringArray.compruebaCodigo();
			iguales = ExamenSatrinArrayfunciones.sonIguales();
		}
		System.out.println("La frase era: " + ExamenSatrinArrayfunciones.fraseReal);
	}

	private static void compruebaCodigo() {
		// TODO Auto-generated method stub
		String letras;
		String coidgo;
		System.out.println("INTODUZCA LETRA Y CODIGO:");
		System.out.println("-----------------------------");
		System.out.println("letra:");
		letras = extracted().next();
		System.out.println("coidgo dos digitos:");
		coidgo = extracted().nextLine();
		char letra = letras.charAt(0);
		System.out.println(letra);
		ExamenSatrinArrayfunciones.compruebaCodigo(coidgo, letra);

		System.out.println("La frase es:" + ExamenSatrinArrayfunciones.fraseCodificada);
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
