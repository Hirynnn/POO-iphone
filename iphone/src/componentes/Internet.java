package componentes;
public class Internet {

    private String link;

    public void inserirLink(String link) {
        this.link = link;
    }

    public void exibirLink() {
        System.out.println("Página aberta: " + link);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagína!");
    }

    public void novaAba() {
        System.out.println("Abrindo nova aba! ");
    }

}
