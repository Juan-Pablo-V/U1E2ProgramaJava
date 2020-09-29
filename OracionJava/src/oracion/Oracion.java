package oracion;

/**
 *
 * @author juan_
 */
public class Oracion {

    public static void main(String[] args) {
        String texto;
        Archivo txt = new Archivo();

        txt.leerArchivo();
        texto = txt.obtenerTexto();
        System.out.println(texto);
        new Proceso().ordenar(texto);
    }

}
