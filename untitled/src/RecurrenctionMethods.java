import java.util.Scanner;

import static java.lang.IO.*;

public class RecurrenctionMethods {
    Scanner sc = new Scanner(System.in);
    public double power(double x, int n){
        if(n==0 && x==0) return Double.NaN;
        if(n==0) return 1;
        if(n<0) return  1/power(x,-n);
        return x*power(x,n-1);
    }
    public double factorial(int n){
        if(n==0) return 1;
        if(n<0) return n*factorial(n+1);
        return n*factorial(n-1);
    }
    public int digitsSum(int n){
        if(n<10) return n;
        return n%10+digitsSum(n/10);
    }
    public int digitsCount(int n){
        if(n<10) return 1;
        return digitsCount(n/10)+1;
    }
    public boolean notDivisible(int n,int k){
        if(k==1) return true;
        if((n%k)==0) return false;
        return notDivisible(n,k-1);
    }
    public int digit(int n, int k){
        if(k==1) return n%10;
        return digit(n/10,k-1);
    }
}
