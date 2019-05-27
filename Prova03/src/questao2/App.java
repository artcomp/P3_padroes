package questao2;


public class App {

   
    public static void main(String[] args) {
        
        Receita r = new Receita();
        r.setNome("angu");
        r.setPrimeiroPasso(new Cozinhar(1f, "litro", "agua", "panela"))
                .setEmSeguida(new Mexer(0.5f, "kg", "fuba", 10))
                .setEmSeguida(new Mexer(1, "livro", "agua", 15))
                .setEmSeguida(new Outro(1,"colocar","colher", "sal"));
        System.out.println("r ="+r.getPrimeiroPasso().quantosPassos());
        System.out.println("Terceiro Passo = "+ r.getPrimeiroPasso().getEmSeguida().getEmSeguida().quantosPassos());

    }
    
}
