#include <program1.h>
#include "CalculoAritmetico.h"
	
funcion real calcularPromedio(real matriz[10][10], entero cantDatos){
	entero i, j;
	real suma = 0;
	entero contador = 0;
	variarMas1(i,0,10-1)
		variarMas1(j,0,10-1)
			suma += matriz[i][j];
			contador++;
		finVariar
	finVariar								
	retorna((suma / cantDatos));			
}
	
funcion real calcularDesviacionTipica(real matriz[10][10], entero cantDatos){
	entero i, j;
	real promedio = calcularPromedio(matriz, cantDatos);
	real suma = 0;
	variarMas1(i,0,10-1)
		variarMas1(j,0,10-1)
			si(matriz[i][j] NOES 0)	entonces
				suma += ((matriz[i][j] - promedio) * (matriz[i][j] - promedio));
			finSi
		finVariar
	finVariar
	real desviacionTipica = raiz2(suma / cantDatos);
	retorna(desviacionTipica);
}

