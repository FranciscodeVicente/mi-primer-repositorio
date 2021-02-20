package Miprograma;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ackage webinar03;

/**
 * Ejercicio 3: Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la
 * siguiente forma: la posición T[n,m] debe contener n+m. Después se debe
 * mostrar su contenido.
 *
 * @author Silvia
 */
        public class Ejercicio3 {
            public static void main(String[] args) {
                int[][] tabla = new int[5][5];

                for (int fila = 0; fila < 5; fila++) {
                    for (int col = 0; col < 5; col++){
                        tabla[fila][col] = fila + col;
                    }
                }

                for (int fila = 0; fila < 5; fila++) {
                    for (int col = 0; col < 5; col++){
                        System.out.print(tabla[fila][col]);
                    }
                    System.out.println("");


                    or (int fila = 0; fila < 4; fila++) {
                        for (int col = 0; col < 4; col++){
                            System.out.print(tabla[fila][col]);
                        }
                        System.out.println("");
                    }
                }

            }

        }
}
