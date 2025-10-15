public class FilialComercial extends Filial {
    private double faturamentoMensal;

    public FilialComercial(String nome, String cidade, int numeroFuncionarios, double faturamentoMensal) {
        super(nome, cidade, numeroFuncionarios);
        this.faturamentoMensal = faturamentoMensal;
    }
  
    @Override
    public void calcularDesempenho() {
        System.out.println("Desempenho comercial: Faturamento mensal de R$ " + faturamentoMensal);
    }
  
    public void promoverVenda() {
        System.out.println("Campanha de vendas iniciada na filial " + nome + "!");
    }
}
