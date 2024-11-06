public class Solução{
    public static void main(String[] args) {
        String palavra1= "oi";
        String palavra2="oi";

        char[] wordSepara1= palavra1.toCharArray();
        char[] wordSepara2= palavra2.toCharArray();

        StringBuilder merged = new StringBuilder();

        int maxValue = Math.max(wordSepara1.length, wordSepara2.length);


        for(int i =0;i<maxValue;i++){
            if(i<wordSepara1.length){
                merged.append(wordSepara1[i]);
            }
            if(i<wordSepara2.length){
                merged.append(wordSepara2[i]);
            }
        }
        System.out.println(merged);
    }
}