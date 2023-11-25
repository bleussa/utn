#include<program1.h>
Principal
	
	entero datoLeido;
	entero datoAnterior;
	entero sumaDatos = 0;
	entero menorSuma = valorMaximo(entero);
	entero contador = 0;
	iterar																// INICIAMOS EL BUCLE
		
		leer(datoLeido);												// LEEMOS LOS DATOS
		salirSi(esFinArch(stdin));										// SALIMOS SI ES EL FINAL
		si (contador NOES 0) entonces									// 
			si (esPar(datoAnterior) Y esPar(datoLeido)) entonces		// SI LOS DOS VALORES SON PARES 
				sumaDatos = datoAnterior + datoLeido;						// LOS SUMAMOS
				si (sumaDatos < menorSuma) entonces							// SI LA sumaDatos ES MENOR QUE menorSuma
					menorSuma = sumaDatos;
				finSi
			finSi
					
			datoAnterior = datoLeido;
		sino
			datoAnterior = datoLeido;
			contador++;
		finSi
			
	finIterar
	
	mostrar << "La menor suma es " << menorSuma;
finPrincipal
