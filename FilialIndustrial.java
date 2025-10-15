public class FilialIndustrial extends Filial {
    private int producaoMensal;

    public FilialIndustrial(String nome, String cidade, int numeroFuncionarios, int producaoMensal) {
        super(nome, cidade, numeroFuncionarios);
        this.producaoMensal = producaoMensal;
    }
  
    @Override
    public void calcularDesempenho() {
        System.out.println("Desempenho industrial: " + producaoMensal + " unidades produzidas/mês.");
    }

    public void realizarManutencao() {
        System.out.println("Manutenção programada na linha de produção da filial " + nome + ".");
    }
}
