package funcionarios;

public class FuncionarioHorista extends Funcionario {
    private double salarioPorHora;
    private double horasTrabalhadas;

    public FuncionarioHorista(String primeiroNome, String ultimoNome, String numeroPIS, double salarioPorHora, double horasTrabalhadas) throws HorasExtrasException {
        super(primeiroNome, ultimoNome, numeroPIS);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;

        double horasExtras = horasTrabalhadas > 40 ? horasTrabalhadas - 40 : 0;
        if (horasExtras > 2) {
            throw new HorasExtrasException("Mais de 2h extras no dia. Possível problema trabalhista.");
        }
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
