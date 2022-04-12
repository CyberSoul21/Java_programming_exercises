import java.util.Scanner;  // Import the Scanner class

public class Main
{
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); //The Scanner class is used to get user input

        double kilo_grams = 0.0;
        double pounds     = 0.0;
        double ounces     = 0.0;



        System.out.printf("Introducir cantidad en gramos: "); //Print in console
        double grams = myObj.nextDouble();

        kilo_grams = grams/1000;
        pounds     = grams/453.592;
        ounces     = grams/28.3495;

        System.out.printf("Equivale a: \n");
        System.out.println(" " + kilo_grams + " Kilo gramos");
        System.out.println(" " + pounds + " Libras");
        System.out.println(" " + ounces + " Onzas");
        
    }

}