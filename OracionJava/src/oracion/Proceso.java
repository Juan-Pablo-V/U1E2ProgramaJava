package oracion;

/**
 *
 * @author juan_
 */
public class Proceso {

    String texto_aux[] = {"Estoy", "programando", "en", "Java"};
   
    String oracion[];

    void ordenar(final String c) {
        oracion = c.split(" ");

        String auxiliar;
        int indice;
        for (int i = 0; i < oracion.length; i++) {
            if (!oracion[i].equals(texto_aux[i])) {
                indice = encontrarIndice(texto_aux[i]);
                if (indice == -1) {
                    System.out.println("Alguna palabra no coincide");
                    return;
                }
                auxiliar = oracion[indice];
                oracion[indice] = oracion[i];
                oracion[i] = auxiliar;
                imprimirArreglo(oracion);
            }
        }
    }

    int encontrarIndice(String palabra) {
        int indice = -1;
        for (int i = 0; i < texto_aux.length; i++) {
            if (palabra.equals(oracion[i])) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    void imprimirArreglo(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
