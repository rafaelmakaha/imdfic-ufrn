import java.util.Scanner;

public class AULA08 {

    public static final int fabio=2;
    public static void main(String args[]){
        Scanner leitor= new Scanner(System.in);

        // System.out.println("Digite uma palavra");

        // String palavra=leitor.next();

        // System.out.println(primeiraMaiuscula(minusculo(palavra)));
        System.out.println(X(4));
        leitor.close();

    }
    public static int X (int n) {

        if (n == 1 || n == 2) return n;
    
        else return X(n-1) + n * X(n-2);
    
    }

    public static String minusculo(String x){
        System.out.println(fabio);
       return x.toLowerCase();

    }

    public static String primeiraMaiuscula(String x){

       return x.substring(0, 1).toUpperCase().concat(x.substring(1));

    }

}

