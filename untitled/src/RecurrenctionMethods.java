public class RecurrenctionMethods {
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
}
