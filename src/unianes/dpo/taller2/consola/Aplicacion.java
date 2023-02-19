package unianes.dpo.taller2.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aplicacion {
	public static void main(String[] args){
		
	}
	public void ejectutarAplicacion() {
		System.out.println("Aplcacion pedidos restauran\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					System.out.println("6. ejecutarmostarElMenu\n");
				else if (opcion_seleccionada == 2)
					System.out.println("6. ejecutarmostarElMenu\n");
				else if (opcion_seleccionada == 3)
					System.out.println("6. ejecutarmostarElMenu\n");
				else if (opcion_seleccionada == 4)
					System.out.println("6. ejecutarmostarElMenu\n");
				else if (opcion_seleccionada == 5)
					System.out.println("6. ejecutarmostarElMenu\n");
				
				else if (opcion_seleccionada == 14)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
	
	public void mostrarMenu() {
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Mostrar el menu");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar la informacion de un pedido dado su id");
		System.out.println("6. Salir de la aplicación\n");
		
	}
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	

}
