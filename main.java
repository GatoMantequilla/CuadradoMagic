    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

    public class main {
        public static void main(String[] args) {
            Integer cuadrado[][] = new Integer[3][3];
            cuadrado = random(cuadrado);
            for (int i = 0; i < cuadrado.length; i++) {
                    System.out.print("\n" + cuadrado[i][0] + " " + cuadrado[i][1] + " " + cuadrado[i][2]);
                }
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
    }


