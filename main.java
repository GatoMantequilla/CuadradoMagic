import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Integer cuadrado[][] = new Integer[3][3];
        boolean infinito = true; //Comentar esta linea para un solo intento
        //boolean infinito = false; //Descomentar esta linea para que se haga un solo intento
        boolean continuar = false;
        if (infinito) {
            while (continuar != true) {
                cuadrado = random(cuadrado);
                mostrarMatriz(cuadrado);
                continuar = imprimirResultado(cuadrado);
            }
        }
        else{
                cuadrado = random(cuadrado);
                mostrarMatriz(cuadrado);
                continuar = imprimirResultado(cuadrado);
            }
        }

    public static void mostrarMatriz(Integer cuadrado[][]){
        for (int i = 0; i < cuadrado.length; i++) {
            System.out.print("\n" + cuadrado[i][0] + " " + cuadrado[i][1] + " " + cuadrado[i][2]);
        }
    }
    public static boolean comprobarMatriz(Integer cuadrado[][]){
        boolean cuadradomagico = false;
        if(ComprobarFilas(cuadrado) && ComprobarColumnas(cuadrado) && ComprobarDiagonalUno(cuadrado) && ComprobarDiagonalDos(cuadrado)) {
            cuadradomagico = true;
        }
        return cuadradomagico;
    }
    public static boolean imprimirResultado(Integer cuadrado[][]){
        if (comprobarMatriz(cuadrado)){
            System.out.println("\nTu cuadrado cumple con las condiciones para ser un cuadrado magico");
        }
        else {
            System.out.println("\nTu cuadrado no es magico");
        }
        return comprobarMatriz(cuadrado);
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
            suma += m[n][2 - n];
        }
        if (suma != 15) {
            condicion = false;
        }
        return condicion;
    }
}


