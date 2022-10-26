package Desafios;
import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
       
        int A, N;
        int soma = 0;
        
        Scanner leitor = new Scanner(System.in);
        A = leitor.nextInt();
        N = leitor.nextInt();

        for(int i = A; i <= N; i++ ){
          if(i % A == 0) {
            soma = soma + i;
          }
          
        }System.out.println(soma);
      }
}
