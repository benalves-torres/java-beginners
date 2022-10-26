package Desafios;
import java.util.*;

public class teste1 {

    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        //TODO: Imprima se os valores numéricos passados são iguais ou não.
      int A;
      int B;
      
      A = leitor.nextInt();
      B = leitor.nextInt();

      if (A == B) {
        System.out.println("Sao iguais!");
      }else {
        System.out.print("Nao sao iguais!");
            }
            
      }
}