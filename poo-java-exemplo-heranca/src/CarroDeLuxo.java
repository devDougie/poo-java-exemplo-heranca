
// Definindo a Subclasse 'CarroDeLuxo'
public class CarroDeLuxo extends Carro {

    // Atributo específico para carros de luxo
    String beneficio03;

    // Metodo construtor para inicializar um novo objeto da classe 'CarroDeLuxo'
    public CarroDeLuxo(String marca, String modelo, String cor, int ano, String beneficio03) {
        super(marca, modelo, cor, ano);
        this.beneficio03 = beneficio03; // Inicializa o atributo beneficio03
    }

    // Sobrescreve o metodo 'testar' para adicionar comportamento específico
    @Override
    public void testar() {
        System.out.println("O carro de luxo " + marca + " " + modelo + " está realizando test-drive.");
    }

    // Metodo específico para carros de luxo
    public void beneficio() {
        System.out.println("Benefício: " + beneficio03);
    }

}
