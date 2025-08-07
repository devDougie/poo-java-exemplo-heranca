
// Definindo a Superclasse 'Carro'
public class Carro {

    // Atributos comuns a todos os objetos carros (herdados pelas subclasses)
    String marca;
    String modelo;
    String cor;
    int ano;

    // Metodo construtor para inicializar um novo objeto da classe 'Carro'
    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca; // Inicializa o atributo marca
        this.modelo = modelo; // Inicializa o atributo modelo
        this.cor = cor; // Inicializa o atributo cor
        this.ano = ano; // Inicializa o atributo ano
    }

    // Metodo comum a todos os objetos carros (herdado pelas subclasses)
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    // Metodo que pode ser sobrescrito pelas classes filhas ou subclasses
    public void testar() {
        System.out.println("O carro está realizando test-drive.");
    }

}
