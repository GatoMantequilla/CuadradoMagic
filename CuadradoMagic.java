import java.util.Random;

class CuadradoMagic {
    public static void main(String[] args) {
        Integer[][] cuadradoMagico = new Integer[3][3];
        llenarCuadrado(cuadradoMagico);
        // verificarCuadrado(cuadrado);
    }

    public static void llenarCuadrado(Integer[][] m) {
        Random azar = new Random();
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                m[fila][columna] = azar.nextInt(9) + 1;
            }
        }
    }

    public static boolean verificarCuadrado(Integer[][] m) {
        boolean esMagico = false;
        for (int fila = 0; fila < 2; fila++) {
            if (m[fila][0] + m[fila][1] + m[fila][2] == 15) {
                esMagico = true;
            }
        }
        return esMagico;
    }
}
