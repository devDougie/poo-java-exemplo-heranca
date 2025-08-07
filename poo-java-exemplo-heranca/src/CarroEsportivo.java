
// Definindo a Subclasse 'CarroEsportivo'
public class CarroEsportivo extends Carro {

    // Atributo específico para carros esportivos
    String beneficio02;

    // Metodo construtor para inicializar um novo objeto da classe 'CarroEsportivo'
    public CarroEsportivo(String marca, String modelo, String cor, int ano, String beneficio02) {
        super(marca, modelo, cor, ano);
        this.beneficio02 = beneficio02; // Inicializa o atributo beneficio02
    }

    // Sobrescreve o metodo 'testar' para adicionar comportamento específico
    @Override
    public void testar() {
        System.out.println("O carro esportivo " + marca + " " + modelo + " está realizando test-drive.");
    }

    // Metodo específico para carros esportivos
    public void beneficio() {
        System.out.println("Benefício: " + beneficio02);
    }

}
