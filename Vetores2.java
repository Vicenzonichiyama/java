
package vetores2;

public class Vetores2 {

    public static void main(String[] args) {
  int [] notas = new int[10];
       int i=0;
       while(i<notas.length) {
           notas[i]= i + 1;
           i++;
    }
       for(int j=0;j<notas.length;j++)
           System.out.println("o valor da posiçao"+ j+ "é="+ (notas[j]));
    
}
}