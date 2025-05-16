package funcionarios;

public class FuncionarioAssalariadoComissionado extends FuncionarioComissionado {
    private double salarioBase;

    public FuncionarioAssalariadoComissionado(String primeiroNome, String ultimoNome, String numeroPIS, double vendasBrutas, double taxaComissao, double salarioBase) {
        super(primeiroNome, ultimoNome, numeroPIS, vendasBrutas, taxaComissao);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        double salarioComissao = super.calcularSalario();
        double salarioBaseAjustado = salarioBase * 1.10; // Aumento de 10%
        return salarioBaseAjustado + salarioComissao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "\nTipo: Assalariado Comissionado\nSalário Base (com 10%% de aumento): R$ %.2f\nSalário Total: R$ %.2f",
                salarioBase * 1.10, calcularSalario()
        );
    }
}
