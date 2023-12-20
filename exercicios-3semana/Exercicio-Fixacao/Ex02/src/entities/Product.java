package entities;

// Classe base para representar um produto comum
public class Product {

    private String name;
    private Double price;

    // Construtor
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Método para obter a etiqueta de preço
    public String priceTag() {
        return name
                + " $ "
                + String.format("%.2f", price);
    }
}