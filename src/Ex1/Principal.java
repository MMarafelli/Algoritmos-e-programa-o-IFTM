package Ex1;

import java.util.Scanner;

public class Principal {

	static Aluno alunos[] = new Aluno[20];

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe quantos alunos serão inseridos");

		Integer quantosAlunos = sc.nextInt();

		for (int j = 0; j < quantosAlunos; j++) {

			alunos[j] = lerAluno();

			imprimirAlunos();

		}

		sc.close();
	}

	private static Aluno lerAluno() {

		Aluno aluno = new Aluno();

		sc.nextLine();

		System.out.println("Inserindo novo aluno");
		System.out.println("Digite o R.A. :");

		aluno.ra = sc.nextLine();

		System.out.println("Digite o nome");
		aluno.nome = sc.nextLine();

		System.out.println("Informe quantos telefones serão inseridos");
		Integer quantosTelefones = sc.nextInt();
		for (int i = 0; i < quantosTelefones; i++) {

			aluno.telefones[i] = lerTelefone(i);
		}

		return aluno;

	}

	private static Telefone lerTelefone(int i) {

		Telefone telefone = new Telefone();

		sc.nextLine();

		System.out.println("Digite o tipo do telefone " + i);
		telefone.tipo = sc.nextLine();

		System.out.println("Digite o numero do telefone " + i);
		telefone.numero = sc.nextLine();

		return telefone;

	}

	private static void imprimirAlunos() {
		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null) {

				System.out.println("imprimindo aluno de posição " + i);

				System.out.println("Nome: " + alunos[i].nome);

				System.out.println("RA: " + alunos[i].ra);

				System.out.println("Email: " + alunos[i].email);

				for (int j = 0; j < alunos[i].telefones.length; j++) {

					if (alunos[i].telefones[j] != null) {

						System.out.println("Telefone: ");
						System.out.println("Tipo: " + alunos[i].telefones[j].tipo);
						System.out.println("Número: " + alunos[i].telefones[j].numero);
					}

				}
			}

		}
	}

}
