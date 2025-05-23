package funcionarios;

public class Invoice implements Payable {
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    public Invoice(String descricao, int quantidade, double precoPorItem) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    @Override
    public double calcularSalario() {
        return quantidade * precoPorItem;
    }

    @Override
    public String toString() {
        return String.format("Fatura: %s\nQuantidade: %d\nPreço por Item: R$ %.2f", descricao, quantidade, precoPorItem);
    }
}
