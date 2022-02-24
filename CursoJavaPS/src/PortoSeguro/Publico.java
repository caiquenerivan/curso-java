package PortoSeguro;

public class Publico extends Telefone{

	public Publico() {
		super("Telefone público");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void disca(String numero) {
		// TODO Auto-generated method stub
		if(numero.charAt(0)=='9'||numero.charAt(0)=='8') {
			System.out.println("\nEste número não liga para celular");
		} else {
			System.out.println("\nDiscando "+numero);
		}
	}

	@Override
	public void toca(int numToques) {
		// TODO Auto-generated method stub
		for(int i=0;i<numToques;i++) {
			System.out.println("\ntrimm.. trimm");
		}
	}

}
