#include <program1.h>
#include "CalculoAritmetico.h"
	
funcion real calcularPromedio(real matriz[5][5][4], entero cantDatos){
	entero i, j, k;
	real suma = 0;
	entero contador = 0;
	variarMas1(i,0,5-1)
		variarMas1(j,0,5-1)
			variarMas1(k,0,4-1)
				suma += matriz[i][j][k];
				contador++;
			finVariar
		finVariar
	finVariar								
	retorna((suma / cantDatos));			
}
	
funcion real calcularDesviacionTipica(real matriz[5][5][4], entero cantDatos){
	entero i, j, k;
	real promedio = calcularPromedio(matriz, cantDatos);
	real suma = 0;
	variarMas1(i,0,5-1)
		variarMas1(j,0,5-1)
			variarMas1(k,0,4-1)
				si(matriz[i][j] NOES 0)	entonces
					suma += ((matriz[i][j][k] - promedio) * (matriz[i][j][k] - promedio));
				finSi
			finVariar
		finVariar
	finVariar
	real desviacionTipica = raiz2(suma / cantDatos);
	retorna(desviacionTipica);
}

