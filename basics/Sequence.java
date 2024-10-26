import java.util.ArrayList;
//imprimir sequencia de 10
public class Sequence {
    public static void main(String[] args) {
        ArrayList<Integer> sequencia = new ArrayList<>();

        for(int i = 10; i<=100; i= i+10){
            sequencia.add(i);
        }
        System.out.println(sequencia);
    }
}
