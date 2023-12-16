import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //criar array bidimensional, pois precisamos saber as notas individuais dos alunos e a média da turma
        double[][] arrayTurma = {{9, 8, 7, 8}, {10, 9, 8, 9}, {9, 8, 7, 8}};

        //variável 'turma' tipo double inicializada em zero pra calcular a média da turma
        double turma = 0;

        //loop irá percorrer as notas de cada aluno da turma
        for (int i = 0; i < arrayTurma.length; i++){
            double aluno = 0; //variável 'aluno' irá iniciar em zero (aluno 0, 1, 2...)

            //loop vai percorrer por todas as notas do aluno atual e vai adicionar cada uma à variável 'aluno'
            for (int j = 0; j < arrayTurma[i].length; j++){
                aluno += arrayTurma[i][j];
            }

            //calcula a média do aluno atual e divide a soma total das notas dele e divide pelo total de notal
            double mediaDoAluno = aluno / arrayTurma[i].length;
            System.out.println("Aluno " + i + " - Média " + mediaDoAluno);
            turma += mediaDoAluno; //adicionar a média do aluno atual à turma pra depois descobrir a média da turma
        }

        //descobrir a média da turma com base no total de alunos e na soma das médias de cada aluno
        double mediaDaTurma = turma / arrayTurma.length;
        System.out.println("Média da turma: " + mediaDaTurma);

    }
}
