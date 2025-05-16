package funcionarios;

// herda atributos e metodos de funcionario
public class FuncionarioAssalariado extends Funcionario {
    private double salarioSemanal;

    // Construtor recebe os dados da superclasse (Funcionrio) + salario semanal
    public FuncionarioAssalariado(String primeiroNome, String ultimoNome, String numeroPIS, double salarioSemanal) {
        super(primeiroNome, ultimoNome, numeroPIS);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }

    // sobrescreve funcionario
    @Override
    public String toString() {
        return super.toString() + String.format("\nTipo: Assalariado\nSalário Semanal: R$ %.2f", salarioSemanal);
    }
}
