package jokenpo;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		int jogador,oponente;
		Scanner teclado = new Scanner(System.in);
		System.out.println("---- Pedra, papel e tesoura ----");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Digite o número referente a sua escolha");
		
		jogador = teclado.nextInt();
		
		switch(jogador) {
		case 1:
			System.out.println("Você escolheu Pedra");
			break;
		case 2:
			System.out.println("Você escolheu Papel");
			break;
		case 3:
			System.out.println("Você escolheu Tesoura");
			break;
		default:
			System.out.println("USUÁRIO MOCORONGO! ESCOLHA APENAS DE 1 A 3!");
			break;
		}//switch
		
		teclado.close();
		
		oponente = (int)(Math.random()*3 + 1);
		switch(oponente) {
		case 1:
			System.out.println("Seu oponente escolheu Pedra");
			break;
		case 2:
			System.out.println("Seu oponente escolheu Papel");
			break;
		case 3:
			System.out.println("Seu oponente escolheu Tesoura");
			break;
		}	
		
		if (jogador == oponente) {
			System.out.println("EMPATE");
		} else {
			if((jogador == 1 && oponente == 3) || (jogador == 2 && oponente == 1) || (jogador == 3 && oponente == 2)){
				System.out.println("VOCÊ GANHOU!");
			} else {
				System.out.println("VOCÊ PERDEU");
		   }//else2
		}//else1
	}//main
  }

