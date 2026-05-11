import java.util.Scanner;

public class Matriz1 {
    public static void preencherMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = (int) (Math.random() * 8);

            }

        }

    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("%3d", matriz[i][j]);

            }

            System.out.println();

        }

    }

    public static void substituirPares(int[][] matriz, int num) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if ((i + j) % 2 == 0) {

                    matriz[i][j] = num;

                }

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[8][8];

        preencherMatriz(matriz);

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        System.out.println("\nDigite um número:");
        int num = sc.nextInt();

        substituirPares(matriz, num);

        System.out.println("\nMatriz alterada:");
        mostrarMatriz(matriz);

        sc.close();

    }
}
