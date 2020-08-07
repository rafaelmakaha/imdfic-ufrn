import java.util.Scanner;

public class Aula03AutoAvaliacaoEx02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String n1 = leitor.nextLine();
        String n2 = leitor.nextLine();
        String n3 = leitor.nextLine();
        System.out.println(n3 + n2 + n1);
        leitor.close();
    }
}