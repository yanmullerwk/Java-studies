public class ForataCep {
    public static void main(String[] args) {
        try {
            String meucepFormatado = formatarCep("12312328");
        } catch (CepInvalidoException e) {
            //informa a exception
            e.printStackTrace();
            System.out.println("errado!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!= 8)
        throw new CepInvalidoException();
        
        //simula um cp formatado
        return "23.765-064";
    }
}
