
import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class ValidacaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade > 120) {
                throw new IdadeInvalidaException("Idade inválida!");
            }

            System.out.println("Idade válida!");

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
