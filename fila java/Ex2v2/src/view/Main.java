package view;

//import javax.swing.JOptionPane;

import br.gov.sp.FilaGenerica.Fila;
import controller.Controller;
import model.Cliente;

public class Main 
{

	public static void main(String[] args) 
	{
		
		Controller c = new Controller();		
		Fila<Cliente> clientes = new Fila<>();
		
		for (int i = 0; i < 20; i++)
		{
			String nome = "Cliente" + i;
			int qtdPecas = (int) ((Math.random() * 31) + 20);
			float valorPeca = (float) ((Math.random() * 96) + 5);
			
			Cliente cliente = new Cliente(nome, qtdPecas, valorPeca);
			clientes.insert(cliente);
		}
		
		c.Caixa(clientes);
	}

}
