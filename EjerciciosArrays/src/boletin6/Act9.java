/**
 * 
 */
package boletin6;

/**
 * 
 */
public class Act9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Javal�n, javal�n  sadgarhdasdhsertdh srehse      javal�n, len, len";
		String cad2 = " ";
		boolean empieza = frase.endsWith("javal�n, len, len");
		boolean termina = frase.startsWith("Javal�n, javal�n");
		int eliminarfinal = frase.lastIndexOf("javal�n, len, len");

		if (termina == true) {
			System.out.println(eliminarfinal);
			cad2 = frase.substring(0, eliminarfinal);
			System.out.println(cad2);
		}
		if (empieza == true) {
			cad2 = cad2.substring(16, cad2.length());
		}
		cad2 = cad2.trim();
		System.out.println(cad2);
		System.out.println(empieza + "Javal�n, javal�n");
		System.out.println(termina + "javal�n, len, len");
	}

}
