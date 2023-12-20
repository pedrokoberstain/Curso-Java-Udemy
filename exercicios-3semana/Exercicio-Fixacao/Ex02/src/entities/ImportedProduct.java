package entities;

// Subclasse representando um produto importado
public class ImportedProduct extends Product {

    private Double customsFee;

    // Construtor
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    // Getters e setters específicos
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // Método para calcular o preço total, incluindo a taxa de importação
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    // Sobrescrita do método para obter a etiqueta de preço específica para produtos importados
    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Taxa de importacao: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }
}
