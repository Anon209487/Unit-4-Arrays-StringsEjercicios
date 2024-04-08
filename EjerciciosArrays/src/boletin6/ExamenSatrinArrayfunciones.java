/**
 * 
 */
package boletin6;

import java.util.Random;

/**
 * 
 */
public class ExamenSatrinArrayfunciones {
	public static char[][] abeceario = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
			{ 'm', 'n', 'o' }, { 'p', 'q', 'r' }, { 's', 't', 'u' }, { 'v', 'w', 'x' }, { 'y', 'z', 'ñ' } };
	static String[] frases = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia" };
	static String fraseReal = "";
	static String fraseCodificada = "";

	public static void desordenaAbecedario() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int i = 0;
		for (int j : random.ints(abeceario.length, 0, abeceario.length).toArray()) {
			swap(abeceario, i++, j);
		}
	}

	protected static <T> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void eligeFrase() {
		// TODO Auto-generated method stub
		int ramdom = (int) (Math.floor(Math.random() * (0 + frases.length)));
		fraseReal = frases[ramdom];
	}

	public static void codificaFrase() {
		String fraseRealtemporal = fraseReal.replace(" ", "");
		char[] letrasFraseReal = fraseRealtemporal.toCharArray();
		int contador = 0;

		String tabla = "";
		String columna = "";
		String codigo = "";
		fraseCodificada = "";
		while (contador < letrasFraseReal.length) {
			for (int i = 0; i < abeceario.length; i++) {
				for (int j = 0; j < 2; j++) {
					if (letrasFraseReal[contador] == abeceario[i][j]) {
						columna = String.valueOf(i);
						tabla = String.valueOf(j);
						codigo = (tabla + columna);

					}
				}
			}

			fraseCodificada = fraseCodificada + " " + codigo;
			contador++;
		}

	}

	public static void compruebaCodigo(String codigo, char letrachar) {

		String columna;
		String tabla;
		String letra = "";
		for (int i = 0; i < abeceario.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (letrachar == abeceario[i][j]) {
					columna = String.valueOf(i);
					tabla = String.valueOf(j);
					letra = String.valueOf(letrachar);
					fraseCodificada = fraseCodificada.replace(columna + tabla, letra);

				}
			}

		}

	}

	public static boolean sonIguales() {
		boolean sonIguales = false;
		String fraseRealtemporal = fraseReal.replace(" ", "");
		String fraseCodificadaltemporal = fraseCodificada.replace(" ", "");
		if (fraseRealtemporal.equalsIgnoreCase(fraseCodificadaltemporal)) {
			sonIguales = true;
		}

		return sonIguales;

	}

}
