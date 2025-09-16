import java.lang.reflect.Array;

public class Util {

    public static Object redimensionar(Object arregloOriginal, int nuevoTamano) {
        Object nuevoArreglo = null;

        if (arregloOriginal != null) {
            Class<?> tipo = arregloOriginal.getClass();
            Class<?> t = tipo.getComponentType();
            nuevoArreglo = Array.newInstance(t, nuevoTamano);

            System.arraycopy(
                arregloOriginal, 
                0, 
                nuevoArreglo, 
                0, 
                Math.min(Array.getLength(arregloOriginal), nuevoTamano)
            );
        }

        return nuevoArreglo;
    }
}
