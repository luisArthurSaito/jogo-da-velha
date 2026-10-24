# 🎮 Jogo da Velha em Java

Jogo da velha para dois jogadores, executado inteiramente no terminal (CLI), desenvolvido em Java com **Programação Orientada a Objetos**. Projeto acadêmico da disciplina de POO.

## 📋 Sobre o projeto

O jogo permite que dois jogadores se alternem em um tabuleiro 3x3 até que haja um vencedor ou empate. Todo o jogo roda no console, sem interface gráfica.

## ✨ Funcionalidades

- Tabuleiro 3x3 representado por uma matriz
- Alternância de turnos entre os jogadores
- Verificação de vitória (linhas, colunas e diagonais)
- Detecção de empate
- Validação de jogadas inválidas

## 🏗️ Arquitetura

O projeto é organizado em camadas:

- **Aplicação** (`application`): ponto de entrada e fluxo principal do programa
- **Modelos** (`models`): entidades do jogo (`Tabuleiro`, `Jogador`)
- **Serviço** (`service`): regras do jogo (turnos, vitória, empate)
- **Visualização** (`view`): exibição do tabuleiro e mensagens no console

## 🧩 Principais desafios

- Montar o tabuleiro usando matriz
- Alternar os turnos entre os jogadores
- Verificar as condições de vitória e de empate

## 🛠️ Tecnologias

- Java 21
- Eclipse IDE

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/luisArthurSaito/jogo-da-velha.git
```

2. Importe o projeto no Eclipse (File → Import → Existing Projects into Workspace).
3. Execute a classe `Main`, que fica no pacote `application`.

## 📚 Contexto acadêmico

Trabalho desenvolvido para a disciplina de Programação Orientada a Objetos (UniAnchieta).