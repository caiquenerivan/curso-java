package PortoSeguro;

public class TesteEmpregado1 {
	public static void main(String[] args) {
		
		Empregado1 emp = new Empregado1("Caique", "Rua 7, 231", "44008188886", 947065991, 27, 1, 15000, 12);
				
		emp.imprimirInfo();
		emp.calcularSalario();
	}
}
