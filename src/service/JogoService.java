package service;

import models.Jogador;
import models.Tabuleiro;

public class JogoService {
	
	private Tabuleiro tabuleiro;
	private Jogador jogador1;
	private Jogador jogador2;
	private Jogador jogadorAtual;
	
	public JogoService(Jogador jogador1, Jogador jogador2) {
		this.tabuleiro = new Tabuleiro();
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.jogadorAtual = jogador1;
	}
	
	public boolean jogar(int i, int j) {
		
		if (!tabuleiro.posicaoValida(i, j) || tabuleiro.posicaoOcupada(i, j)) {
			return false;
		};
		
		tabuleiro.marcar(i, j, jogadorAtual.getSimbolo());
		trocarTurno();
		return true;
	}
	
	public void trocarTurno() {
		jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
	}
	
	public boolean verificarVitoria() {
		
		char[][] celulas = tabuleiro.getCelulas();
		
		char simbolo = (jogadorAtual == jogador1) ? jogador2.getSimbolo() : jogador1.getSimbolo();
		
		for (int i = 1; i < 4; i++) {
			
			if (celulas[i][1] == simbolo && celulas[i][2] == simbolo && celulas[i][3] == simbolo) {
				return true;
			}
			
			if (celulas[1][i] == simbolo && celulas[2][i] == simbolo && celulas[3][i] == simbolo) {
				return true;
			}
			
			if (celulas[1][1] == simbolo && celulas[2][2] == simbolo && celulas[3][3] == simbolo) {
				return true;
			}
			
			if (celulas[1][3] == simbolo && celulas[2][2] == simbolo && celulas[3][1] == simbolo) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean verificarEmpate() {
		return tabuleiro.estaCheio() && !verificarVitoria();
	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public Jogador getJogadorAtual() {
		return jogadorAtual;
	}
}
