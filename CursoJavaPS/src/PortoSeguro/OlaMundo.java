package PortoSeguro;

import java.util.Scanner;

public class OlaMundo{
	
	public static void main(String[] args) {
		
		String name;
		int idade = 27;
		float altura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Fala fiote");
		
		System.out.println("\nQual o nome: ");
		
		name = leia.nextLine();
		System.out.println("\nQual a tua altura");
		
		altura = leia.nextFloat();
		
		System.out.println("\n hahahahhahaha o nome do cara � "+name+" puta nego tonto v�i,  o cara tem "+idade+ " anos e "+altura+" de altura, menor que o pedrinho");
	}
	
}