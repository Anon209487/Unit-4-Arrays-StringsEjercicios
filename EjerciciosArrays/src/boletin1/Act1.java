/**
 * 
 */
package boletin1;

/**
 * 
 */
public class Act1 {

	/**
	 * 
	 */
	public Act1() {
		// TODO Auto-generated constructor stub
		int[] enteros = new int[9];
		for (int i = 0; i < enteros.length; i++) {
			enteros[i]=(int) (Math.floor(Math.random() * (1 + 9 + 0)));
			System.out.println(enteros[i]);
		}
	
	}

}
