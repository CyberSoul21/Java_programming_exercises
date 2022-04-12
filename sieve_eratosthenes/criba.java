import java.util.Scanner;  //importar de la clase Scaner que se va usar para ingresar datos

public class criba
{
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in); //The Scanner class is used to get user input

        //Inicializacion variables
        int n = 0;

        System.out.printf("Introducir numero n: "); //Print in console
        n = myObj.nextInt(); //Comando para ingresar valores

        eratostenes prms;
        prms = new eratostenes(n);
        prms.fill_array();
        //prms.print_array();
        prms.criba_method();
        //prms.print_array();
        prms.count_primes();
        System.out.printf("La cantidad de numeros primos hasta "+n+" son: "+prms.get_counter()+"\n");

    }

}
