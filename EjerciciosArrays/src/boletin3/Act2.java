/**
 * 
 */
package boletin3;

/**
 * 
 */
public class Act2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros = new int[9];
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = (int) (Math.floor(Math.random() * (1 - 0 + 100)));

		}

		System.out.println("el numero maximo es :" + Act2.maximo(enteros));
	}

	public static int maximo(int enteros[]) {
		int maximo = 0;
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] > maximo) {
				maximo = enteros[i];
			}

		}
		return maximo;

	}
}
