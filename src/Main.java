import funcionarios.*;

public class Main {
    public static void main(String[] args) {
        Payable[] pagamentos = new Payable[5];

        try {
            pagamentos[0] = new FuncionarioAssalariado("Ana", "Silva", "12345678900", 1500.00);
            pagamentos[1] = new FuncionarioHorista("Bruno", "Souza", "98765432100", 20.00, 43); // Vai lançar exceção
            pagamentos[2] = new FuncionarioComissionado("Carlos", "Pereira", "11223344556", 10000.00, 0.10);
            pagamentos[3] = new FuncionarioAssalariadoComissionado("Daniela", "Oliveira", "99887766554", 5000.00, 0.05, 1200.00);
            pagamentos[4] = new Invoice("Mouse Gamer", 2, 150.00);
        } catch (HorasExtrasException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        System.out.println("\n======= Folha de Pagamentos =======");
        for (Payable p : pagamentos) {
            if (p != null) {
                System.out.println("-------------------------------");
                System.out.println(p.toString());
                System.out.printf("Valor a pagar: R$ %.2f\n", p.calcularSalario());
            }
        }
    }
}
