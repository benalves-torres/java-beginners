package Desafios;
import java.util.*;


public class teste3 {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        
        int N = numero.nextInt();
        int soma = 0;
        
        for(int i = N; i >= 1; i--) {
          soma = soma + i;
        }
        System.out.println(soma);
    }
}