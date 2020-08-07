import java.util.Scanner;

public class AULA07 {

    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra");

        String palavra1=leitor.next();

        System.out.println("Digite outra palavra");

        String palavra2=leitor.next();

        if(palavra1.toUpperCase().equals(palavra2.toUpperCase())){

            System.out.println("Palavras iguais");

        }else{

            System.out.println("Palavras diferentes");

        }
        leitor.close();

    }

}