package PortoSeguro;

public class Celular extends Telefone{

	public Celular() {
		super("Telefone Celular");

		
	}

	@Override
	public void disca(String numero) {
		// TODO Auto-generated method stub
		System.out.println("\nO n?mero "+numero+" ? um celular");
	}

	@Override
	public void toca(int codigoToque) {
		// TODO Auto-generated method stub
		switch(codigoToque) {
		case 1:
			System.out.println("\ntriiiiim... triiiim...");
			break;
		
		case 2:
			System.out.println("\ntananinanam... tananinanam...");
			break;
		default:
			System.out.println("\npirilimpirilimpirilim... pirilimpirilimpirilim...");
		}
	}
	
	
}
