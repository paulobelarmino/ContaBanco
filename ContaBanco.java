import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM-VIND AO TERMINAL TAC");
        System.out.println("-------------------------");
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o número de sua agência: ");
        String agencia = scanner.next();
        System.out.print("Digite o número da sua conta: ");
        int  numeroConta = scanner.nextInt();
        System.out.println("-------------------------");

        Conta conta = new Conta();
        conta.setNomeCliente(nomeCliente);
        conta.setAgencia(agencia);
        conta.setNumeroConta(numeroConta);

        System.out.println("Olá ".concat(conta.getNomeCliente()) + ", estes são os dados de sua conta:");
        System.out.println("Agência: ".concat(conta.getAgencia()));
        System.out.println("Nº da Conta: ".concat(Integer.toString(conta.getNumeroConta())));
        System.out.println("Seu saldo atual é R$".concat(Double.toString(conta.getSaldo())));



    }
}
