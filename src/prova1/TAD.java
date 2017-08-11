package prova1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TAD {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		String adicionar =  sc.nextLine().toUpperCase();
		do {
			System.out.println("Deseja adicionar um novo cliente? (S/N)");
			adicionar = sc.next();
			if (adicionar.equals("S")){
				Cliente novoCliente = lerCliente();
				clientes.add(novoCliente);
			}
		} while (adicionar.equals("S"));	
		
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println("Imprimindo o cliente da posiçao " +  i + " - " + clientes.get(i));
			
/*			System.out.println("Imprimindo o cliente da posiçao " +  i);
			System.out.println("Nome: " +  clientes.get(i).nome);
			System.out.println("Idade: " +  clientes.get(i).idade);
			System.out.println("CPF: " +  clientes.get(i).cpf);
			System.out.println("Telefone: " +  clientes.get(i).telefone);*/
			
		}
		
		
	sc.close();
	}

	private static Cliente lerCliente() {
		Cliente cliente = new Cliente();
		System.out.println("Digite o CPF");
		cliente.cpf = sc.nextLine();
		System.out.println("Digitea a Idade");
		cliente.idade = sc.nextInt();
		System.out.println("Digite o nome");
		sc.nextLine();
		cliente.nome = sc.nextLine();
		System.out.println("Dgite o telefone");
		cliente.telefone = sc.nextLine();
		return cliente;

	}

}

class Cliente {
	String cpf;
	Integer idade;
	String nome;
	String telefone;
	
	public String toString(){
		return "CPF " + cpf + "Idade " + idade + "Nome " + nome + " Telefone " + telefone;
	}
}