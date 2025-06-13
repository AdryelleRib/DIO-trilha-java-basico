import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
           
        System.out.println("*** Seja bem-vindo(a) ao Banco da DIO ***");
        System.out.println("Por favor, digite o número da sua Conta: ");
        int conta = sc.nextInt();
        System.out.println("Digite o número da Agência, no formato 111-1: ");
        String agencia = sc.next();
        System.out.println("Agora digite seu nome completo: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Informe seu saldo: ");
        double saldo = sc.nextDouble();
        
        System.out.println(String.format(
    "Olá %s, obrigado por criar uma conta em nosso banco, sua Agência é %s, o número da sua Conta é %d e seu saldo de R$ %.2f, já está disponível para saque.",
    nome, agencia, conta, saldo));
        

        sc.close();
    }
}
