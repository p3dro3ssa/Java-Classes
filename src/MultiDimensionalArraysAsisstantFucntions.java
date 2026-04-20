import java.util.*;
import static java.lang.IO.*;

public class MultiDimensionalArraysAsisstantFucntions {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    public int sumOf2DArray(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    public void fill2DArray(int[][] array, int n, int m){
        int min = input.nextInt();
        int max;
        do{
            max = input.nextInt();
        }while(max<min);
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]= rand.nextInt((max- min) +1) + min;
            }
        }
    }
    public void Display2DArray(int[][] array, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                print(array[i][j]+" ");
            }
        }
    }
    public void sumOfSquareArrayDiagonal(int[][] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i][i];
        }
    }
    public int findSmallestElement(int[][] array, int n){
        int smallest = array[0][0];
        for (int i = 0; i < n; i++) {
            smallest = Math.min(smallest, array[i][i]);
        }
        return smallest;
    }
    public void findLargestElement(int[][] array, int n){
        int largest = array[0][0];
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, array[i][i]);
        }
    }
    public void countElementAppearance(int[][] array, int n, int m, int element){
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == element) {
                    count++;
                }
            }
        }
        println("Appearances of element: "+count);
    }
    public void displayElementIndexes(int[][] array, int element){
        print("All element's Indexes: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == element) {
                    print(i+","+j+" ");
                }
            }
        }
        println("");
    }
    public int Avarage2dArray(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
        }
        return sum/(array.length*array[0].length);
    }
    public int howManyAreSmallerThanAvarage(int[][] array){
        int avarage = Avarage2dArray(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < avarage) {
                    count++;
                }
            }
        }
        return count;
    }
}
