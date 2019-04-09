package modelo;

public interface IParkingLot
{
	//Propiedades
	
	Integer getCantidadEstacionados(); //Dado que no puedo asignar un valor null en int, debo encapsularla como un objeto
	
	int getEspaciosDisponibles();
	

	int getPrecioPorDia(); //Para consultar precio de estadia
	
	//Metodos
	
	void setPrecioPorDia(int PrecioPorDia); //Para establecer precio de estadia
	
	void IngresoDetectado();
	
	void EgresoDetectado();
	
	void FacturarEstadia(int PrecioPorDia);
}
