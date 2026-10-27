
import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double saque) {
        super(String.format(
            "Saldo insuficiente. Saldo disponível: R$ %.2f. Valor solicitado: R$ %.2f.",
            saldo, saque
        ));
    }
}

public class SaqueBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Saldo disponível: R$ ");
            double saldo = scanner.nextDouble();

            System.out.print("Valor do saque: R$ ");
            double saque = scanner.nextDouble();

            if (saque <= 0) {
                throw new IllegalArgumentException(
                    "O valor do saque deve ser maior que zero."
                );
            }

            if (saque > saldo) {
                throw new SaldoInsuficienteException(saldo, saque);
            }

            saldo -= saque;

            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Saldo restante: R$ %.2f%n", saldo);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
