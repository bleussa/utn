package bleussa;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "palabras.txt";
        int tamanioPalabra = 10;

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String palabra = scanner.next();
                if (palabra.length() > tamanioPalabra) {
                    System.out.println("- " + palabra);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
