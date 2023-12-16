import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrayNums[] = {1, 2, 3, 4, 5};

        //chamando a função 'arraySomaAcumulada' e passando 'arrayNums' como parâmetro
        arraySomaAcumulada(arrayNums);

        //pra ler saída 'Output: [x, y, z]'
        System.out.print("Output: [");

        //loop pra iterar sobre cada elemento da arrayNums
        for (int i = 0; i < arrayNums.length; i++) {
            if (i < arrayNums.length - 1) { //aq verifica se o valor atual de 'i' é MENOR (-1) q o índice do último elemento da arrayNums
                System.out.print(arrayNums[i] + ", ");
            } else {
                System.out.print(arrayNums[i] + "]");
            }
        }
    }
    //função 'arraySomaAcumulada' definida e q irá receber uma array de int nums como parâmetro
    public static void arraySomaAcumulada(int[] nums) {

        //loop q começa a iterar a partir do 2º índice da array
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; //pega o elemento atual da array nums e soma com o elemento atual e soma com o elemento anterior (i - 1)
        }
    }
}