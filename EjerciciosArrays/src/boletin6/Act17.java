/**
 * 
 */
package boletin6;

/**
 * 
 */
public class Act17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "/* igual a tres */ a++; /* incrementamos a */\r\n";
		frase = frase.replace("/*", " ");
		frase = frase.replace("*/", " ");
		System.out.println(frase);
	}

}
