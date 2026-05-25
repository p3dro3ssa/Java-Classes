import java.util.Scanner;
import java.util.Random;
import static java.lang.IO.*;

public void main() {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    int n = sc.nextInt();
    int[][] arr = new int[n][n];
    int[][] arr90degree = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            arr[i][j] = r.nextInt(10);
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            print(arr[i][j] + " ");
        }
        println();
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            arr90degree[i][j] = arr[n-j-1][i];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            print(arr90degree[i][j] + " ");
        }
        println();
    }
}
