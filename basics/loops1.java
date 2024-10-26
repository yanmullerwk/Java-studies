import java.util.ArrayList;

public class loops1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 10; i >= 1; i--){
            num.add(i);
        }
        System.out.println(num);
    }
}
