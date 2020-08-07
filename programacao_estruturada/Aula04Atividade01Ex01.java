import java.util.Scanner;

public class Aula04Atividade01Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int n3 = leitor.nextInt();
        int n4 = leitor.nextInt();
        int n5 = leitor.nextInt();
        boolean ans= (n1+n2+n3+n4+n5) % 2 == 0;
        if (ans){
            System.out.println("Múltiplo de 2");
        }
        leitor.close();
    }
}