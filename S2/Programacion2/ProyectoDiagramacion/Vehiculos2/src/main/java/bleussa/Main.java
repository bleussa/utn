package bleussa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos instancias de cada elemento
        BarcoAVela barco = new BarcoAVela(25, 30, new ArrayList<Rueda>());
        FordFalcon falcon = new FordFalcon(70, 85, new ArrayList<Rueda>());
        HondaXR600 xr600 = new HondaXR600(150, 160, new ArrayList<Rueda>());
        HondaXR25 xr25 = new HondaXR25(130, 135, new ArrayList<Rueda>());
        Boeing747 avion = new Boeing747(1750, 2000, new ArrayList<>());

        barco.romperInercia();
        System.out.println("#######");
        falcon.esquivarObstaculo();
        System.out.println("#######");
        xr600.romperInercia();
    }
}