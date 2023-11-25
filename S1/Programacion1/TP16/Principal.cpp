#include<program1.h>

Principal	
	entero cantFilas;
	entero cantColumnas;
	real datoLeido;
	entero i, j = 0;
	real valorBusqueda;
	
	iterar
		
		leer(cantFilas);
		mostrar << "FILAS = " << cantFilas << salto;
		leer(cantColumnas);
		mostrar << "COLUMNAS = " << cantColumnas << salto;
		leer(valorBusqueda);
		mostrar << "VALOR A BUSCAR = " << valorBusqueda << salto;
		salirSi(VERDADERO);
		
	finIterar
	
	// real matriz[cantFilas][cantColumnas];
	logico valorEncontrado = FALSO;
	
	variarMas1(i,0,cantFilas-1)
		variarMas1(j,0,cantColumnas-1)
			leer(datoLeido);
			si(datoLeido ES valorBusqueda) entonces
				mostrar << "El valor fue encontrado en la fila " << i << " y en la columna " << j << salto;
				valorEncontrado = VERDADERO;
				break;
			sino
				valorEncontrado = FALSO;
			finSi
		finVariar
		si(valorEncontrado ES VERDADERO) entonces
			break;
		finSi;
	finVariar
	
	si (valorEncontrado ES FALSO) entonces
		mostrar << "El valor no se encontro, codigo de error: 0" << salto;		
	finSi
	
finPrincipal
