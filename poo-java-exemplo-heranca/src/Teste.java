
// Definindo a classe principal 'Teste'
public class Teste {

    // Metodo principal para testar a herança
    public static void main(String[] args) {

        System.out.println("\n-----------------------------------\n");

        // Criando um objeto do tipo 'CarroPopular' utilizando o construtor
        CarroPopular carro01 = new CarroPopular("Chevrolet", "Celta", "Prata", 2000, "Acessível e econômico.");
        carro01.exibirInformacoes();
        carro01.beneficio();
        carro01.testar();

        System.out.println("\n-----------------------------------\n");

        // Criando um objeto do tipo 'CarroEsportivo' utilizando o construtor
        CarroEsportivo carro02 = new CarroEsportivo("Lamborghini", "Aventador", "Verde", 2011, "Desempenho e performance.");
        carro02.exibirInformacoes();
        carro02.beneficio();
        carro02.testar();

        System.out.println("\n-----------------------------------\n");

        // Criando um objeto do tipo 'CarroDeLuxo' utilizando o construtor
        CarroDeLuxo carro03 = new CarroDeLuxo("Mercedes-Benz", "G-Class", "Azul", 2018, "Conforto e sofisticação.");
        carro03.exibirInformacoes();
        carro03.beneficio();
        carro03.testar();

        System.out.println("\n-----------------------------------\n");
    }

}
