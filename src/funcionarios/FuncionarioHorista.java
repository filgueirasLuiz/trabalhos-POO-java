package funcionarios;

public class FuncionarioHorista extends Funcionario {
    private double salarioPorHora;
    private double horasTrabalhadas;

    // construtor
    public FuncionarioHorista(String primeiroNome, String ultimoNome, String numeroPIS, double salarioPorHora, double horasTrabalhadas) {

        super(primeiroNome, ultimoNome, numeroPIS);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        if (horasTrabalhadas <= 40) {
            return salarioPorHora * horasTrabalhadas;
        } else {
            double horasExtras = horasTrabalhadas - 40;
            return (salarioPorHora * 40) + (salarioPorHora * 1.5 * horasExtras);
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                "\nTipo: Horista\nHoras Trabalhadas: %.2f\nSalário por Hora: R$ %.2f\nSalário Total: R$ %.2f",
                horasTrabalhadas, salarioPorHora, calcularSalario()
        );
    }
}
