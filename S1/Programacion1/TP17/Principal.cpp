#include <program1.h>
principal                                                       // Unidad de programa principal
	
	limpiar;                                                        // Limpia la pantalla.
	real valor;
	vectorDin(real) vectorDin;
	listaDe(real) listaDin;
	entero cantValores = 0;
	
	mostrar << "Cargando...";

	iterar
		leer(valor);
		salirSi(esFinArch(stdin));
		agregaEleVDin(vectorDin,valor);
		insertaLista(listaDin,valor);
	finIterar
	
	real element;
//	paraCada(element, vectorDin)
//		mostrar << element << conAncho(8);
//	finParaCada
	clasifica(listaDin);
	clasifica(vectorDin);
	mostrar << salto << salto << "ORDENADOS" << salto << salto;

	paraCada(element, vectorDin)
		mostrar << element << conAncho(8);
		cantValores++;
	finParaCada
	
	mostrar << salto << salto << "CANTIDAD DE VALORES: " << cantValores << salto << salto;
	mostrar << salto << salto << vectorDin[cantValores-1] << salto;
	pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

