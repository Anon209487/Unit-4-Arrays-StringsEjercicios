/**
 * 
 */
package boletin5;

import java.util.Scanner;

/**
 * 
 */
public class Act2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] alumnos = new int[3][4];
		int notaminima = 10000000;
		int notamaxima = 0;
		int media = 0;
		for (int i = 0; i < alumnos.length; ++i) {
			for (int j = 0; j < alumnos[i].length; ++j) {
				System.out.println("introduce numero entre 1 y 10:");
				alumnos[i][j] = new Scanner(System.in).nextInt();
			}
		}
		for (int i = 0; i < alumnos.length; ++i) {
			for (int j = 0; j < alumnos[i].length; ++j) {
				if (alumnos[i][j] > notamaxima) {
					notamaxima = alumnos[i][j];
				} else if (alumnos[i][j] < notaminima) {
					notaminima = alumnos[i][j];
				}
				media = media + alumnos[i][j];
			}
			media = media / 4;
			System.out.println("la nota del alumnonumero" + i + " notaminima: " + notaminima + " notamaxima: "
					+ notamaxima + " media: " + media);
			notaminima = 10;
			notamaxima = 0;
			media = 0;
		}
	}
}
