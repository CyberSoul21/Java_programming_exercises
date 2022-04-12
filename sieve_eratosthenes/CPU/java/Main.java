import java.util.Scanner;  //importar de la clase Scaner que se va usar para ingresar datos


public class Main
{
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in); //The Scanner class is used to get user input

        //Inicializacion variables
        double kilo_grams = 0.0;
        double pounds     = 0.0;
        double ounces     = 0.0;
        double grams = 0;



        System.out.printf("Introducir cantidad en gramos: "); //Print in console
        grams = myObj.nextDouble(); //Comando para ingresar valores

        //Conversion - Operaciones    
        kilo_grams = grams/1000;
        pounds     = grams/453.592;
        ounces     = grams/28.3495;

        //Imprimir en consola
        System.out.printf("Equivale a: \n");
        System.out.println(kilo_grams + " Kilo gramos");
        System.out.println(pounds + " Libras");
        System.out.println(ounces + " Onzas");






        
    }

}