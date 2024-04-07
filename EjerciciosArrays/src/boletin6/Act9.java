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
		String frase = "Javalín, javalón  sadgarhdasdhsertdh srehse      javalén, len, len";
		String cad2 = " ";
		boolean empieza = frase.endsWith("javalén, len, len");
		boolean termina = frase.startsWith("Javalín, javalón");
		int eliminarfinal = frase.lastIndexOf("javalén, len, len");

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
		System.out.println(empieza + "Javalín, javalón");
		System.out.println(termina + "javalén, len, len");
	}

}
