import java.util.ArrayList;
//imprimir a sequencia 1 2 3 4 5 10 20 30 40 50 em um array;
public class loop2 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 1; i<=5; i++){
            num.add(i);
        }

        for(int i = 10; i<=50;i+=10){
            num.add(i);
        }
        
        System.out.println(num);
    }
}