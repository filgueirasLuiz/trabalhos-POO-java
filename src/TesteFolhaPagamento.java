import funcionarios.*;

public class TesteFolhaPagamento {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[] {
            new FuncionarioAssalariado("Ana", "Silva", "12345678900", 1500.00),
            new FuncionarioHorista("Bruno", "Souza", "98765432100", 20.00, 45),
            new FuncionarioComissionado("Carlos", "Pereira", "11223344556", 10000.00, 0.10),
            new FuncionarioAssalariadoComissionado("Daniela", "Oliveira", "99887766554", 5000.00, 0.05, 1200.00)
        };

        for (Funcionario f : funcionarios) {
            System.out.println("===================================");
            System.out.println(f.toString());
            System.out.printf("Salário Calculado: R$ %.2f\n", f.calcularSalario());
        }
    }
}