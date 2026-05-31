import java.math.BigDecimal;
public class ProductEnum {
    private String name;
    private BigDecimal price;
    private int quantity;
    private Category category;

    // Konstruktor parametryczny - pozwala na szybkie tworzenie obiektu z kompletem danych
    public ProductEnum(String name, BigDecimal price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    // --- Metoda biznesowa ---
    // Oblicza całkowitą wartość danej pozycji (cena * ilość)
    public BigDecimal calculateTotalPrice() {
        // Konwertujemy int (quantity) na BigDecimal, aby móc wykonać bezpieczne mnożenie metodą .multiply()
        return this.price.multiply(BigDecimal.valueOf(this.quantity));
    }

    // --- Gettery i Settery ---
    // Umożliwiają kontrolowany dostęp do prywatnych pól klasy

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    // --- Nadpisanie metody toString() ---
    // Dzięki temu System.out.println(product) automatycznie wypisze te dane w ładnej formie
    @Override
    public String toString() {
        return "Produkt: " + name +
                " | Kategoria: " + category +
                " | Cena jedn.: " + price + " zł" +
                " | Ilość: " + quantity;
    }
}
