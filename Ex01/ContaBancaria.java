
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

	public int getConta()
	{
		return numeroConta;
	}

	public void extrato()
	{
		System.out.println("\tEXTRATO");
		System.out.println("Nome: " + this.nome);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.printf("Saldo atual: %.2f\n", this.saldo);
	}

	public void sacar(double valor) throws ParametroException
	{
		if(valor < 0)
		{
			throw new ParametroException("Parâmetro inválido: valor negativo");
		}

		else if(valor > saldo)
		{
			throw new ParametroException("Parâmetro inválido: valor solicitado maior que o saldo disponível");
		}

		else if(saldo >= valor)
		{
			saldo -= valor;
			System.out.println("Sacado: " + valor);
			System.out.println("Saldo atual: " + saldo + "\n");
		}
	}

	public void depositar(double valor) throws ParametroException
	{
		if(valor < 0)
		{
			throw new ParametroException("Parâmetro inválido: valor negativo");
		}

		else
		{
			saldo += valor;
			System.out.println("Depositado: " + valor);
			System.out.println("Novo saldo: " + saldo + "\n");
		}
	}
}