#include "eratostenes.h"


void eratostenes::fill_array()
{
	array = new int[n];
	for(int i = 0; i<n; i++)
	{
		array[i] = i + 1;
	}
}

void eratostenes::print_array()
{
	for(int i = 0; i<n; i++)
	{
		cout<<array[i]<<endl;
	}
}

void eratostenes::criba_method()
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

void eratostenes::count_primes()
{
	for(int i = 0; i<n; i++)
	{
		if(array[i] != 0)
	    {
	    	counter++;
	    }
	}
}

int eratostenes::get_counter()
{
	return counter;
}