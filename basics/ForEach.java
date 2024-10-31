import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int[] notas = new int[3];

        Random randomicNum = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = randomicNum.nextInt(10);
        }

        for (int nota : notas) {
            System.out.print(nota+", ");
        }
    }
}
