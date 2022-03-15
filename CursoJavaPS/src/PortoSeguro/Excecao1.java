package PortoSeguro;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = null;
		String novaFrase= null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch (NullPointerException e) //captura da poss�vel excess�o
		{
			//tratamento da excess�o
			System.out.println("\nA frase inicial est� nula, para solucionar tal problema, "+"lhe foi atribuido um valor default...");
			frase = "Agora tem algo aqui";
			novaFrase = frase.toUpperCase();					
		}
		
		System.out.print("\nFrase antiga: "+frase);
		System.out.print("\nFrase nova: "+novaFrase);
	}

}
