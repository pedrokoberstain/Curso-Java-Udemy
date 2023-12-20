package entities;

public class PessoaFisica extends Contribuintes {

    private Double Saude;

    public PessoaFisica(String name, Double rendaAnual) {
        super(name, rendaAnual);
    }

    public PessoaFisica(String name, Double rendaAnual, Double saude) {
        super(name, rendaAnual);
        Saude = saude;
    }

    public Double getSaude() {
        return Saude;
    }

    public void setSaude(Double saude) {
        Saude = saude;
    }

    @Override
    public Double tax() {
        if (getRendaAnual() < 20000.0) {
            return getRendaAnual() * 0.15 - Saude * 0.5;
        } else {
            return getRendaAnual() * 0.25 - Saude * 0.5;
        }
    }
}