import java.util.ArrayList;
import java.util.Random;

class CuadradoMagic {
    public static void main(String[] args) {
        Integer[][] cuadradoMagico = new Integer[3][3];
        llenarCuadrado(cuadradoMagico);
        verificarCuadrado(cuadradoMagico);
    }

    public static int[][] llenarCuadrado(int[][] m) {
        Random azar = new Random();
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                m[fila][columna] = azar.nextInt(9) + 1;
            }
        }
        return m;
    }

    public static boolean verificarCuadrado(int[][] m) {
        boolean esMagico = false;
        for (int fila = 0; fila < 3; fila++) {
            if (m[fila][0] + m[fila][1] + m[fila][2] == 15) {
                if (m[0][0] + m[1][1] + m[2][2] == 15) {
                    if (m[0][2] + m[1][1] + m[2][0]) {
                        esMagico = true;
                    }
                }
            }
        }
        return esMagico;
    }
}
