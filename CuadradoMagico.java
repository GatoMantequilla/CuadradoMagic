public class CuadradoMagico {

    public Boolean ComprobarFilas(int[][] m) {
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

    public Boolean ComprobarColumnas(int[][] m) {
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

    public Boolean ComprobarDiagonalUno(int[][] m) {
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

    public Boolean ComprobarDiagonalDos(int[][] m) {
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


    public static void main(String[] args) {
        int[][] matriz = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

    }


}
