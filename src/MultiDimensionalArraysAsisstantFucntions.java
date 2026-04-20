import java.util.Scanner;
import static java.lang.IO.*;

public class git MultiDimensionalArraysAsisstantFucntions {
    Scanner input = new Scanner(System.in);
    public void fill2DArray(int[][] array, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]= input.nextInt(11);
            }
        }
    }
    public void sumOfSquareArrayDiagonal(int[][] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][i];
        }
    }
}
