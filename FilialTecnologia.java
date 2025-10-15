public class FilialTecnologica extends Filial {
    private int projetosAtivos;

    public FilialTecnologica(String nome, String cidade, int numeroFuncionarios, int projetosAtivos) {
        super(nome, cidade, numeroFuncionarios);
        this.projetosAtivos = projetosAtivos;
    }

    @Override
    public void calcularDesempenho() {
        System.out.println("Desempenho tecnológico: " + projetosAtivos + " projetos em andamento.");
    }
  
    public void atualizarSistema() {
        System.out.println("Sistema atualizado com sucesso na filial " + nome + ".");
    }
}
