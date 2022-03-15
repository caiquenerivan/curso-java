package PortoSeguro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	
	//demonstra lan�amento de uma excec�o
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador/denominador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		boolean continueLoop = true; //determina se mais entradas s�o necess�rias
		
		do {
			try {
				
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d/%d = %d\n",numerador,denominador,resultado);
				
				continueLoop = false;
				//fim do try
			} catch(InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s\n", inputMismatchException);
				leia.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro "+
								"Tente novamente");
				
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\n\nException %s", arithmeticException);
				System.out.println("\nZero � um denominador inv�lido!!!"+
						"Por favor, tente novamente");
			}
		} while(continueLoop);
	}

}
