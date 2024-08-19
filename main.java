import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Integer cuadrado[][] = new Integer[3][3];
        boolean cuadradomagico = false;
        cuadrado = random(cuadrado);
        if(ComprobarFilas(cuadrado) && ComprobarColumnas(cuadrado) && ComprobarDiagonalUno(cuadrado) && ComprobarDiagonalDos(cuadrado)) {
            cuadradomagico = true;
        }
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.print("\n" + cuadrado[i][0] + " " + cuadrado[i][1] + " " + cuadrado[i][2]);
        }
        System.out.println("\n" + cuadradomagico);
    }

    public static Integer[][] random(Integer cuadrado[][]) {
        List numeros = new ArrayList(9); //Se crea una lista de capaciad 9
        for (int i = 1; i < 10; i++) { //Se añaden los valores desde 1 a 9 en la lista
            numeros.add(i);
        }
        Random random = new Random();
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int index = random.nextInt(numeros.size());
                cuadrado[i][j] = (Integer) numeros.get(index);
                numeros.remove(index);
            }
        }
        return cuadrado;
    }
    public static Boolean ComprobarFilas(Integer m[][]) {
        Boolean condicion = true;
        for (int n = 0; n < 3; n++) {
            int suma = 0;
            for (int i = 0; i < 3; i++) {
                suma += m[n][i];
            }
            if (suma != 15) {
                condicion = false;
                break;
            }
        }
        return condicion;
    }

    public static boolean ComprobarColumnas(Integer m[][]) {
        Boolean condicion = true;
        for (int n = 0; n < 3; n++) {
            int suma = 0;
            for (int i = 0; i < 3; i++) {
                suma += m[i][n];
            }
            if (suma != 15) {
                condicion = false;
                break;
            }
        }
        return condicion;
    }

    public static Boolean ComprobarDiagonalUno(Integer m[][]) {
        Boolean condicion = true;
        int suma = 0;
        for (int n = 0; n < 3; n++) {
            suma += m[n][n];
        }
        if (suma != 15) {
            condicion = false;
        }
        return condicion;
    }

    public static Boolean ComprobarDiagonalDos(Integer m[][]) {
        Boolean condicion = true;
        int suma = 0;
        for (int n = 0; n < 3; n++) {
            suma += m[n][3 - n];
        }
        if (suma != 15) {
            condicion = false;
        }
        return condicion;
    }
}


