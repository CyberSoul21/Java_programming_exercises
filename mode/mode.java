import java.util.*;  //importar de la clase Scaner que se va usar para ingresar datos

public class mode {
    public static void main(String[] args) {
        int array[] = {1,1,1,1,5,8,6,12,3,4,5,5,6,7,8,8,9,9,9,9,9,9,9};
        get_mode(array);

    }
    public static void get_mode(int array[])
    {
        Hashtable<Integer, Integer> my_dict = new Hashtable<Integer, Integer>();
        List<Integer> list=new ArrayList<Integer>();  
        for(int i = 0; i<array.length; i++)
        {
            if(my_dict.get(array[i]) == null)
            {
                my_dict.put(array[i], 1);
                list.add(array[i]);
            }
            else
            {
                my_dict.put(array[i], my_dict.get(array[i]) + 1);
            }
        }
        //System.out.println(my_dict);

        int max = 0;
        int max_key = 0;
        for(int x:list)
        {
            //System.out.println(x);  
            if(my_dict.get(x)>max)
            {
                max = my_dict.get(x);
                max_key = x;
            }
        }
        System.out.println("The mode is: " + max_key);
    }
    
}
