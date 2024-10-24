import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type a number: (numero x)");
        int x = scan.nextInt();
        System.out.println("type another: (number y)");
        int y = scan.nextInt();

        System.out.println("type an operation (A-addition, S-subtraction, M-multiplication, D-division)");
        String operation = scan.next();
        
        int result = 0;

        if(operation.equalsIgnoreCase("A")){
            result= x+y;
            System.out.println("the result is "+ result);
        }else if(operation.equalsIgnoreCase("S")){
            result= x-y;
            System.out.println("the result is "+ result);
        }else if(operation.equalsIgnoreCase("M")){
            result=x*y;
            System.out.println("the result is "+ result);
        }else if(operation.equalsIgnoreCase("D")){
            result=x/y;
            System.out.println("the result is"+result);
        }else{
            System.out.println("invalid character");
        }
    }
    
}
