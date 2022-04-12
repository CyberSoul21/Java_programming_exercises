#ifndef ERATOSTENES_H
#define ERATOSTENES_H


#include <cstdlib>
#include <iostream>
#include <cmath>

using namespace std;

class eratostenes
{
    private:
    	int* array=NULL;
     	int n;
     	int l;
     	int counter;

    public:
     	eratostenes(int _n)
     	{
        	n = _n;
      		l = sqrt(n);
      		counter = 0;
     	}

	    void fill_array();
	    void print_array();
		void criba_method();
	    void count_primes();
	    int get_counter();

};



#endif 