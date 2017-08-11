package Uri1916;

import java.util.Scanner;

public class Jaiminho {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Integer QT = sc.nextInt();
		
		//loop sobre a quantidade de entradas
		for (int i = 0; i < QT; i++) {
			
			Integer N  = sc.nextInt();
			
			PontoDiario[] pontos = new PontoDiario[N];
			
			//loop sobre a quantidade de pontos diarios sobre cada entrada
			for (int j = 0; j < N; j++) {
				
				sc.nextLine();
				
				String ponto = sc.nextLine();
				String[] entradas = ponto.split(" ");
				
				
				PontoDiario pontoDiario = new PontoDiario();
				pontoDiario.entradaPrimeiro = entradas [0] ;
				pontoDiario.saidaPrimeiro = entradas[1];
				pontoDiario.entradaSegundo = entradas[3] ;
				pontoDiario.saidaSegundo = entradas[4] ;
				pontos[j] = pontoDiario;
				
			}
			
			//calculando o saldo de horas sobre cada entrada
			Integer saldoHoras = 0;
			for (int j = 0; j < pontos.length; j++) {
				saldoHoras += pontos[j].calculaSaldoHoras();				
			}
			
			System.out.println(PontoDiario.converteMinutoHora(saldoHoras));
			
		}
		

	}

}
