import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //definição das arrays A e B de int
        int[] arrayA = {1, 2, 3, 4};
        int[] arrayB = {5, 6, 7, 8};

        //array C será usada pra concatenar as arrays A + B e alternar os índices entre uma e outra
        int[] arrayC = concatenaArrays(arrayA, arrayB);

        //pra ler saída 'Output: [x, y, z]
        System.out.print("Output: [");
        for(int i = 0; i < arrayC.length; i ++) {
            if (i < arrayC.length - 1) { //aq verifica se o valor atual de 'i' é MENOR (-1) q o índice do último elemento da arrayC
                System.out.print(arrayC[i] + ", ");
            } else {
                System.out.print(arrayC[i] + "]");
            }
        }
    }
    //função pra concatenar as arrays e passa a array A e a array B como parâmetros
    public static int[] concatenaArrays(int[] arrayA, int[] arrayB){
        //tamanho da NOVA array será igual à soma dos índices das arrays A e B
        int[] arrayC = new int[arrayA.length + arrayB.length]; //criando uma NOVA array de inteiros 'arrayC'
        int posicaoAtualArrayC = 0; //vai começar no índice zero

        //loop pra percorrer CADA elemento das arrays A e B. Pode colocar só o arrayA pq ele é do MESMO tamanho do arrayB
        for(int i = 0; i < arrayA.length; i++){
            arrayC[posicaoAtualArrayC++] = arrayA[i]; //elemento atual [i] da arrayA é adicionado à arrayC
            arrayC[posicaoAtualArrayC++] = arrayB[i]; //elemento atual [i] da arrayB é adicionado à arrayC
        }
        return arrayC;
    }
}
