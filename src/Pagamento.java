
public class Pagamento {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		System.out.println("Sal�rio: "+f.salario);
		System.out.println("Descontos:"+f.descontos);
		System.out.println("Funcion�rio: Sal�rio L�quido a receber: "+f.ReceberSalario());
		Comissionado c = new Comissionado();
		System.out.println("Comiss�o: "+c.comissao);
		System.out.println("Comissionado: Sal�rio L�quido a receber: "+c.ReceberSalario());
	}
}
