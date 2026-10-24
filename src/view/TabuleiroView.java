package view;

import models.Tabuleiro;

public class TabuleiroView {
	
	public static void exibir(Tabuleiro tabuleiro) {
		char[][] celulas = tabuleiro.getCelulas();
		System.out.println();
		for (int i = 1; i < 4; i++) {
			System.out.println(" " + celulas[i][1] + " | " + celulas[i][2] + " | " + celulas[i][3]);
			if (i < 3) {
				System.out.println("---+---+---");
			}
		}
		
		System.out.println();
	}
	
}
