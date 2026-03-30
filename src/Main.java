import java.lang.IO.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//void main() {
//   Product product = new Product();
//    product.setName("laptop");
//    product.setTax(0.23);
//    product.setPriceNetto(4500);
//   product.setQuantity(50);
//  product.Display();
//
//}

void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArraysAssistantFunctions af = new ArraysAssistantFunctions();
    ArraysAssistantFunctions.ExtremumIndex ex1= af.new ExtremumIndex();
    int size;
    do{
        size = sc.nextInt();
    }while(size<=0);
    int[] tab = new int[size];
    for(int i=0;i<size;i++){
        tab[i]=sc.nextInt();
    }
    af.findMin(tab);
}
