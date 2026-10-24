package application;

import java.util.Scanner;

import models.Jogador;
import service.JogoService;
import view.TabuleiroView;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean jogarNovamente = true;
		
		while (jogarNovamente) {
			jogarPartida(sc);
			jogarNovamente = querJogarNovamente(sc);
		}
		
		System.out.println("Valeu por jogar!");
		sc.close();
	}

	private static void jogarPartida(Scanner sc) {
		Jogador jogador1 = new Jogador("Jogador 1", 'X');
		Jogador jogador2 = new Jogador("Jogador 2", 'O');
		JogoService jogo = new JogoService(jogador1, jogador2);
		
		boolean fimDeJogo = false;
		
		System.out.println("\n-=-=-=-=- JOGO DA VELHA -=-=-=-=-");
		TabuleiroView.exibir(jogo.getTabuleiro());
		
		while (!fimDeJogo) {
			System.out.println(jogo.getJogadorAtual().getNome() + " (" + jogo.getJogadorAtual().getSimbolo() + "), sua vez.");
			
			int linha = lerNumero(sc, "Linha (1 a 3): ");
			int coluna = lerNumero(sc, "Coluna (1 a 3): ");
			
			boolean jogadaValida  = jogo.jogar(linha, coluna);
			
			if (!jogadaValida) {
				System.out.println("[ERRO] Jogada inválida! Tente novamente.\n");
				continue;
			}
			
			TabuleiroView.exibir(jogo.getTabuleiro());
			
			if (jogo.verificarVitoria()) {
				Jogador vencedor = (jogo.getJogadorAtual() == jogador1) ? jogador2 : jogador1;
				System.out.println(vencedor.getNome() + " venceu o jogo!");
				fimDeJogo = true;
			}
			else if (jogo.verificarEmpate()) {
				System.out.println("O jogo empatou!");
				fimDeJogo = true;
			}
		}
		
	}
	
	private static boolean querJogarNovamente(Scanner sc) {
		System.out.print("\nDeseja jogar novamente? (S/N) ");
		String resposta = sc.next();
		return resposta.equalsIgnoreCase("S");
	}
	
	private static int lerNumero(Scanner sc, String msg) {
		int numero;
		
		while (true) {
			System.out.print(msg);
			
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
				break;
			}
			else {
				System.out.println("[ERRO] Digite um número válido!");
				sc.next();
			}
		}
		
		return numero;
	}

}
