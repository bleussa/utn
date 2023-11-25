package bleussa;

public class Algoritmo {

    public void algoritmoInsersion(int[] array){
        for (int i = 1; i < array.length; i++){
            int anterior = array[i];
            int j = i - 1;
            while (j >= 0 && anterior < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = anterior;
        }
    }

    public void algoritmoInsersionO(int[] array, String orden){
        if (orden.equals("ASC")){
            System.out.println("Ascendente");
            for (int i = 1; i < array.length; i++){
                int anterior = array[i];
                int j = i - 1;
                while (j >= 0 && anterior < array[j]){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = anterior;
            }
        } else if (orden.equals("DESC")) {
            System.out.println("Descendente");
            for (int i = 1; i < array.length; i++){
                int anterior = array[i];
                int j = i - 1;
                while (j >= 0 && anterior > array[j]){
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = anterior;
            }
        }
    }

    public void algoritmoBurbujaO(int[] array, String orden){
        if (orden.equals("ASC")){
            System.out.println("Ascendente");
            boolean ordenado = false;
            int temp;
            while(!ordenado) {
                ordenado = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i+1]) {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        ordenado = false;
                    }
                }
            }
        } else if (orden.equals("DESC")) {
            System.out.println("Descendente");
            boolean ordenado = false;
            int temp;
            while(!ordenado) {
                ordenado = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i+1]) {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        ordenado = false;
                    }
                }
            }
        }
    }

    public void algoritmoBurbuja(int[] array) {
        boolean ordenado = false;
        int temp;
        while(!ordenado) {
            ordenado = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    ordenado = false;
                }
            }
        }
    }

    public void algoritmoSeleccionO(int[] array, String orden) {
        if (orden.equals("ASC")){
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minPos = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        minPos = j;
                    }
                }
                int temp = array[i];
                array[i] = min;
                array[minPos] = temp;
            }
        } else if (orden.equals("DESC")) {
            for (int i = 0; i < array.length; i++) {
                int min = array[i];
                int minPos = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] > min) {
                        min = array[j];
                        minPos = j;
                    }
                }
                int temp = array[i];
                array[i] = min;
                array[minPos] = temp;
            }
        }
    }

    public void algoritmoSeleccion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minPos = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minPos = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minPos] = temp;
        }
    }

    public void algoritmoBusquedaSecuencial(int[] array, int elemento){
        int n = array.length;
        boolean encontrado = false;
        for (int i = 1; i < n - 1; i++){
            if (array[i] == elemento){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            System.out.println("ELEMENTO ENCONTRADO");
        } else {
            System.out.println("ELEMENTO NO ENCONTRADO");
        }
    }




}
