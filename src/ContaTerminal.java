import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia, nome_cliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira os dados a seguir.\nNumero: ");
        numero = scanner.nextInt();

        System.out.println("Agencia: ");
        agencia = scanner.next();

        System.out.println("Seu primeiro nome: ");
        nome_cliente = scanner.next();

        System.out.println("Saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("\n\nOla, " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia eh " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " ja esta disponivel para saque.");
    }
}