import java.lang.Math;

public class eratostenes
{
    private int array[];
    private int n;
    private int l;
    private int counter;

    public eratostenes(int _n)
    {
      n = _n;
      l = (int)Math.sqrt(n);
      counter = 0;
    }

    public void fill_array()
    {
      array = new int[n];
      for(int i = 0; i<n; i++)
      {
        array[i] = i + 1;
      }

    }

    public void print_array()
    {
      for(int i = 0; i<n; i++)
      {
        System.out.println(array[i]);
      }

    }
    
    public void criba_method()
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

    public void count_primes()
    {
      for(int i = 0; i<n; i++)
      {
        if(array[i] != 0)
        {
          counter++;
        }
      }
    }

    public int get_counter()
    {
      return counter;
    }


}
