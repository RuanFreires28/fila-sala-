package controller;

import br.gov.sp.FilaGenerica.Fila;
import model.Cliente;

public class Controller 
{
	
	public Controller() 
	{
		super();
	}
	
	
	public void Caixa(Fila<Cliente> fila)
	{
		
		while (!fila.isEmpty())
		{
			Cliente cliente = new Cliente();
			try 
			{
				cliente = fila.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			float valorCompra = cliente.getQtdPecas() * cliente.getValorPecas();
			
			System.out.println("O " + cliente.getNome() + " devera pagar R$ " + valorCompra);
			
			
		}
		
	}
	
}
