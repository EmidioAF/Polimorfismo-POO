public class Filial {
    protected String nome;
    protected String cidade;
    protected int numeroFuncionarios;

    public Filial() {
        this.nome = "Desconhecido";
        this.cidade = "Indefinida";
        this.numeroFuncionarios = 0;
    }

    public Filial(String nome, String cidade, int numeroFuncionarios) {
        this.nome = nome;
        this.cidade = cidade;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void exibirInformacoes() {
        System.out.println("Filial: " + nome + " | Cidade: " + cidade + 
                           " | Funcionários: " + numeroFuncionarios);
    }

    public void calcularDesempenho() {
        System.out.println("Desempenho geral da filial.");
    }
}
