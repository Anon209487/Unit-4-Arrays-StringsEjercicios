/**
 * 
 */
package boletin6;

import java.util.Scanner;

/**
 * 
 */
public class ExamenString {
	public static String[] palabras = { "humanidad", "persona", "hombre", "mujer", "individuo", "cuerpo", "pierna",
			"cabeza", "brazo", "familia" };
	final static int NUMINTENTOS = 7;
	static String palabraSecreta = "";
	static String palabraPista = "";
	static String noAcertadas = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intententos = 0;
		generaPalabra();
		pintaPista();
		while (intententos < NUMINTENTOS) {

			intententos = menu() + intententos;

		}
		System.out.println("Has superado el numero de intentos...");
	}

	public static void generaPalabra() {
		// TODO Auto-generated method stub
		int aleatorio = (int) (Math.floor(Math.random() * (0 + palabras.length)));
		palabraSecreta = palabras[aleatorio];

	}

	public static void pintaPista() {
		// TODO Auto-generated method stub
		String pista = "";
		for (int i = 0; i < palabraSecreta.length(); i++) {
			pista = pista + " " + "*";
		}
		System.out.println(pista);
	}

	public static int menu() {
		// TODO Auto-generated method stub
		String letra = "";
		int opcion = 0;
		String palabra = "";

		System.out.println(" Seleccione una de las siguientes opciones:");
		System.out.println("1: Introducir letra.");
		System.out.println("2: Introducir palabra.");
		opcion = extracted().nextInt();
		switch (opcion) {
		case 1: {
			System.out.println(" Introducir letra.");
			letra = extracted().nextLine();
			if (palabra != null) {
				compruebaLetra(letra);
			}
			break;
		}
		case 2: {
			System.out.println("Introducir palabra.");
			palabra = extracted().nextLine();
			if (palabra != null && !palabra.equals("")) {
				compruebaPalabra(palabra);
			}
			break;
		}
		}
		return 7;

	}

	public static void compruebaLetra(String letra) {
		// TODO Auto-generated method stub
		char letraclave = letra.charAt(0);
		String fraseRealtemporal = palabraSecreta.replace(" ", "");
		String fraseCodificadaltemporal = palabraPista.replace(" ", "");
		char[] letras = fraseRealtemporal.toCharArray();
		char[] letraspintaPista = fraseCodificadaltemporal.toCharArray();

		for (int i = 0; i < letraspintaPista.length; i++) {
			if (letras[i] == letraclave) {
				letraspintaPista[i] = letras[i];
			}

		}
		for (int i = 0; i < letraspintaPista.length; i++) {
			fraseCodificadaltemporal = letraspintaPista[i] + " " + fraseCodificadaltemporal;
		}
		System.out.println(fraseCodificadaltemporal);
	}

	public static void compruebaPalabra(String palabra) {
		// TODO Auto-generated method stub
		if (palabra.equalsIgnoreCase(palabraSecreta)) {
			System.out.println("HAS ACERTADO!");

		}
	}

	public static Scanner extracted() {
		return new Scanner(System.in);
	}

}
