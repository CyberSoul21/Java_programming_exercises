/**
 * @file criba.cpp 
 * @brief; 
 *
 *
 * @author Wilson Javier Almario Rodriguez
 * @date 
 * @update: 
 */


//#include <cstdlib>
//#include <iostream>
//#include <cmath>
#include "eratostenes.h"

//using namespace std;

int main(int argc, char *argv[])
{
    
	
	int n = 0;

    cout<<"Introducir numero n: ";
    cin>>n;
    eratostenes prms(n);
    prms.fill_array();
    //prms.print_array();
    prms.criba_method();
    prms.count_primes();
    cout<<"La cantidad de numeros primos hasta "<<n<<" son: "<<prms.get_counter()<<endl;

    
    
    //system("PAUSE");
    return EXIT_SUCCESS;
}