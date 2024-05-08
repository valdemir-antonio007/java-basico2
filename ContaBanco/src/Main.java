import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        ContaTerminal ct = new ContaTerminal(7400, "0730-4",
              "Aldemir", 1500.0);

        ContaTerminal ct2 = new ContaTerminal(4321, "0730-4",
                "Zeronica", 1200.0);

        ArrayList<ContaTerminal> lista = new ArrayList<>();
        lista.add(ct);
        lista.add(ct2);
        Collections.sort(lista);
        System.out.println(lista.toString());

        Collections.sort(lista, new ContaTerminalByNumero());
        System.out.println(lista.toString());


        int opcao = 5;
        while(opcao != 3){
            System.out.println("Sistema Bancario Santander");
            System.out.println("Escolha uma opção: [1] Cadastrar Conta - [2] Relatório - [3] Sair");
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.print("Insira Seu nome");
                    String nome = leitor.next();
                    leitor.nextLine();
                    System.out.println("Por favor insira numero da Agencia: ");
                    String agencia = leitor.next();
                    System.out.println("Insira numero da conta: ");
                    int numero = leitor.nextInt();
                    System.out.println("Digite seu saldo");
                    double saldo = leitor.nextDouble();
                    ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);
                    lista.add(conta);
                    System.out.println("Olá" + conta.getNomeCliente()+ ", obrigado por criar uma " +
                            "conta em nosso banco, " + " sua agência é " + conta.getAgencia() +
                            ", conta "+ conta.getNumero()+ " e seu saldo "+conta.getSaldo()+
                            " já está disponível para saque\".");
                    break;
                case 2:
                    System.out.println("Relatório de Contas Cadastradas:");
                    Collections.sort(lista);
                    System.out.println(lista.toString());
                    break;
                case 3:
                    System.out.println("Finalizando o sistema...");
                    break;
                default:
                    System.out.println("Insira uma opção valida");
                    break;
            }
        }











    }
}