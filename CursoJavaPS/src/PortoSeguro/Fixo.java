package PortoSeguro;

public class Fixo extends Telefone{

	public Fixo() {
		super("Telefone fixo");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void disca(String numero) {
		// TODO Auto-generated method stub
		System.out.println("\nDiscando "+numero);
	}

	@Override
	public void toca(int numToques) {
		// TODO Auto-generated method stub
		for(int i=0;i<numToques;i++) {
			System.out.println("\nTrimtrimtrim... Trimtrimtrim...");
		}
	}

}
