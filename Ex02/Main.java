import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main extends Exception
{
	public static void main(String [] args)
	{
		Calc calculadora = new Calc();
		ArrayList<String> exps = new ArrayList<String>();


			try
			{
				BufferedReader reader = new BufferedReader(new FileReader("ExpMat"));

				String linha = reader.readLine();
				while(linha != null)
				{
					exps.add(linha);
					linha = reader.readLine();
				}

			}

			catch(FileNotFoundException e)
			{
				System.out.println(e);
			}
			catch(IOException e)
			{
				System.out.println(e);
			}

			try
			{		

				FileWriter writer = new FileWriter("Respostas");

				for(String s : exps)
				{
					if(calculadora.validateExpression(s))
					{
						writer.write(calculadora.calcular() + "\n");			
					}
					else
					{
						writer.write("Error\n");
					}
				}
				writer.close();
				
			}

			catch(IOException e)
			{
				System.out.println(e);
			}

	}

}