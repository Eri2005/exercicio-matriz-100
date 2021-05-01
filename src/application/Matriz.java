package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe as Linhas e Colunas da Matriz: ");
		int lines = sc.nextInt();
		int columns = sc.nextInt();
		
		int[][] mat = new int[lines][columns];
		
		System.out.println("Informe as Matrizes:");
		
		for(int i = 0; i < mat.length; i++) { //lines
			for(int j = 0; j < mat[i].length; j++ ) { //columns
				
				//Vai receber os numeros para a Matriz e armazenar nas variaveis
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Qual o numero deseja pesquisar? ");
		int x = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				
				// Ira comparar se o numero esta dentro da Matriz
				
				if(mat[i][j] == x) {
					System.out.println("O numero "+ x +" esta Position: " + i + "," + j + ":");
					
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("UP: " + mat[i-1][j]);
					}
					
					if(j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j] + "\n");
					}
				}
			}
		}
		sc.close();
	}
}

