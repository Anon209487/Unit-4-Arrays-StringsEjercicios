/**
 * 
 */
package examenarraysystring;

import java.util.Iterator;
import java.util.Random;

/**
 * 
 */
public class CriptogramasFunciones {
	public static char[][] abecedario = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
			{ 'm', 'n', 'ñ' }, { 'o', 'p', 'q' }, { 'r', 's', 't' }, { 'u', 'v', 'w' }, { 'x', 'y', 'z' } };
	public static String[] frases = {
			"las guerras seguiran mientras el color de la piel siga siendo mas importante que el de los ojos",
			"aprende a vivir y sabras morir bien", "cada dia sabemos mas y entendemos menos",
			"el dinero no puede comprar la vida", "la verdadera sabiduria esta en reconocer la propia ignorancia" };
	public static String fraseReal = "";
	public static String fraseCodificada = "";

	public static void desordenaAbecedario() {
		Random random = new Random();
		int i = 0;
		for (int j : random.ints(abecedario.length, 0, abecedario.length).toArray()) {
			swap(abecedario, i++, j);
		}
	}

	protected static <T> void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void eligeFrase() {
		int indiceAleatorio = (int) (Math.floor(Math.random() * (1 + frases.length - 1)));
		fraseReal = frases[indiceAleatorio];

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
			for (int i = 0; i < abecedario.length; i++) {
				for (int j = 0; j < 2; j++) {
					if (letrasFraseReal[contador] == abecedario[i][j]) {
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

	public static void compruebaCodigo() {

	}

	public static boolean sonIguales() {

		return false;

	}
}
