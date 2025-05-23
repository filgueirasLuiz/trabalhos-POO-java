package funcionarios;
// não pode ser instanciada diretamente, serve como BASE
public abstract class Funcionario implements Payable{
    // variaveis privadas de dentro da classe
    private String primeiroNome;
    private String ultimoNome;
    private String numeroPIS;


    //CONSTRUTOR quando um novo funcionario é criado
    public Funcionario(String primeiroNome, String ultimoNome, String numeroPIS) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.numeroPIS = numeroPIS;
    }
    // mtodo de acesso
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public String getNumeroPIS() {
        return numeroPIS;
    }
    // metodo abstrato, vai ser implementado nas subclasses
    public abstract double calcularSalario();

    // sobrescreve ???
    @Override
    public String toString() {
        return String.format("Nome: %s %s\nPIS: %s", primeiroNome, ultimoNome, numeroPIS);
    }
}
