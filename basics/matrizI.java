import java.util.Random;

public class matrizI {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Random numeroRandon = new Random();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroRandon.nextInt(10);

                System.out.print(matriz[i][j] + " ");

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Maior= " + maior + " menor=" + menor);
    }
}
