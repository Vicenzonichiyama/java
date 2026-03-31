import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        
       
        try (Scanner leitor = new Scanner(System.in)) {
            double soma = 0;
            System.out.println("digite o nome do aluno:");
            String nome = leitor.nextLine();
            
            System.out.println("digite o nome da escola do aluno:");
            String escola = leitor.nextLine();
            
            
            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = leitor.nextDouble();
                soma += numero; 
            }
            
           
            double media = soma / 6;
            
            System.out.println("\n--- Resultado ---");
            System.out.println("A soma total é: " + soma);
            System.out.println("A média dos 6 números é: " + media);
            
            if(media<6){
                System.out.println("O aluno não passou, nota abaixo da média");
            }
            else if(media>=6){
                System.out.println("O aluno passou!, nota acima da média");
            }
        }
    }
}
