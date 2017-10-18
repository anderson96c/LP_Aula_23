
public class ContaBancaria
{
	private String nome;
	private int numeroConta;
	private double saldo;

	public ContaBancaria(String nome, int numeroConta, double saldo)
	{
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void extrato()
	{
		System.out.println("\tEXTRATO");
		System.out.println("Nome: " + this.nome);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.printf("Saldo atual: %.2d\n", this.saldo);
	}
}