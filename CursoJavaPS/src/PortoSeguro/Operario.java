package PortoSeguro;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String  cpf, int telefone, 
			int idade, double valorProducao, double comissao) {

		super(nome, endereco, cpf, telefone, idade);
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;

		
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	private void imprimirInfo() {
		// TODO Auto-generated method stub
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+
				getIdade()+"\nTelefone: "+getTelefone()+
				"\nValor monet?rio dos artigos produzidos pelo oper?rio: "+valorProducao+"\nValor da Comiss?o: "+comissao);
	}
	
	private void calcularProducao() {
		// TODO Auto-generated method stub
		double valorTotal = valorProducao + (valorProducao*(comissao/100));
		System.out.println("O valor recebido pelo oper?rio "+getNome()+"? igual a: "+ valorTotal);
		
	}	
}
