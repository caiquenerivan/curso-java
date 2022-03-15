package PortoSeguro;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {
	
	
	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n-------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos no estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja sair do programa?");
			System.out.println("\n-------------------------------");
			System.out.println("\nDigite uma op��o: ");
			op = ler.nextInt();
			
			switch(op) {
			case 1:
				ler.nextLine();//limpando o meu cache de mem�ria
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
			break;
			
			case 2:
				ler.nextLine();//limpando o meu cache de mem�ria
				System.out.println("\nDigite o produto para remover do estoque: ");
				String remover = ler.nextLine();
				if(estoque.contains(remover)) {
					estoque.remove(remover);
					System.out.println("\nO produto "+remover+"para remover do estoque: ");
				}
				else {
					System.out.println("\nProduto n�o existe! ");
				}
			break;
			case 3:
				ler.nextLine();//limpando o meu cache de mem�ria
				System.out.println("\nDigite o produto para atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrar� no lugar de "+verifica);
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
					
				}
				else {
					System.out.println("\nProduto n�o existe! ");
				}
				System.out.println(estoque);
			break;
			case 4: 
				System.out.println("\nOs produtos no estoque s�o: ");
				System.out.println(estoque);
			break;
			
			default:
				if(op==0) {
					System.out.println("\nTchau");
				} else {					  
					System.out.println("\nOp��o inv�lida! ");
				}
				
			}
			
		} while (op!=0);
	}
}
