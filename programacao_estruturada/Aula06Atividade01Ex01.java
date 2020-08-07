import java.util.Scanner;

/**
 * Aula6Atividade01Ex01
 */
public class Aula06Atividade01Ex01 {
    public static void main(String[] args) {
        int quantidade = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos alunos na turma?");
        quantidade = leitor.nextInt();
        int [] nota = new int[quantidade];
        for (int i=0; i < quantidade; i++){
            System.out.print("Digite a nota do " + (i+1) + "º aluno: ");
            nota[i] = leitor.nextInt();
            System.out.println();
        }
        for (int i=0; i < quantidade; i++){
            System.out.println("O aluno " + (i+1) +" tem nota " + nota[i]);
        }
        leitor.close();
    }
}