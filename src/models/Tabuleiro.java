package models;

public class Tabuleiro {
	
	private char[][] celulas;
	
	public Tabuleiro() {
		celulas = new char[4][4];
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				celulas[i][j] = '-';
			}
		}
	}
	
	public boolean posicaoValida(int i, int j) {
		return i >= 1 && i < 4 && j >= 1 && j < 4;
	}
	
	public boolean posicaoOcupada(int i, int j) {
		return celulas[i][j] != '-';
	}
	
	public void marcar(int i, int j, char simbolo) {
		celulas[i][j] = simbolo;
	}
	
	public boolean estaCheio() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (celulas[i][j] == '-') {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public char[][] getCelulas() {
		return celulas;
	}
}
