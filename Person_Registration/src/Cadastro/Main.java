package Cadastro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		dadosBancarios dados= new dadosBancarios();
		int op=0;
		
		do {
			
			System.out.println(" |>>>>>>>>>>>>>>>>> CADASTRO DE CONTA <<<<<<<<<<<<<<<<<| \n\n"
					+ "1- Cadastrar conta \n"
					+ "2- Consultar conta pelo CPF \n"
					+ "3- Atualizar conta \n"
					+ "4- Remover uma conta \n"
					+ "5- Exibir todas as contas cadastradas no sistema\n"
					+ "0- Encerrar programa");
			op=entrada.nextInt();
			
		switch(op) {
		
		case 1:
			dados.inserir();
			break;
		case 2:
			dados.pesquisar();
			break;
		case 3:
			dados.atualizar();
			break;
		case 4:
			dados.remover();
			break;
		case 5:
			dados.exibir();
			break;
		case 0:
			break;
		default:
			System.out.println("Entre com um número válido entre 1 a 6!");
		}
			
		}while(op > 0); 
		entrada.close();
		System.out.println("ENCERRADO!");
		
	
	}
}
