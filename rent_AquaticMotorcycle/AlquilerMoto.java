public class AlquilerMoto{	
	private int Id;
	private String CedulaCliente;
	private int AnoNacimientoCliente;
	private String IdentificadorMoto;
	private int HorasAlquiler;

	//Contructor
	public AlquilerMoto(int _Id, String _Cedula, int _AnoNacimiento, String _Identificador, int _Horas){

		Id = _Id;	
		CedulaCliente = _Cedula;
		AnoNacimientoCliente = _AnoNacimiento;
		IdentificadorMoto = _Identificador;
		HorasAlquiler =	_Horas;

	}

	public double CalcularCosto(){
	    double costo = 0.0;
	    if(EsValido())
	    {
            switch(IdentificadorMoto.substring(0,1)) {
              case "L":
                costo = 30000*HorasAlquiler;
                break;
              case "D":
                costo = 45000*HorasAlquiler;
                break;
              case "P":
                costo = 90000*HorasAlquiler;
                break;            
              default:
                costo = 50000*HorasAlquiler;
            }	        
	    }
	    else
	    {
	        costo = 0;
	    }

	    
	    return costo;

	}

	public boolean EsValido(){
	    
	    if(AnoNacimientoCliente > 1900)
	    {
	    
    	    if((2021 - AnoNacimientoCliente) >= 18){
    	        return true;    
    	    }
    	    else{
    	        return false;
    	    }
	    }
	    else
	    {
	        return false;
	    }
        
	}

}