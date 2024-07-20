import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        
          // Simulação de uma animação de carregamento
          System.out.println("Carregando o sistema bancário...");
          for (int i = 0; i < 25; i++) {
              Thread.sleep(50); // Aguarda por 50 milissegundos
              System.out.print("\b/"); // Caractere que simula movimento
              Thread.sleep(50);
              System.out.print("\b-");
              Thread.sleep(50);
              System.out.print("\b\\");
              Thread.sleep(50);
              System.out.print("\b|");
          }
          Thread.sleep(200); // Aguarda um pouco no final da animação
          System.out.println("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
          
          
          // Exibição da "logo"
          System.out.println("*****************************************");
          System.out.println("*                                       *");
          System.out.println("*           BEM-VINDO AO BANCO          *");
          System.out.println("*                                       *");
          System.out.println("*****************************************\n");
          
        System.out.println("Você deseja criar uma conta? Digite [y] para sim e [n] para não");
        String resposta = scan.next();

        if (resposta.equalsIgnoreCase("y")) {
            System.out.println("Digite o número da conta:");
            String numeroConta = scan.next();
            System.out.println("Digite o saldo inicial:");
            double saldoInicial = scan.nextDouble();
            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, saldoInicial, 790);
            boolean continuar = true;
            
            System.out.println("Parabéns, você criou uma conta!");

            while (continuar) {
                System.out.println("\nQual ação você deseja fazer?");
                System.out.println("1. Sacar");
                System.out.println("2. Depositar");
                System.out.println("3. Calcular empréstimo");
                System.out.println("4. Fazer empréstimo");
                System.out.println("5. Visualizar saldo");
                System.out.println("6. Sair");
                int acao = scan.nextInt();

                switch (acao) {
                    case 1:
                        System.out.println("Você escolheu: sacar");
                        System.out.println("Qual valor você deseja sacar?");
                        double valorSaque = scan.nextDouble();
                        contaBancaria.sacar(valorSaque);
                        Thread.sleep(1000);
                        break;
                    case 2:
                        System.out.println("Você escolheu: depositar");
                        System.out.println("Qual valor você deseja depositar?");
                        double valorDeposito = scan.nextDouble();
                        contaBancaria.fazerDeposito(valorDeposito);
                        Thread.sleep(1000);
                        break;
                    case 3:
                        System.out.println("Você escolheu: calcular empréstimo");
                        System.out.println("Qual valor de empréstimo você deseja calcular?");
                        double valor = scan.nextDouble();
                        contaBancaria.calcularValorEmprestimo(valor);
                        Thread.sleep(1000);
                        break;
                    case 4:
                        System.out.println("Você escolheu: fazer empréstimo");
                        System.out.println("Qual o valor de empréstimo desejado?");
                        double valorEmprestimo = scan.nextDouble();
                        contaBancaria.pegarEmprestimo(valorEmprestimo);
                        Thread.sleep(1000);
                        break;
                    case 5:
                        System.out.println("Saldo atual: " + contaBancaria.getSaldo());
                        Thread.sleep(1000);
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        Thread.sleep(1000);
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Escolha novamente.");
                        break;
                }
            }
        } else {
            System.out.println("Obrigado por utilizar nosso banco. Até mais!");
        }
        
        scan.close();
    }
}
