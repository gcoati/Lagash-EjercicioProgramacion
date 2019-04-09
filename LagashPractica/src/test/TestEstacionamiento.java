package test;

import modelo.*;

public class TestEstacionamiento {
	
	public static void main(String[] args)
	{
				
		//Escenario 1
		
		try
		{
			Estacionamiento parking = new Estacionamiento(300); //precio por día inicializado en 300
			System.out.println("Escenario 1: Informar ingreso de un auto, y egreso de otro.");
			
			parking.IngresoDetectado();
			parking.IngresoDetectado(); //Para evitar un valor null en la prueba
			
			System.out.println("\nAutos estacionados: "+parking.getCantidadEstacionados());
			System.out.println("Lugares disponibles: "+parking.getEspaciosDisponibles());
			
			parking.EgresoDetectado();
			System.out.println("\nAutos estacionados: "+parking.getCantidadEstacionados());
			System.out.println("Lugares disponibles: "+parking.getEspaciosDisponibles());
		}
		catch(Exception e) 
		{
			System.out.println(""+e.getStackTrace()); //imprime errores encontrados en instancias
		}
		
		//Escenario 2	
		try
		{
			Estacionamiento parking = new Estacionamiento(300); //lo inicializo de forma aislada para evitar errores
			System.out.println("\nEscenario 2: Fin del dia, facturacion de estadia, y envio de email.");
			
			parking.setPrecioPorDia(300); //establezco precio de estadía en 300
			
			parking.IngresoDetectado();
			parking.IngresoDetectado(); 
			
			System.out.println("\nCantidad de autos estacionados: "+parking.getCantidadEstacionados());
			System.out.println("Cantidad de lugares disponibles: "+parking.getEspaciosDisponibles());
			parking.FacturarEstadia(parking.getPrecioPorDia()); //ya estaba establecido el precio previamente
			
		}
		catch(Exception e)
		{
			System.out.println(""+e.getStackTrace());
		}
		
		//Escenario 3
		
		try
		{
			Estacionamiento parking = new Estacionamiento(300);
			System.out.println("\nEscenario 3: Fin del dia, pero no hay ningun auto estacionado. Se devuelven 100 y null.");
			
			System.out.println("\nCantidad de autos estacionados: "+parking.getCantidadEstacionados());
			System.out.println("Cantidad de lugares disponibles: "+parking.getEspaciosDisponibles());
			
		}
		catch(Exception e)
		{
			System.out.println(""+e.getStackTrace());
		}
				
	}

}
