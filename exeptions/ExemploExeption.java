import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

public class ExemploExeption {
    public static void main(String[] args) {

        Number valor;

        try {
            valor = NumberFormat.getInstance().parse("a150.00");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        


    }
    


}