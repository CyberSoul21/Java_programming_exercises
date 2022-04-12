


public class Main
{
    public static void main(String[] args) {
        
        System.out.println(saludo.substring(0,1));
        
        AlquilerMoto am;           
        am = new AlquilerMoto(22,"1037572315",2016,"LDA432",1);   
        if(am.EsValido()){
            System.out.printf("Valido: %f \n",am.CalcularCosto());
        }
        else
        {
            System.out.printf("NO Valido: %f \n",am.CalcularCosto());
        }
        
    }

}



