#include<program1.h>
Funcion entero tamanoVector(){
	entero i, tamanoVector;
	cadena renglonLeido1, renglonLeido2;
	cadena elementosVector = "";
	
	leeRenglon(renglonLeido1);
	si(renglonLeido1 ES "") leeRenglon(renglonLeido1);
	leeRenglon(renglonLeido2);
	mostrar << "RENGLON 01: " << renglonLeido1 << salto;
	mostrar << "RENGLON 02: " << renglonLeido2 << salto;
	
	variarMas1(i,0,longitud(renglonLeido2)-1)
		si(esDigito(renglonLeido2[i])) elementosVector += renglonLeido2[i]; 
	finVariar
		
	tamanoVector = aEntero(elementosVector);
	mostrar << "RENGLON 02: " << tamanoVector << salto;
	mostrar << "Cargando..." << salto;
	
	regresa(tamanoVector);
}
	
Funcion vectorDin(entero) cargarDatos(vectorDin(entero) vector, entero tamanoVector){
	entero valor,i;
	
	variarMas1(i,1,tamanoVector)
		leer(valor);
		insertaEleVDin(vector,valor)
	finVariar
	
	regresa(vector);
}	
	
Funcion vectorDin(entero) interseccionVectores(vectorDin(entero) vector1, vectorDin(entero) vector2){
	vectorDin(entero) Vector3;
	entero i, j,cant = 0;
	paraCada(valor, vector1)
//		variarMas1(i, 0, tamanio(vector2))
//			si (valor ES vector2[i]) entonces
//				// mostrar << "OK: "<< valor << " es igual a " << vector2[i] << salto;
//				j++;
//			sino
//				// mostrar << "ERROR: " << valor << " no es igual a " << vector2[i] << salto;
//			finSi
//		finVariar
		si(busquedaBinario(vector2, valor)) entonces
			cant++;
		finSi
	finParaCada
	mostrar << "CANTIDAD INTERSECCION: " << cant << salto;
		
	regresa(Vector3);
}


Principal
	
	entero tamanoVector1 = tamanoVector();
	vectorDin(entero) Vector1;
	Vector1 = cargarDatos(Vector1, tamanoVector1);
	mostrar << "Vector1 creado con un tamano de " << tamanio(Vector1) << " elementos" << salto;
	
	entero tamanoVector2 = tamanoVector();
	vectorDin(entero) Vector2;
	Vector2 = cargarDatos(Vector2, tamanoVector2);
	mostrar << "Vector2 creado con un tamano de " << tamanio(Vector2) << " elementos" << salto;
	
	vectorDin(entero) Vector3;
	Vector3 = interseccionVectores(Vector1, Vector2);
	
	entero i = 0;
	variarMas1(i,1,tamanio(Vector3))
		mostrar << Vector3[i];
	finVariar
		
	// mostrar << "CANTIDAD DE ELEMENTOS DEL VECTOR3: " << i << salto;
	
	
finPrincipal
