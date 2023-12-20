package entities;

public class PessoaJuridica extends Contribuintes {

    private int Funcionarios;

    public PessoaJuridica(String name, Double rendaAnual) {
        super(name, rendaAnual);
    }

    public PessoaJuridica(String name, Double rendaAnual, int funcionarios) {
        super(name, rendaAnual);
        Funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return Funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        Funcionarios = funcionarios;
    }

    @Override
    public Double tax() {
        if (Funcionarios > 10) {
            return getRendaAnual() * 0.14;
        }
        else {
            return getRendaAnual() * 0.16;
        }
    }
}
