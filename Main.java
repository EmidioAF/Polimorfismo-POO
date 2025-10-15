public class Main {
    public static void main(String[] args) {
        // Criando objetos polimórficos
        Filial f1 = new FilialComercial("Comercial Sul", "Curitiba", 50, 120000.0);
        Filial f2 = new FilialIndustrial("Industrial Norte", "Joinville", 200, 3000);
        Filial f3 = new FilialTecnologica("Tech Oeste", "São Paulo", 80, 5);

        System.out.println("== Desempenho das filiais ==");
        exibirDesempenho(f1);
        exibirDesempenho(f2);
        exibirDesempenho(f3);

        System.out.println("\n== Métodos específicos de cada filial ==");
        if (f1 instanceof FilialComercial) {
            ((FilialComercial) f1).promoverVenda();
        }
        if (f2 instanceof FilialIndustrial) {
            ((FilialIndustrial) f2).realizarManutencao();
        }
        if (f3 instanceof FilialTecnologica) {
            ((FilialTecnologica) f3).atualizarSistema();
        }
    }

    public static void exibirDesempenho(Filial filial) {
        filial.calcularDesempenho(); // Chamada polimórfica
    }
}
