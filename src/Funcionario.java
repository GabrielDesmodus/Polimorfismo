
public class Funcionario {
	double salario;
	double descontos;
	double comissao;
	double salarioliquido;
	
	public Funcionario(){
		salario = 2500;
		descontos = 500;
		comissao = 1000;
	}

	public double ReceberSalario() {
		salarioliquido = salario-descontos;
		return salarioliquido;
	}
}
