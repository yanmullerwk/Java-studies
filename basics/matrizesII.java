/*
gere e imprima uma matriz 10X10 com valores aleatorios entre 0-9.
após isso, indique qual o maior e o menor valor dalinha 5 e qual o 
maiorm e menor valor da coluna 7.
 */

import java.util.Random;

public class matrizesII {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        Random numeRandom = new Random();
    
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j]=numeRandom.nextInt(9);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        int maiorL5=0;
        int menorL5=0;
        for(int i=0; i<matriz[5].length;i++){
            if(matriz[5][i]>maiorL5){
                maiorL5=matriz[5][i];
            }
            if(matriz[5][i]<menorL5){
                menorL5=matriz[5][i];
            }
        }

        System.out.println("maior valor L5="+maiorL5);
        System.out.println("menor valor L5="+menorL5);
        
        int maior7=0;
        int menor7=0;
        for(int i=0; i<matriz.length;i++){
            if(matriz[i][7]>maior7){
                maior7=matriz[i][7];
            }
            if(matriz[i][7]<menor7){
                menor7=matriz[i][7];
            }
        }

        System.out.println("maior valor col7="+maior7);
        System.out.println("menor valor col7="+menor7);
        
    
    }
   
}
