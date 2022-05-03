import java.util.Scanner;  //importar de la clase Scaner que se va usar para ingresar datos
import java.lang.Math;

public class criba
{
    public static int array[];
    public static int n;
    public static int l;
    public static int counter;
    
    public static void init(int _n)
    {
      n = _n;
      l = (int)Math.sqrt(n);
      counter = 0;
    }

    public static void fill_array()
    {
      array = new int[n];
      for(int i = 0; i<n; i++)
      {
        array[i] = i + 1;
      }

    }

    public static void print_array()
    {
      for(int i = 0; i<n; i++)
      {
        System.out.println(array[i]);
      }

    }

    public static void criba_method()
    {
      int i = 1;
      int mult = 0;
      array[0] = 0;
      while(i<=l)
      {
        mult = array[i];
        if(mult == 0)
        {
          i++;
        }
        else
        {
          for(int j = i + 1; j<n; j++)
          {
            if(array[j]%mult == 0)
            {
              array[j] = 0;
            }

          }
          i++;
        }

      }

    }

    public static void count_primes()
    {
      for(int i = 0; i<n; i++)
      {
        if(array[i] != 0)
        {
          counter++;
        }
      }
    }

    public static int get_counter()
    {
      return counter;
    }            

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in); //The Scanner class is used to get user input

        //Inicializacion variables
        int number = 0;

        System.out.printf("Introducir numero n: "); //Print in console
        number = myObj.nextInt(); //Comando para ingresar valores

        
        init(number);
        fill_array();
        //print_array();
        criba_method();
        //print_array();
        count_primes();
        System.out.printf("La cantidad de numeros primos hasta "+number+" son: "+get_counter()+"\n");

    }

}