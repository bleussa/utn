#include <program1.h>
#include "CalculoAritmetico.h"

Principal
	
	real cantDatos;											
	real dato;													
	real matriz[5][5][4] = {0};									
	leer(cantDatos);											
	mostrar << "El vector mide: " << cantDatos;				
	mostrar << salto;
	
	entero i, j, k, contador = 0;
	
	// CARGAMOS LOS DATOS A LA MATRIZ
	variarMas1(i,0,5-1)
		variarMas1(j,0,5-1)
			variarMas1(k,0,4-1)
				si(contador < cantDatos) entonces
					leer(dato);
					matriz[i][j][k] = dato;
					contador++;
				sino
					matriz[i][j][k] = 0;
					finSi
			finVariar
		finVariar
	finVariar
	
	// MOSTRAMOS LOS DATOS DE LA MATRIZ
	variarMas1(i,0,5-1)
		variarMas1(j,0,5-1)
			variarMas1(k, 0,4-1)
				mostrar << conAncho(10) << matriz[i][j][k];		
			finVariar
			mostrar << salto;
		finVariar
		mostrar << salto;
	finVariar			
	
	mostrar << "#######################################################" << salto;
	
	// MOSTRAMOS LA DESVIACION TIPICA
	mostrar << "La DT es: ";
	mostrar << calcularDesviacionTipica(matriz, cantDatos);		// Mostramos el resultado de la D.T.
	mostrar << salto;
finPrincipal
