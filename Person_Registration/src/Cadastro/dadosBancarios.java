package Cadastro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class dadosBancarios extends Attributes_getsetts{
	Scanner entrada = new Scanner (System.in);
	ArrayList<dadosBancarios> listaDados = new ArrayList<>();
	
	public void inserir() {
		do {
			
			dadosBancarios dados = new dadosBancarios();
			System.out.print("CPF do cliente: ");
			cpf = entrada.nextInt();
			entrada.nextLine();
			dados.setCpf(cpf);

			System.out.print("Nome do cliente: ");
			nome = entrada.nextLine();
			dados.setNome(nome);

			System.out.print("Número da conta: ");
			numeroConta = entrada.nextInt();
			dados.setNumeroConta(numeroConta);

			System.out.print("Agencia do cliente: ");
			agencia = entrada.nextInt();
			dados.setAgencia(agencia);
			
			listaDados.add(dados);

			System.out.println("CADASTRO FEITO COM SUCESSO!");
			System.out.println("Deseja cadastrar outro cliente no sistema? [s/n]");
			str = entrada.next();
		} while (str.equals("s"));
		
	}
	
	public void exibir() {
		
			if (listaDados.isEmpty()) {
				System.out.println("Não existe contas cadastradas no sistema ainda");
			}
			
			for (dadosBancarios  dados : listaDados) {
				System.out.println("CPF: " + dados.getCpf());
				System.out.println("Nome: " + dados.getNome());
				System.out.println("Número da conta: " + dados.getNumeroConta());
				System.out.println("Agencia: " + dados.getAgencia());
				System.out.println("---------------------------------------------------------");
			}
		}

	public void pesquisar() {
		dadosBancarios d = new dadosBancarios();	
		if(listaDados.isEmpty()) {
			System.out.println("Não existe dados cadastrados no sistema ainda");
		}else {
			System.out.print("Digite o CPF da conta que deseja pesquisar: ");
			cpf = entrada.nextInt();
	
			for(dadosBancarios dados: listaDados) {
				if(dados.getCpf() == cpf) {
				d=dados;	
					System.out.println("---------------------------------------------------------|");
					System.out.println("INFORMAÇÕES DA CONTA " + dados.getNome().toUpperCase());
					System.out.println("---------------------------------------------------------|");
					System.out.println("CPF: " + dados.getCpf());
					System.out.println("Nome: " + dados.getNome());
					System.out.println("Número da conta: " + dados.getNumeroConta());
					System.out.println("Agencia: " + dados.getAgencia());
					System.out.println("---------------------------------------------------------");
				}
				if(d.getCpf() != cpf) {
					System.out.println("CPF inválido, digite um válido");
				}
			}
			
		}
	}	
	
	public void atualizar() {

		if (listaDados.isEmpty()) {
			System.out.println("Atualização indisponível. Não existe dados cadastrados no sistema ainda");
		} else {
			System.out.println("Digite o CPF do cliente que deseja alterar: ");
			System.out.println("---------------------------------------------------------");
			exibir();
			int cod = entrada.nextInt();
			for (dadosBancarios cpf_dados : listaDados) {
				if (cpf_dados.getCpf() == cod) {
					System.out.println("---------------------------------------------------------");

					dadosBancarios op = new dadosBancarios();

					System.out.print("CPF do novo cliente: ");
					cpf = entrada.nextInt();
					entrada.nextLine();
					op.setCpf(cpf);

					System.out.print("Nome do novo cliente: ");
					nome = entrada.nextLine();
					op.setNome(nome);

					System.out.print("Número da conta do novo cliente: ");
					numeroConta = entrada.nextInt();
					op.setNumeroConta(numeroConta);

					System.out.print("Agencia do cliente do novo cliente: ");
					agencia = entrada.nextInt();
					op.setAgencia(agencia);
					
					for (int i = 0; i < listaDados.size(); i++) {
						if (listaDados.get(i).getCpf() == cod) {
							listaDados.set(i, op);
						}
					}

					System.out.println("CLIENTE ATUALIZADO COM SUCESSO!");
				}
			}
		}
	}
	
	public void remover() {
		if (listaDados.isEmpty()) {
			System.out.println("Remoção indisponível. Não existe dados cadastrados no sistema ainda");
		} else {
			System.out.println(" [1] Remover todos os dados da lista");
			System.out.println(" [2] Remover apenas um dado da lista");
			System.out.println("---------------------------------------------------------");
			exibir();
			int op = entrada.nextInt();	
			
			if (op == 1) {
				listaDados.clear();
				System.out.println("DADOS REMOVIDO COM SUCESSO!");
			} else if (op == 2) {
				System.out.println("Digite o CPF do cliente que deseja remover da lista: ");
				System.out.println("---------------------------------------------------------");
				exibir();
				int id = entrada.nextInt();
				
				Iterator<dadosBancarios> itr = listaDados.iterator();

				while (itr.hasNext()) {
					dadosBancarios p = itr.next();
					if (p.getCpf() == id) {
						itr.remove();
					}
				}
				System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
			}
		}
							
	}
			
}
