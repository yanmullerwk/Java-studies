import java.util.Arrays;

public class Quadrados {
    public static void main(String[] args) {
        int[] numeros = new int[11];

        for(int i=0; i<numeros.length; i++ ){
            numeros[i] = i*i;
        }
        System.out.println(Arrays.toString(numeros));
    }
}
