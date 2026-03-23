import java.util.Arrays;

import static java.lang.IO.*;
public class ArraysAssistantFunctions {
    public void displayArray(int[] tab){
        Arrays.toString(tab);
    }
    public int calculateAvg(int[] tab){
        return(Arrays.stream(tab).sum()/tab.length);
    }
    public int findElementIndex(int[] tab,int value){
        return(Arrays.binarySearch(tab,value));
    }
    public void zeroEven(int[] tab){
        for (int i=0;i<tab.length;i++){
            if (tab[i]%2==0){tab[i]=0;}
        }
    }
    public void zeroOdd(int[] tab){
        for(int i=0;i<tab.length;i++){}
    }
    public void returnArraySquared(int[] tab){
        for (int i=0;i<tab.length;i++){tab[i]=tab[i]*tab[i];}
    }
    public ExtremumIndex findMin(int[] tab){
        ExtremumIndex ex1 = new ExtremumIndex(0,0);
        for(int i=0;i<tab.length;i++){
            if(tab[i]<ex1.extremum){ex1.extremum=tab[i];}
        }
        ex1.index = (Arrays.binarySearch(tab,ex1.extremum));
        return ex1;
    }
    public ExtremumIndex findMax(int[] tab){
        ExtremumIndex ex1 = new ExtremumIndex(0,0);
        for(int i=0;i<tab.length;i++){
            if(tab[i]>ex1.extremum){ex1.extremum=tab[i];}
        }
        ex1.index = (Arrays.binarySearch(tab,ex1.extremum));
        return ex1;
    }
    public class ExtremumIndex {
        private int extremum;
        private int index;

        public ExtremumIndex(int extremum, int index) {
            this.extremum = extremum;
            this.index = index;
        }

        public int getExtremum() {
            return extremum;
        }

        public int getIndex() {
            return index;
        }
    }
}
