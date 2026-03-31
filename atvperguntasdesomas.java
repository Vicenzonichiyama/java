
package atvmedianadosalunos;

import java.util.Scanner;

public class AtvMedianaDosAlunos {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("calculadora de média de aluno:");
       System.out.println("digite o nome do aluno:");
       String nome = sc.nextLine();
        System.out.println("digite a nota 1 do aluno:");
        int n1 = sc.nextInt();
        System.out.println("digite a nota 2 do aluno:");
        int n2 = sc.nextInt();
        System.out.println("digite a nota 3 do aluno:");
        int n3 = sc.nextInt();
        System.out.println("digite a nota 4 do aluno:");
        int n4 = sc.nextInt();
        double media = ( n1 + n2 + n3 + n4) / 4;
        System.out.println("A media do aluno: "+ nome+" é:" + media);
 
        
    }
    
}
