public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private double taxaJuros;

    public ContaBancaria(String numeroConta, double saldo, double taxaJuros) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void fazerDeposito(double valor){
        if(valor>0){
            saldo+=valor;

            System.out.println("Deposito no valor de, "+valor+" foi realizado com sucesso");
        }else{
            System.out.println("valor de deposito invalido");
        }
    }

    public void sacar(double valor){
        if(valor>0 && valor<=saldo){
            saldo-=valor;
            System.out.println("saque no valor de"+valor+" foi realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double calcularValorEmprestimo(double valor){
        
        double taxaJurosAnual = taxaJuros / 100.0; 
        
        int prazo = 1;
    
        int n = 1;
    
        double valorTotal = valor * Math.pow(1 + (taxaJurosAnual / n), n * prazo);
    
        System.out.println("O valor estimado do empréstimo é: " + valorTotal);
        return valorTotal;
    }
    
    public void pegarEmprestimo(double valor){
        double valorTotal = calcularValorEmprestimo(valor);
        saldo += valorTotal;
        System.out.println("Empréstimo no valor de " + valorTotal + " adicionado à conta.");
    }
    
    
}
