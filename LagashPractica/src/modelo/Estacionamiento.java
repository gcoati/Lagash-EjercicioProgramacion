package modelo;

public class Estacionamiento implements IParkingLot
{
	private int EspaciosDisponibles;
	private int PrecioPorDia;
	private int CantidadEstacionados;
	
	public Estacionamiento(int PrecioPorDia)
	{
		this.EspaciosDisponibles = 100; //Set máxima cantidad de lugares
		this.CantidadEstacionados = 0;
		setPrecioPorDia(PrecioPorDia);
	}
		
	@Override
	public void IngresoDetectado()
	{
		System.out.println("\nHa ingresado un vehiculo.");
		this.EspaciosDisponibles--;
		this.CantidadEstacionados++;
	}
	
	@Override
	public void EgresoDetectado()
	{
		System.out.println("\nHa egresado un vehiculo.");
		this.EspaciosDisponibles++;
		this.CantidadEstacionados--;
	}
	
	@Override
	public void FacturarEstadia(int PrecioPorDia)
	{
		ServicioExterno.EnviarEmail("Total Estadías", "El total de estadias es: "+(getCantidadEstacionados() * PrecioPorDia), "mail@example.org");
		
	}
	
	@Override
	public void setPrecioPorDia(int PrecioPorDia)
	{
		this.PrecioPorDia = PrecioPorDia;
		
	}
	
	@Override
	public int getPrecioPorDia()
	{
		return PrecioPorDia;
	}

	
	@Override
	public Integer getCantidadEstacionados()
	{
		Integer estacionados = CantidadEstacionados;
		if(CantidadEstacionados == 0)
		{
			estacionados = null;
		}
		
		return estacionados;
	}
	
	@Override
	public int getEspaciosDisponibles()
	{
		return EspaciosDisponibles;
	}

}
