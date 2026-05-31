import static java.lang.IO.*;

//void main() {
//   Product product = new Product();
//    product.setName("laptop");
//    product.setTax(0.23);
//    product.setPriceNetto(4500);
//   product.setQuantity(50);
//  product.Display();
//}

//void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    ArraysAssistantFunctions af = new ArraysAssistantFunctions();
//    ArraysAssistantFunctions.ExtremumIndex ex1= af.new ExtremumIndex();
//    int size;
//    do{
//        size = sc.nextInt();
//    }while(size<=0);
//    int[] tab = new int[size];
//    for(int i=0;i<size;i++){
//        tab[i]=sc.nextInt();
//    }
//    ex1 = af.findMin(tab);
//    int avg = af.calculateAvg(tab);
//    for(int i=0;i<size;i++){
//        if(tab[i]<avg){
//            println(tab[i]);
//        }
//    }
//    int[] tab2 = new int[size];
//    tab2 = Arrays.copyOf(tab,size);
//
//}
//void main() {
//int n, element;
// Scanner sc = new Scanner(System.in);

//int[][] arr = new int[n][n];
// MultiDimensionalArraysAsisstantFucntions MDAAF = new MultiDimensionalArraysAsisstantFucntions();
//    MDAAF.fill2DArray(arr, n, n);
//    element = MDAAF.findSmallestElement(arr, n);
//    MDAAF.displayElementIndexes(arr, element);
//    print(MDAAF.howManyAreSmallerThanAvarage(arr));
//    MDAAF.checkboard(arr);

//    MDAAF.scan2DArray(arr);
//    MDAAF.Display2DArray(arr);
//    MDAAF.matrixTurn90degrees(arr);
//    MDAAF.Display2DArray(arr);
// int x = sc.nextInt(), n = sc.nextInt();
//RecurrenctionMethods RM = new RecurrenctionMethods();
// println(RM.power(2,-4));
//}
//void main() {
//    RecurrenctionMethods RM = new RecurrenctionMethods();
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int k = sc.nextInt();
//    //println(RM.factorial(x));
//    println(RM.digit(n,k));
//}
void main() {
    // Tworzymy obiekty klasy Product przy użyciu konstruktora parametrycznego.
    // Ważne: Ceny podajemy jako String w konstruktorze BigDecimal ("2499.99"),
    // aby zachować idealną precyzję ułamków.
    ProductEnum p1 = new ProductEnum("Laptop", new BigDecimal("2499.99"), 5, Category.ELECTRONICS);
    ProductEnum p2 = new ProductEnum("Shirt", new BigDecimal("39.99"), 18, Category.CLOTHING);
    ProductEnum p3 = new ProductEnum("Book", new BigDecimal("19.99"), 12, Category.BOOKS);

    // Wrzucamy produkty do tablicy, żeby wygodnie przejść przez nie pętlą
    ProductEnum[] products = {p1, p2, p3};

    System.out.println("=== LISTA PRODUKTÓW I ICH WARTOŚĆ CRRAZWITA ===");

    // Pętla for-each przechodząca przez każdy produkt w tablicy
    for (ProductEnum product : products) {
        // Niejawnie wywoła się tutaj nadpisana metoda toString() z klasy Product
        System.out.println(product);

        // Wywołujemy naszą dedykowaną metodę do obliczenia wartości łącznej
        System.out.println("-> Łączna cena za ten zapas: " + product.calculateTotalPrice() + " zł");
        System.out.println("--------------------------------------------------");
    }
}