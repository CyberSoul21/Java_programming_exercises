public class AlquilerMotoAcuatica{	
	private int Id;
	private String CedulaCliente;
	private int AnoNacimientoCliente;
	private String IdentificadorMoto;
	private int HorasAlquiler;

	//Contructor
	public AlquilerMotoAcuatica(int _Id, String _Cedula, int _AnoNacimiento, String _Identificador, int _Horas){

		Id = _Id;	
		CedulaCliente = _Cedula;
		AnoNacimientoCliente = _AnoNacimiento;
		IdentificadorMoto = _Identificador;
		HorasAlquiler =	_Horas;

	}

	public double TerminarAlquiler(int cantidadHoras)
	{
        
        double costo = 0.0;
		if(cantidadHoras <= 0)
		{
			return 0.0;				
		}  
	    else
		{
			if(cantidadHoras <= HorasAlquiler)
			{
				costo = cantidadHoras*40000; 
				return costo;
			}
			else if((cantidadHoras > HorasAlquiler) && ((cantidadHoras - HorasAlquiler)  < 3))
			{
				costo = (cantidadHoras*40000) + ((cantidadHoras*40000)*0.15);
				return costo;
			}
			else if((cantidadHoras > HorasAlquiler) && ((cantidadHoras - HorasAlquiler) >= 3))
			{
				costo = (cantidadHoras*40000) + ((cantidadHoras*40000)*0.30); 
				return costo;
			}
			else
			{
			    return 0.0;
			    
			}
		}
        

    }

}