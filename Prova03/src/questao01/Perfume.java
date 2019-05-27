package questao01;

public class Perfume {
    private static int id = 0;
    private String nome;
    private float preco;
    private String linha;
    private float valor_fabrica;
    private float valor_matriz;
    private float valor_loja;

    public Perfume(String nome, float preco, String linha) {
        this.nome = nome;
        this.preco = preco;
        this.linha = linha;
        this.id += 1;
    }
    
    

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Perfume.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public float getValor_fabrica() {
        return valor_fabrica;
    }

    public void setValor_fabrica(float valor_fabrica) {
        this.valor_fabrica = valor_fabrica;
    }

    public float getValor_matriz() {
        return valor_matriz;
    }

    public void setValor_matriz(float valor_matriz) {
        this.valor_matriz = valor_matriz;
    }

    public float getValor_loja() {
        return valor_loja;
    }

    public void setValor_loja(float valor_loja) {
        this.valor_loja = valor_loja;
    }
    
    
    
    
    
    
}
