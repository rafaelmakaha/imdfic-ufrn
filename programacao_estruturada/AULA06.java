public class AULA06{

    public static void main(String args[]){

        int m=10;

        int n=10;

        int[][] mtz= new int[m][n];

        int c=0;

        for(int i=0;i<10;i++){

            for(int j=0;j<10;j++){

                mtz[i][j]=0;

                c=c+1;

            }

        }

        System.out.println(c==(m*n));

    }

}