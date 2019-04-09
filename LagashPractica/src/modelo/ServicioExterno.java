package modelo;

public class ServicioExterno {
	
	public static void EnviarEmail(String asunto, String cuerpo, String destinatario)
	{
		System.out.println("Se ha enviado un mail. \nDestinatario: "+destinatario+"\nAsunto: "+asunto+"\nCuerpo: "+cuerpo);
	
	}
	

}
