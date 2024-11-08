import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegex {
    public static void main(String[] args) {
        String i = "abca"
        String s = "abcabcabcabc";
        Pattern t = Pattern.compile(i);

        

        Matcher ancor = t.matcher(s);

        int constador = 0;
        while (ancor.find()) {
            constador++;
        }

        System.out.println(constador);

        return 
    }
}
