public class Main
{
    public static void main(String[] args) {
        
        AlquilerMotoAcuatica amc;           
        amc = new AlquilerMotoAcuatica(542,"1037572315",2016,"LDA432",5);   

        System.out.printf("Costo: %f \n",amc.TerminarAlquiler(10));

        
    }

}
