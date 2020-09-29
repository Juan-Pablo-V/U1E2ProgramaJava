package oracion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class Archivo {

    private String texto;

    public void leerArchivo() {
        try {
            File archivo = new File("src/oracion.txt");
            Scanner lector = new Scanner(archivo);
            texto = lector.nextLine();
            lector.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se puede leer el archivo  " + ex.getMessage());
        }

    }

    String obtenerTexto() {
        return texto;
        
    }
}
