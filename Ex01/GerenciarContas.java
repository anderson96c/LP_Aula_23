
import java.util.ArrayList;
import java.util.Hashtable;

public class GerenciarContas
{
	private Hashtable<Integer, ContaBancaria> contas;

	public GerenciarContas()
	{
		contas = new Hashtable<Integer, ContaBancaria>();
	}

	public void armazenarConta(ContaBancaria c)
	{
		contas.put(c.getConta(), c);
	}

	public void removerConta(int numeroConta)
	{
		contas.remove(numeroConta);
	}
	public void depositarConta(int numeroConta, double valor)
	{
		try
		{
			ContaBancaria c = contas.get(numeroConta);
			c.depositar(valor);
		}

		catch(ParametroException excepiton)
		{
			System.out.println(excepiton.getMessage());
		}
	}
	public void sacarConta(int numeroConta, double valor)
	{
		try
		{
			ContaBancaria c = contas.get(numeroConta);
			c.sacar(valor);
		}

		catch(ParametroException excepiton)
		{
			System.out.println(excepiton.getMessage());
		}

	}
	public void extratoConta(int numeroConta)
	{
		ContaBancaria c = contas.get(numeroConta);
		c.extrato();
	}
}