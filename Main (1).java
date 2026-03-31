import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] historico = new String[10]; 
        int contador = 0; 
        boolean continuar = true;

        System.out.println("Calculadora com Histórico");

        while (continuar) {
            System.out.print("\nDigite o 1º número: ");
            double n1 = leitor.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char op = leitor.next().charAt(0);

            System.out.print("Digite o 2º número: ");
            double n2 = leitor.nextDouble();

            double resultado = 0;
            boolean erro = false;
            String operacaoFormatada = "";

            switch (op) {
                case '+': resultado = n1 + n2; break;
                case '-': resultado = n1 - n2; break;
                case '*': resultado = n1 * n2; break;
                case '/': 
                    if (n2 != 0) resultado = n1 / n2; 
                    else { System.out.println("Erro: Divisão por zero!"); erro = true; }
                    break;
                default: System.out.println("Operador inválido!"); erro = true;
            }

            if (!erro) {
                operacaoFormatada = n1 + " " + op + " " + n2 + " = " + resultado;
                System.out.println("Resultado Atual: " + operacaoFormatada);

                if (contador < 10) {
                    historico[contador] = operacaoFormatada;
                    contador++;
                } else {
                    System.out.println("(Histórico cheio! Apenas as 10 primeiras foram salvas)");
                }
            }

            System.out.println("\n[1] Nova Operação | [2] Ver Histórico | [3] Sair");
            int opcao = leitor.nextInt();

            if (opcao == 2) {
                System.out.println("\n ÚLTIMAS OPERAÇÕES ");
                if (contador == 0) System.out.println("Histórico vazio.");
                for (int i = 0; i < contador; i++) {
                    System.out.println((i + 1) + ": " + historico[i]);
                }
            } else if (opcao == 3) {
                continuar = false;
                System.out.println("Encerrando...");
            }
        }
        leitor.close();
    }
}