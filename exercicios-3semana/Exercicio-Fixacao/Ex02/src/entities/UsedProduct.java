package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Subclasse representando um produto usado
public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    // Construtor
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    // Getters e setters específicos
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Sobrescrita do método para obter a etiqueta de preço específica para produtos usados
    @Override
    public String priceTag() {
        return getName()
                + " (usado) $ "
                + String.format("%.2f", getPrice())
                + " (Data de fabricacao: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
