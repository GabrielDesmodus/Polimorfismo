
public class Pagamento {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		System.out.println("Salário: "+f.salario);
		System.out.println("Descontos:"+f.descontos);
		System.out.println("Funcionário: Salário Líquido a receber: "+f.ReceberSalario());
		Comissionado c = new Comissionado();
		System.out.println("Comissão: "+c.comissao);
		System.out.println("Comissionado: Salário Líquido a receber: "+c.ReceberSalario());
	}
}
