public class Calc
{
	private int operador;
	private String operando1;
	private String operando2;
	private double x;
	private double y; 
	private double retorno;

	public boolean ehOperador(String o){

		if(o.equals("+") || o.equals("-") || o.equals("/") || o.equals("*"))
		{
			switch(o)
			{
				case "+" : operador = 0;
				break;
				case "-" : operador = 1;
				break;
				case "*" : operador = 2;
				break;
				case "/" : operador = 3;
				break;
			}

			return true;
		}

		else
			return false;

	}

	public boolean validateExpression(String exp)
	{

		int cont = 0;
		//int length = exp.length();

		if(exp.isEmpty())
		{
			return false;
		}

		operando1 = "";
		while(cont < exp.length())
		{
			if(Character.isDigit(exp.charAt(cont)))
			{
				operando1 += Character.toString(exp.charAt(cont));
				cont++;
			}
			else if(ehOperador(Character.toString(exp.charAt(cont))))
			{
				cont++;
				break;
			}
			else
			{
				return false;
			}
		}


		operando2 = "";
		while(cont < exp.length())
		{
			if(Character.isDigit(exp.charAt(cont)))
			{
				operando2 += Character.toString(exp.charAt(cont));
				cont++;
			}
			else if(ehOperador(Character.toString(exp.charAt(cont))))
			{
				cont++;
				break;
			}
			else
			{
				return false;
			}
		}

		if(operador == 3 && Double.parseDouble(operando2) == 0)
			return false;

		return true;

	}

	public double calcular()
	{
		x = 0;
		y = 0;
		retorno = 0;

		x = Double.parseDouble(operando1);
		y = Double.parseDouble(operando2);

		switch(operador)
		{
			case 0: retorno = x+y;
			break;
			case 1: retorno = x-y;
			break;
			case 2: retorno = x*y;
			break;
			case 3: retorno = x/y;
			break;
		}

		return retorno;
	}
}