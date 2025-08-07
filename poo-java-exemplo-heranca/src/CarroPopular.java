
// Definindo a Subclasse 'CarroPopular'
public class CarroPopular extends Carro {

    // Atributo específico para carros populares
    String beneficio01;

    // Metodo construtor para inicializar um novo objeto da classe 'CarroPopular'
    public CarroPopular(String marca, String modelo, String cor, int ano, String beneficio01) {
        super(marca, modelo, cor, ano);
        this.beneficio01 = beneficio01; // Inicializa o atributo beneficio01
    }

    // Sobrescreve o metodo 'testar' para adicionar comportamento específico
    @Override
    public void testar() {
        System.out.println("O carro popular " + marca + " " + modelo + " está realizando test-drive.");
    }

    // Metodo específico para carros populares
    public void beneficio() {
        System.out.println("Benefício: " + beneficio01);
    }

}
