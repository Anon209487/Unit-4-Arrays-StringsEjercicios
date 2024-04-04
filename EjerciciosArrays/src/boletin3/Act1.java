/**
 * 
 */
package boletin3;

/**
 * 
 */
public class Act1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[9];
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 + 100 + 0)));

		}

		System.out.println(" la suma es :" + sumarTabla(enteros));
	}

	public static int sumarTabla(int[] tabla) {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma = suma + tabla[i];
		}

		return suma;

	}
}
