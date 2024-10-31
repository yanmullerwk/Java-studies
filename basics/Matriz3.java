import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz3x3 = new int[3][3];

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                System.out.print("Digite um número: ");
                int numero = scan.nextInt();
                matriz3x3[i][j] = numero;
            }
        }
        System.out.println();
        System.out.println("imprime:");
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3[i].length; j++) {
                System.out.print(matriz3x3[i][j] + " ");
            }
            System.out.println();
        }
    }

}
