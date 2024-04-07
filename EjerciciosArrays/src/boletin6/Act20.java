/**
 * 
 */
package boletin6;

/**
 * 
 */
public class Act20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "holaAdioscoma";
		int saltos = 4;
		int salto = 0;
		if (saltos % frase.length() != 0) {
			salto = 1;
		}
		String[] palabras = new String[(frase.length() / saltos) + salto];

		int indiceprincipio = 0;

		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = frase.substring(indiceprincipio, saltos);
			indiceprincipio = indiceprincipio + 4;
			saltos = saltos + 4;
			if (saltos > frase.length() - 1) {
				saltos = frase.length() - 1;
			}

		}

		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");

		}
	}
}