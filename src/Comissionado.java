
public class Comissionado extends Funcionario{
	public Comissionado() {
		super();
	}
	
	@Override
	public double ReceberSalario() {
		salarioliquido=salario+comissao-descontos;
		return salarioliquido;
	}
}
