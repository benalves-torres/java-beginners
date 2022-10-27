package Desafios;
import java.util.*;

public class teste5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        
        int[] vetor = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
       
        boolean achou = false;
        for(int i = 0; i < vetor.length-1; i++){
          if(vetor[i] == valor){
            System.out.println("Achei " + valor + " na posicao " + i);
            achou = true;
           } 
        }
        if(!achou){
          System.out.println("Numero " + valor + " nao encontrado!");
        }
           
     }
}

