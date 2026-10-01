import java.util.Comparator;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.price != p2.price) {
            return Integer.compare(p2.price, p1.price); // Descending price
        }
        return p1.name.compareTo(p2.name); // Alphabetical name for equal prices
    }
}

