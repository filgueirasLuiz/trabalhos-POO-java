package funcionarios;

public class FuncionarioComissionado extends Funcionario {
    private double vendasBrutas;
    private double taxaComissao;

    public FuncionarioComissionado(String primeiroNome, String ultimoNome, String numeroPIS, double vendasBrutas, double taxaComissao) {
        super(primeiroNome, ultimoNome, numeroPIS);
        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return vendasBrutas * taxaComissao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "\nTipo: Comissionado\nVendas Brutas: R$ %.2f\nTaxa de Comissão: %.2f%%\nSalário Total: R$ %.2f",
                vendasBrutas, taxaComissao * 100, calcularSalario()
        );
    }
}
