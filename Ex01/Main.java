public class Main
{
	public static void main(String [] args)
	{
		ContaBancaria conta1 = new ContaBancaria("Cliente1", 111, 100.00);
		ContaBancaria conta2 = new ContaBancaria("Cliente2", 222, 200.00);

		GerenciarContas gerenciador = new GerenciarContas();
		//Armazenando
		gerenciador.armazenarConta(conta1);
		gerenciador.armazenarConta(conta2);

		//Testando funções
		gerenciador.extratoConta(conta1.getConta());
		gerenciador.depositarConta(conta1.getConta(), 10.00);
		gerenciador.sacarConta(conta1.getConta(), 10.00);
		gerenciador.removerConta(conta2.getConta());

		//Testando erros
		gerenciador.depositarConta(conta1.getConta(), -10.00);
		gerenciador.sacarConta(conta1.getConta(), 1000.00);


	}
}