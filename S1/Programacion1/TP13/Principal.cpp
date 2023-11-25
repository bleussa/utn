#include <program1.h>
#include "CalculoAritmetico.h"

Principal
	
	real cantDatos;											
	real dato;													
	real matriz[10][10] = {0};									
	leer(cantDatos);											
	mostrar << "El vector mide: " << cantDatos;				
	mostrar << salto;
	
	entero i, j, contador = 0;
	
	// CARGAMOS LOS DATOS A LA MATRIZ
	variarMas1(i,0,10-1)
		variarMas1(j,0,10-1)
			si(contador < cantDatos) entonces
			leer(dato);
			matriz[i][j] = dato;
			contador++;
			sino
				matriz[i][j] = 0;
			finSi
		finVariar
	finVariar
	
	// MOSTRAMOS LOS DATOS DE LA MATRIZ
	variarMas1(i,0,10-1)
		variarMas1(j,0,10-1)
			mostrar << conAncho(10) << matriz[i][j] ;
		finVariar
		mostrar << salto;
	finVariar			
	
	mostrar << "#######################################################" << salto;
	
	// MOSTRAMOS LA DESVIACION TIPICA
	mostrar << "La DT es: ";
	mostrar << calcularDesviacionTipica(matriz, cantDatos);		// Mostramos el resultado de la D.T.
	mostrar << salto;
finPrincipal
